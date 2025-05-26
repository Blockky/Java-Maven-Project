package poo.javaevents.util;

import poo.javaevents.model.Reserva;

import java.util.List;

/** @author Pablo García Hernández */
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        UtilReservas utilReservas = new UtilReservas();
        
        List<Reserva> lista = utilReservas.consultarReservas();
        
        for (Reserva r : lista) {
            System.out.println(r.toString());
        }
    }
}
