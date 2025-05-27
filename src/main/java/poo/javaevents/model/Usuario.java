package poo.javaevents.model;

import java.io.Serializable;

/** @author Pablo García Hernández
 * * Clase abstracta que contiene los atributos comúnes de todos los Usuarios de la App */
public abstract class Usuario implements Serializable {
   
    // Atributos
    private String nombre;
    private String correo;
    private String clave;
    
    /** Constructor
     * @param nombre
     * @param correo
     * @param clave */
    public Usuario(String nombre, String correo, String clave) {
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
    }
    
    // Getters y setters
    
    /** Get the value of clave
     * @return the value of clave */
    public String getClave() {
        return clave;
    }
    /** Set the value of clave
     * @param clave new value of clave */
    public void setClave(String clave) {
        this.clave = clave;
    }
    /** Get the value of correo
     * @return the value of correo */
    public String getCorreo() {
        return correo;
    }
    /** Set the value of correo
     * @param correo new value of correo */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    /** Get the value of nombre
     * @return the value of nombre */
    public String getNombre() {
        return nombre;
    }
    /** Set the value of nombre
     * @param nombre new value of nombre */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
