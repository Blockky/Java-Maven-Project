/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package poo.javaevents.util;

import java.time.YearMonth;

import poo.javaevents.model.Cliente;
import poo.javaevents.model.Direccion;
import poo.javaevents.model.TarjetaCredito;

/** @author block */
public class Registrarse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UtilUsuarios utilUsuarios = new UtilUsuarios();
        
        utilUsuarios.registrar("Belen", "ana@gmail.com", "1234", "666111222",
        new Direccion("Gran Vía", 15, "Madrid", 28013),
        new TarjetaCredito("Ana Gómez", "1234567812345678", YearMonth.of(2025, 6)),
        true);
        
        utilUsuarios.guardar();
    }

}
