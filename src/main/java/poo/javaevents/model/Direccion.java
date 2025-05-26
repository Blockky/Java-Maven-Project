package poo.javaevents.model;

import java.io.Serializable;

/** @author Pablo García Hernández */
public class Direccion implements Serializable {

    // Atributos
    private String calle;
    private int numero;
    private String ciudad;
    private int codigoPostal;
    
    /** Constructor
     * @param calle
     * @param numero
     * @param ciudad
     * @param codigoPostal */
    public Direccion(String calle, int numero, String ciudad, int codigoPostal) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }
    
    // Getters y setters
    
    /** Get the value of codigoPostal
     * @return the value of codigoPostal */
    public int getCodigoPostal() {
        return codigoPostal;
    }
    /** Set the value of codigoPostal
     * @param codigoPostal new value of codigoPostal */
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    /**
     * Get the value of ciudad
     * @return the value of ciudad
     */
    public String getCiudad() {
        return ciudad;
    }
    /**
     * Set the value of ciudad
     * @param ciudad new value of ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    /**
     * Get the value of numero
     * @return the value of numero
     */
    public int getNumero() {
        return numero;
    }
    /**
     * Set the value of numero
     * @param numero new value of numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    /**
     * Get the value of calle
     * @return the value of calle
     */
    public String getCalle() {
        return calle;
    }
    /**
     * Set the value of calle
     * @param calle new value of calle
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }
}
