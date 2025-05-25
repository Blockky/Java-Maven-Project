/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package poo.javaevents.tools;

import poo.javaevents.model.Reserva;

import java.util.List;

/** @author block */
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestionarReserva gestorReservas = new GestionarReserva("resources/reservas.dat");
        List<Reserva> listaReservas = gestorReservas.getReservas();

        for (Reserva r : listaReservas) {
            System.out.println("Reserva:");
            System.out.println("- Cliente: " + r.getCliente().getNombre());
            System.out.println("- Evento: " + r.getEvento().getTitulo());
            System.out.println("- Fecha: " + r.getEvento().getFechaHora());
            System.out.println("- Entradas: " + r.getNumeroEntradas());
            System.out.println("- Total: " + r.getPrecioTotal() + "Euros");
            System.out.println("----");
        }
    }

}
