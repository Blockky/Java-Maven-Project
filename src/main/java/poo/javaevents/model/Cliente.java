package poo.javaevents.model;

import java.io.Serializable;

/** @author Blocky */
public class Cliente extends Usuario implements Serializable {
    
    // Atributos
    private int telefono;
    private Direccion direccion;
    private TarjetaCredito tarjeta;
    private boolean vip;
    
    /** Constructor
     * @param nombre
     * @param correo
     * @param clave
     * @param telefono
     * @param direccion
     * @param tarjeta
     * @param vip */
    public Cliente(String nombre, String correo, String clave, int telefono, 
            Direccion direccion, TarjetaCredito tarjeta, boolean vip) {
        super(nombre, correo, clave);
        this.telefono = telefono;
        this.direccion = direccion;
        this.tarjeta = tarjeta;
        this.vip = vip;
    }
    
    // Getters y setters
    
    /** Get the value of vip
     * @return the value of vip */
    public boolean isVip() {
        return vip;
    }
    /** Set the value of vip
     * @param vip new value of vip */
    public void setVip(boolean vip) {
        this.vip = vip;
    }
    /** Get the value of tarjeta
     * @return the value of tarjeta */
    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }
    /** Set the value of tarjeta
     * @param tarjeta new value of tarjeta */
    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
    }
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
    /** Get the value of telefono
     * @return the value of telefono */
    public int getTelefono() {
        return telefono;
    }
    /** Set the value of telefono
     * @param telefono new value of telefono */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }               
}
