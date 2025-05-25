/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package poo.javaevents.model;

import java.time.YearMonth;
import java.io.Serializable;

/**
 * @author Blocky
 */
public class TarjetaCredito implements Serializable {

    private String titular;
    private String numero;
    private YearMonth fechaCaducidad;

    public TarjetaCredito(String titular, String numero, YearMonth fechaCaducidad) {
        this.titular = titular;
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * Get the value of fechaCaducidad
     * @return the value of fechaCaducidad
     */
    public YearMonth getFechaCaducidad() {
        return fechaCaducidad;
    }
    /**
     * Set the value of fechaCaducidad
     * @param fechaCaducidad new value of fechaCaducidad
     */
    public void setFechaCaducidad(YearMonth fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    /**
     * Get the value of numero
     * @return the value of numero
     */
    public String getNumero() {
        return numero;
    }
    /**
     * Set the value of numero
     * @param numero new value of numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    /**
     * Get the value of titular
     * @return the value of titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Set the value of titular
     * @param titular new value of titular
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }
}
