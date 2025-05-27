package poo.javaevents.util;

import java.time.LocalDateTime;
import java.util.List;
import poo.javaevents.model.Administrador;
import poo.javaevents.model.Direccion;

/** @author Pablo García Hernández */
public class AgregarEventos {

    /** @param args the command line arguments */
    public static void main(String[] args) {
        
        //utilidades
        UtilEventos utilEventos = new UtilEventos();
        
        //iniciar sesión admin
        Administrador miAdmin = new Administrador();
        
        String user = "admin@javaevents.com";
        String pass = "admin";
        boolean adminAccess = miAdmin.loginAdmin(user, pass);
        
        //agregar eventos
        String titulo = "Fiesta en Paterna23";
        String tipo = "ffiesta";
        Direccion dir = new Direccion("Alcor", 1, "Paterna", 54785);
        LocalDateTime fecha = LocalDateTime.of(2025,12,1,20,15);
        double precio = 20.0;
        String portada = "foto.jpg";
        
        if (adminAccess) {
            utilEventos.agregarEvento(titulo, tipo, dir, List.of(fecha), precio, portada);
            utilEventos.guardar();
            System.out.println("Evento agregado");
        }
    }

}
