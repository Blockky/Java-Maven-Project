package poo.javaevents.model;

import java.time.LocalDateTime;
import java.io.Serializable;

/** @author Pablo García Hernández */
public class Reserva implements Serializable {

    // Atributos
    private Cliente cliente;
    private Evento evento;
    private LocalDateTime fechaEvento;
    private LocalDateTime fechaReserva;
    private int numeroEntradas;
    private double precioFinal;

    /** Constructor
     * @param cliente
     * @param evento
     * @param fechaSeleccionada
     * @param numeroEntradas */
    public Reserva(Cliente cliente, Evento evento, LocalDateTime fechaSeleccionada, int numeroEntradas) {
        if (!evento.getFechaHora().contains(fechaSeleccionada)) {    // La fecha elegida debe de ser válida
            throw new IllegalArgumentException("La fecha seleccionada no es válida para el evento");
        }
        this.cliente = cliente;
        this.evento = evento;        
        this.fechaReserva = LocalDateTime.now();
        this.fechaEvento = fechaSeleccionada;
        this.numeroEntradas = numeroEntradas;
        double precioTotal = evento.getPrecioEntrada() * numeroEntradas;
        if (cliente.isVip()) {  // Si el cliente es vip, se aplica un descuento al precio total
            this.precioFinal = precioTotal * 0.9;
        } else {
            this.precioFinal = precioTotal;
        }
    }
    
    // Getters y setters
    
    /** Get the value of precioTotal
     * @return the value of precioTotal */
    public double getPrecioTotal() {
        return precioFinal;
    }
    /** Set the value of precioTotal
     * @param precioTotal new value of precioTotal */
    public void setPrecioTotal(double precioTotal) {
        this.precioFinal = precioTotal;
    }
    /** Get the value of numeroEntradas
     * @return the value of numeroEntradas */
    public int getNumeroEntradas() {
        return numeroEntradas;
    }
    /** Set the value of numeroEntradas
     * @param numeroEntradas new value of numeroEntradas */
    public void setNumeroEntradas(int numeroEntradas) {
        this.numeroEntradas = numeroEntradas;
    }
    /** Get the value of fechaEvento
     * @return the value of fechaEvento */
    public LocalDateTime getFechaEvento() {
        return fechaEvento;
    }
    /** Set the value of fechaEvento
     * @param fechaEvento new value of fechaEvento */
    public void setFechaEvento(LocalDateTime fechaEvento) {
        this.fechaEvento = fechaEvento;
    }
    /** Get the value of fechaReserva
     * @return the value of fechaReserva */
    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }
    /** Set the value of fechaReserva
     * @param fechaReserva new value of fechaReserva */
    public void setFechaReserva(LocalDateTime fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
    /** Get the value of evento
     * @return the value of evento */
    public Evento getEvento() {
        return evento;
    }
    /** Set the value of evento
     * @param evento new value of evento */
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    /** Get the value of cliente
     * @return the value of cliente */
    public Cliente getCliente() {
        return cliente;
    }
    /** Set the value of cliente
     * @param cliente new value of cliente */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
