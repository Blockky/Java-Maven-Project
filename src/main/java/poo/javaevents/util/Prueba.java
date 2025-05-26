/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.javaevents.util;

import poo.javaevents.model.*;
import java.util.*;
import java.time.*;

/** @author Blocky */
public class Prueba {

    /** @param args the command line arguments */
    public static void main(String[] args) {
        // 1. Crear cliente
        Cliente c1 = new Cliente("Belen", "ana@gmail.com", "1234", 666111222,
                new Direccion("Gran Vía", 15, "Madrid", 28013),
                new TarjetaCredito("Ana Gómez", "1234567812345678", YearMonth.of(2025, 6)),
                false);

        // 2. Crear eventos
        Evento e1 = new Evento("Concierto de Arde Bogotá", "Concierto",
                new Direccion("Sol", 1, "Madrid", 28013),
                List.of(LocalDateTime.of(2025, 6, 1, 21, 0)),
                40.0, "arde.jpg");

        Evento e2 = new Evento("Final Copa del Rey", "Deporte",
                new Direccion("Chamartín", 2, "Madrid", 28036),
                List.of(LocalDateTime.of(2025, 5, 30, 20, 30)),
                80.0, "copa.jpg");

        Evento e3 = new Evento("El Rey León", "Musical",
                new Direccion("Gran Vía", 75, "Madrid", 28013),
                List.of(LocalDateTime.of(2025, 6, 5, 18, 0), LocalDateTime.of(2025, 6, 6, 18, 0)),
                55.0, "reyleon.jpg");

        Evento e4 = new Evento("Festival Primavera Sound", "Concierto",
                new Direccion("Parc del Fòrum", 1, "Barcelona", 8019),
                List.of(LocalDateTime.of(2025, 6, 10, 17, 0)),
                90.0, "primavera.jpg");

        Evento e5 = new Evento("Obra Hamlet", "Teatro",
                new Direccion("Cervantes", 10, "Valencia", 46001),
                List.of(LocalDateTime.of(2025, 6, 3, 19, 0)),
                30.0, "hamlet.jpg");

        Evento e6 = new Evento("Clásico Barça-Madrid", "Deporte",
                new Direccion("Camp Nou", 1, "Barcelona", 8028),
                List.of(LocalDateTime.of(2025, 6, 12, 20, 0)),
                100.0, "clasico.jpg");

        // Instancia de las utilidades de reservas, 
        UtilReservas utilReserva = new UtilReservas();
        
        utilReserva.realizarReserva(c1, e6, LocalDateTime.of(2025, 6, 12, 20, 0), 2);
        utilReserva.guardar();
    }
}
