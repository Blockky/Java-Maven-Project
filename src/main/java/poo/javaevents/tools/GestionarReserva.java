/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package poo.javaevents.tools;

import poo.javaevents.model.Reserva;
import poo.javaevents.model.Cliente;
import poo.javaevents.model.Evento;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** @author Blocky */
public class GestionarReserva {
    private List<Reserva> reservas;

    public GestionarReserva() {
        reservas = GestionarDatos.cargarDatos("datos.dat");
    }

    public void realizarReserva(Cliente cliente, Evento evento, int numeroEntradas) {
        Reserva r = new Reserva(cliente, evento, numeroEntradas);
        reservas.add(r);
        generarFactura(r);
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

    public void guardar(String archivo) {
        GestionarDatos.guardarDatos(reservas, archivo);
    }

    private void generarFactura(Reserva r) {
        String nombreArchivo = "factura_" + r.getCliente().getCorreo().replace("@", "_") + "_" +
                r.getFechaReserva().toLocalDate() + ".txt";
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            writer.write("Factura JavaEvents\n");
            writer.write("Fecha: " + r.getFechaReserva() + "\n");
            writer.write("Cliente: " + r.getCliente().getNombre() + "\n");
            writer.write("Evento: " + r.getEvento().getTitulo() + "\n");
            writer.write("Importe: " + r.getPrecioTotal() + "€\n");
        } catch (IOException e) {
            System.err.println("Error generando factura");
            e.printStackTrace();
        }
    }
}
