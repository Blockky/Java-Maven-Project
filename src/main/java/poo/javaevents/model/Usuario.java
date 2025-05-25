/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package poo.javaevents.model;

import java.io.Serializable;

/**
 * @author Blocky
 * 
 * Clase abstracta que contiene los atributos comúnes de todos los Usuarios de la App
 */
public abstract class Usuario implements Serializable {
   
    private String nombre;
    private String correo;
    private String clave;
    
    /**
     * Contructor de la clase Usuario
     */
    public Usuario(String nombre, String correo, String clave) {
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
    }
    
    public boolean iniciarSesion(String clave) {
        return this.clave.equals(clave);
    }
    
    /**
     * Get the value of clave
     * @return the value of clave
     */
    public String getClave() {
        return clave;
    }
    /**
     * Set the value of clave
     * @param clave new value of clave
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
    /**
     * Get the value of correo
     * @return the value of correo
     */
    public String getCorreo() {
        return correo;
    }
    /**
     * Set the value of correo
     * @param correo new value of correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    /**
     * Get the value of nombre
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Set the value of nombre
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
