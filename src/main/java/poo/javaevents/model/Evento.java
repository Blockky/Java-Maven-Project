package poo.javaevents.model;

import java.util.List;
import java.time.LocalDateTime;
import java.io.Serializable;

/** @author Blocky */
public class Evento implements Serializable {
    
    // Atributos
    private String titulo;
    private String tipo;
    private List<LocalDateTime> fechaHora;
    private double precioEntrada;
    private String portada;
    private double valoracion;
    private Direccion direccion;

    /** Constructor
     * @param titulo
     * @param tipo
     * @param direccion
     * @param fechaHora
     * @param precioEntrada
     * @param portada */
    public Evento(String titulo, String tipo, Direccion direccion, 
            List<LocalDateTime> fechaHora, double precioEntrada, String portada) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.fechaHora = fechaHora;
        this.precioEntrada = precioEntrada;
        this.portada = portada;
        this.valoracion = 0.0;
        this.direccion = direccion;
    }
    
    // Getters y setters
    
    /** Get the value of direccion
     * @return the value of direccion */
    public Direccion getDireccion() {
        return direccion;
    }
    /** Set the value of direccion
     * @param direccion new value of direccion */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    /** Get the value of valoracion
     * @return the value of valoracion */
    public double getValoracion() {
        return valoracion;
    }
    /** Set the value of valoracion
     * @param valoracion new value of valoracion */
    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }
    /** Get the value of portada
     * @return the value of portada */
    public String getPortada() {
        return portada;
    }
    /** Set the value of portada
     * @param portada new value of portada */
    public void setPortada(String portada) {
        this.portada = portada;
    }
    /** Get the value of precioEntrada
     * @return the value of precioEntrada */
    public double getPrecioEntrada() {
        return precioEntrada;
    }
    /** Set the value of precioEntrada
     * @param precioEntrada new value of precioEntrada */
    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }
    /** Get the value of fechaHora
     * @return the value of fechaHora */
    public List<LocalDateTime> getFechaHora() {
        return fechaHora;
    }
    /** Set the value of fechaHora
     * @param fechaHora new value of fechaHora */
    public void setFechaHora(List<LocalDateTime> fechaHora) {
        this.fechaHora = fechaHora;
    }
    /** Get the value of tipo
     * @return the value of tipo */
    public String getTipo() {
        return tipo;
    }
    /** Set the value of tipo
     * @param tipo new value of tipo */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /** Get the value of titulo
     * @return the value of titulo */
    public String getTitulo() {
        return titulo;
    }
    /** Set the value of titulo
     * @param titulo new value of titulo */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
