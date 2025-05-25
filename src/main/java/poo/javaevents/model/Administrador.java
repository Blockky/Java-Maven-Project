/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package poo.javaevents.model;
/**
 * @author Blocky
 */
public class Administrador extends Usuario {
    /**
    * @author Blocky
    */
    public static final String correo = "admin@javaevents.com";
    public static final String clave = "admin";
    
    /**
     * Constructor de la clase Administrador con los atributos especificados
     */
    public Administrador() {
        super("Administrador", correo, clave);
    }

}
