package poo.javaevents.tools;

import java.io.File;
import poo.javaevents.model.Reserva;
import poo.javaevents.model.Cliente;
import poo.javaevents.model.Evento;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/** @author Blocky */
public class GestionarReserva {
    private List<Reserva> reservas;

    /** Constructor de la clase GestionarReserva
     * * En cada instancia se carga la información de las reservas
     */
    public GestionarReserva() {
        String fichero = "reservas.dat";
        List<Reserva> cargadas = GestionarDatos.cargarDatos(fichero);
        if (cargadas != null) {
            this.reservas = cargadas;
        } else {
            cargadas = new ArrayList<>();
            this.reservas = cargadas;
        } 
        reservas = GestionarDatos.cargarDatos(fichero);
    }

    public void realizarReserva(Cliente cliente, Evento evento, int numeroEntradas) {
            Reserva r = new Reserva(cliente, evento, numeroEntradas);
            reservas.add(r);
            try {
                generarFactura(r);
            } catch (IOException e) {
                System.err.println("Error al generar la factura: " + e.getMessage());
            }
        }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public List<Reserva> getReservasCliente(Cliente cliente) {
        List<Reserva> result = new ArrayList<>();
        for (Reserva r : reservas) {
            if (r.getCliente().getCorreo().equals(cliente.getCorreo())) {
                result.add(r);
            }
        }
        return result;
    }

    public void guardar() {
        GestionarDatos.guardarDatos(reservas, "reservas.dat");
    }

    public void generarFactura(Reserva r) throws IOException {
        LocalDateTime fechaReserva = r.getFechaReserva();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("ddMMyyyyHHmm");      
        String fechaFactura = fechaReserva.format(formatoFecha);  
        String clienteFactura = r.getCliente().getCorreo().replace("@", "_");
        String rutaFactura = "./facturas/factura_" + clienteFactura + "_" + fechaFactura + ".txt";
        try {
            //Si no existe el directorio Facturas, lo creamos
            File dir = new File("facturas");
            if (!dir.exists()) {
                dir.mkdir();
            }
            try (FileWriter writer = new FileWriter(rutaFactura)) {
                writer.write("============= Factura JavaEvents =============\n");
                writer.write("Fecha: " + r.getFechaReserva() + "\n");
                writer.write("Cliente: " + r.getCliente().getNombre() + "\n");
                writer.write("Evento: " + r.getEvento().getTitulo() + "\n");
                writer.write("Importe: " + r.getPrecioTotal() + " €\n");
                writer.write("==============================================");
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        }
    }
}
