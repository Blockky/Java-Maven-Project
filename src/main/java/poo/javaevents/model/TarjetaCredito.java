/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package poo.javaevents.model;

import java.time.LocalDate;

/**
 * @author Blocky
 */
public class TarjetaCredito {

    private String titular;
    private int numero;
    private LocalDate fechaCaducidad;

    /**
     * Get the value of fechaCaducidad
     * @return the value of fechaCaducidad
     */
    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }
    /**
     * Set the value of fechaCaducidad
     * @param fechaCaducidad new value of fechaCaducidad
     */
    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
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
