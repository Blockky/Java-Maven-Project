package poo.javaevents.util;

import java.time.YearMonth;
import poo.javaevents.model.Direccion;
import poo.javaevents.model.TarjetaCredito;

/** @author Pablo García Hernández */
public class Registrarse {

    /** @param args the command line arguments */
    public static void main(String[] args) {
        
        //utilidades
        UtilUsuarios utilUsuarios = new UtilUsuarios();
        
        // Registrarse
        String nombre = "calors";
        String correo = "a@mail.com";
        String clave = "123456";
        String telf = "999 99 99 99";
        Direccion dir = new Direccion("Sol", 8, "Alcala", 28888);
        TarjetaCredito tc = new TarjetaCredito("calors", "1111", YearMonth.of(2050,12));
        boolean vip = true;
        
        boolean registro = utilUsuarios.registrar(nombre, correo, clave, telf, dir, tc, vip);
        if (registro) {
            utilUsuarios.guardar();
            System.out.println("Usuario " + correo + "registrado correctamente");
        } else {
            System.out.println("Usuario no registrado!");
        }
    }
}
