/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package poo.javaevents.util;

import java.util.List;
import poo.javaevents.model.Reserva;

/** @author block */
public class VerReservas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UtilReservas utilReservas = new UtilReservas();
        
        List<Reserva> reservas = utilReservas.consultarReservas();
        reservas.forEach(System.out::println);
    }
}
