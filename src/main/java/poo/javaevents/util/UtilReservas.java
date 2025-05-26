package poo.javaevents.util;

import poo.javaevents.model.Reserva;
import poo.javaevents.model.Cliente;
import poo.javaevents.model.Evento;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/** @author Blocky 
 * Esta clase contiene las utilidades que se pueden hacer con las reservas */
public class UtilReservas {
    private final List<Reserva> reservas;

    /** Constructor de la clase UtilReserva
     * * En cada instancia se carga la información de las reservas */
    public UtilReservas() {
        String fichero = "reservas.dat";
        List<Reserva> cargadas = Serializador.cargarDatos(fichero);
        if (cargadas == null) {
            cargadas = new ArrayList<>();
        }
        this.reservas = cargadas;
    }

    /** Método para realizar una reserva
     * @param cliente
     * @param evento
     * @param fechaSeleccionada
     * @param numeroEntradas */
    public void realizarReserva(Cliente cliente, Evento evento, LocalDateTime fechaSeleccionada, int numeroEntradas) {
            Reserva r = new Reserva(cliente, evento, fechaSeleccionada, numeroEntradas);
            reservas.add(r);
            try {
                generarFactura(r);
            } catch (IOException e) {
                System.err.println("Error al generar la factura: " + e.getMessage());
            }
        }
    
    /** Método para obtener la lista con las reservas hechas
     * @return reservas */
    public List<Reserva> getReservas() {
        return reservas;
    }
    
    /** Método para obtener la lista de reservas de un cliente específico
     * @param cliente
     * @return reservas */
    public List<Reserva> getReservasCliente(Cliente cliente) {
        List<Reserva> result = new ArrayList<>();
        for (Reserva r : reservas) {
            if (r.getCliente().getCorreo().equals(cliente.getCorreo())) {
                result.add(r);
            }
        }
        return result;
    }

    /** Método para serializar y guardar los datos sobre las reservas */
    public void guardar() {
        Serializador.guardarDatos(reservas, "reservas.dat");
    }

    /** Genera un archivo de texto de la factura de una reserva
     * @param r
     * @throws java.io.IOException */
    public void generarFactura(Reserva r) throws IOException {
        // Formatos de las fechas escritas en la factura y en el nombre de la factura
        DateTimeFormatter formatoFechaTxt = DateTimeFormatter.ofPattern("dd/MM/yyyy");        
        DateTimeFormatter formatoFechaFactura = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
        LocalDateTime fechaReserva = r.getFechaReserva();
        LocalDateTime fechaEvento = r.getFechaEvento();
        String fechaReservaTxt = fechaReserva.format(formatoFechaTxt);
        String fechaEventoTxt = fechaEvento.format(formatoFechaTxt);
        String fechaFactura = fechaReserva.format(formatoFechaFactura);  
        String clienteFactura = r.getCliente().getCorreo().replace("@", "_");
        String rutaFactura = "factura(" + clienteFactura + "_" + fechaFactura + ").txt";
        try {
            File dir = new File("facturas");
            if (!dir.exists()) {
                dir.mkdir();
            }
            PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(rutaFactura)));
            salida.println("=============== Factura JavaEvents ===============\n");
            salida.println("Fecha de reserva: " + fechaReservaTxt + "\n");
            salida.println("Cliente: " + r.getCliente().getNombre() + "\n");
            salida.println("Evento: " + r.getEvento().getTitulo() + "\n");
            salida.println("Fecha del evento: " + fechaEventoTxt + "\n");
            salida.println("Importe: " + r.getPrecioTotal() + " €\n");
            salida.println("==================================================");
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        }
    }
}
