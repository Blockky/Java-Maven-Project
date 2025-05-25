/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package poo.javaevents.model;

import java.time.LocalDateTime;
import java.io.Serializable;

public class Reserva implements Serializable {

    private Cliente cliente;
    private Evento evento;
    private LocalDateTime fechaReserva;
    private int numeroEntradas;
    private double precioTotal;

    public Reserva(Cliente cliente, Evento evento, int numeroEntradas) {
        this.cliente = cliente;
        this.evento = evento;
        this.fechaReserva = LocalDateTime.now();
        this.numeroEntradas = numeroEntradas;
        double precioEntradas = evento.getPrecioEntrada() * numeroEntradas;
        this.precioTotal = cliente.isVip() ? precioEntradas * 0.9 : precioEntradas;
    }
    
    /**
     * Get the value of precioTotal
     * @return the value of precioTotal
     */
    public double getPrecioTotal() {
        return precioTotal;
    }
    /**
     * Set the value of precioTotal
     * @param precioTotal new value of precioTotal
     */
    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    /**
     * Get the value of numeroEntradas
     * @return the value of numeroEntradas
     */
    public int getNumeroEntradas() {
        return numeroEntradas;
    }
    /**
     * Set the value of numeroEntradas
     * @param numeroEntradas new value of numeroEntradas
     */
    public void setNumeroEntradas(int numeroEntradas) {
        this.numeroEntradas = numeroEntradas;
    }
    /**
     * Get the value of fechaReserva
     * @return the value of fechaReserva
     */
    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }
    /**
     * Set the value of fechaReserva
     * @param fechaReserva new value of fechaReserva
     */
    public void setFechaReserva(LocalDateTime fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
    /**
     * Get the value of evento
     * @return the value of evento
     */
    public Evento getEvento() {
        return evento;
    }
    /**
     * Set the value of evento
     * @param evento new value of evento
     */
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    /**
     * Get the value of cliente
     * @return the value of cliente
     */
    public Cliente getCliente() {
        return cliente;
    }
    /**
     * Set the value of cliente
     * @param cliente new value of cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
