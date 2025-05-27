package poo.javaevents.util;

import poo.javaevents.model.Reserva;
import poo.javaevents.model.Cliente;
import poo.javaevents.model.Evento;
import poo.javaevents.model.Direccion;
import poo.javaevents.model.TarjetaCredito;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.stream.Collectors;


/** @author Pablo García Hernández 
 * Esta clase contiene las utilidades que se pueden hacer con las reservas */
public class UtilReservas {
    private final List<Reserva> reservas;
    private final String fichero = "reservas.dat";

    /** Constructor de la clase UtilReserva
     * * En cada instancia se carga la información de las reservas */
    public UtilReservas() {
        List<Reserva> cargadas = Serializador.cargarDatos(fichero);
        if (cargadas == null) {
            cargadas = new ArrayList<>();
        }
        this.reservas = cargadas;
    }

    /** Realizar una nueva reserva
     * @param cliente
     * @param evento
     * @param fechaSeleccionada
     * @param numeroEntradas */
    public void realizarReserva(Cliente cliente, Evento evento, LocalDateTime fechaSeleccionada, int numeroEntradas) {
            Reserva r = new Reserva(cliente, evento, fechaSeleccionada, numeroEntradas);
            reservas.add(r);
            try {
                generarFactura(r);
                guardar();
            } catch (IOException e) {
                System.err.println("Error al generar la factura: " + e.getMessage());
            }
        }
    
    /** Consular una lista con las reservas hechas
     * @return reservas */
    public List<Reserva> consultarReservas() {
        return reservas.stream().sorted(Comparator.comparing(Reserva::getFechaReserva)).collect(Collectors.toList());
    }
    
    /** Consultar una lista con las reservas de un cliente específico
     * @param cliente
     * @return reservas */
    public List<Reserva> getReservasCliente(Cliente cliente) {
        List<Reserva> lista = new ArrayList<>();
        for (Reserva r : reservas) {
            if (r.getCliente().getCorreo().equals(cliente.getCorreo())) {
                lista.add(r);
            }
        }
        return lista;
    }

    /** Serializar y guardar los datos de las reservas */
    public void guardar() {
        Serializador.guardarDatos(reservas, fichero);
    }

    /** Genera un factura de una reserva en archivo de texto
     * @param r
     * @throws java.io.IOException */
    public void generarFactura(Reserva r) throws IOException {
        Evento e = r.getEvento();
        Direccion de = r.getEvento().getDireccion();
        Cliente c = r.getCliente();
        Direccion dc = r.getCliente().getDireccion();
        TarjetaCredito tc = r.getCliente().getTarjeta();
        // Formatos de las fechas escritas en la factura y en el nombre de la factura
        DateTimeFormatter formatoFechaTxt = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm");        
        DateTimeFormatter formatoFechaFactura = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
        LocalDateTime fechaReserva = r.getFechaReserva();
        LocalDateTime fechaEvento = r.getFechaEvento();
        String fechaReservaTxt = fechaReserva.format(formatoFechaTxt);
        String fechaEventoTxt = fechaEvento.format(formatoFechaTxt);
        String fechaFactura = fechaReserva.format(formatoFechaFactura);  
        String clienteFactura = r.getCliente().getCorreo().replace("@", "_");
        try {
            String carpeta = "facturas";
            File dir = new File(carpeta);
            if (!dir.exists()) {
                dir.mkdir();
            }
            String rutaFactura = carpeta + "/factura(" + clienteFactura + "_" + fechaFactura + ").txt";
            PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(rutaFactura)));
            salida.println("================ Factura JavaEvents ================\n");
            salida.println("Fecha de la reserva: " + fechaReservaTxt + "\n");
            salida.println("Datos del cliente:");
            salida.println(" - Nombre: " + c.getNombre());
            salida.println(" - Correo: " + c.getCorreo());
            salida.println(" - Telf: " + c.getTelefono());
            salida.println(" - Tarjeta de crédito: " + tc.getNumero());
            salida.println(" - Dirección: Calle " + dc.getCalle() + ", " + String.valueOf(dc.getNumero()) + 
                    ", " + dc.getCiudad() + ", " + String.valueOf(dc.getCodigoPostal()) + "\n");
            salida.println("Datos del evento:");
            salida.println(" - Título: " + e.getTitulo());
            salida.println(" - Tipo: " + e.getTipo());
            salida.println(" - Fecha: " + fechaEventoTxt);
            salida.println(" - Dirección: Calle " + de.getCalle() + ", " + String.valueOf(de.getNumero()) + 
                    ", " + de.getCiudad() + ", " + String.valueOf(de.getCodigoPostal()));
            salida.println(" - Valoración: " + String.valueOf(e.getValoracion()) + "\n");
            salida.println("Importe: " + r.getPrecioTotal() + " €\n");
            salida.println("====================================================");
            salida.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        }
    }
}
