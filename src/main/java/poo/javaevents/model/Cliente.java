/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package poo.javaevents.model;

/**
 *
 * @author Blocky
 */
public class Cliente extends Usuario {

    private int telefono;
    private Direccion direccin;
    private TarjetaCredito tarjeta;
    private boolean vip;
    /**
     *
     * Constructor Cliente
     */
    public Cliente(String nombre, String correo, String clave, int telefono, Direccion direccin, TarjetaCredito tarjeta, boolean vip) {
        super(nombre, correo, clave);
        this.telefono = telefono;
        this.direccin = direccin;
        this.tarjeta = tarjeta;
        this.vip = vip;
    }
                
    /**
     * Get the value of vip
     *
     * @return the value of vip
     */
    public boolean isVip() {
        return vip;
    }

    /**
     * Set the value of vip
     *
     * @param vip new value of vip
     */
    public void setVip(boolean vip) {
        this.vip = vip;
    }


    /**
     * Get the value of tarjeta
     *
     * @return the value of tarjeta
     */
    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }

    /**
     * Set the value of tarjeta
     *
     * @param tarjeta new value of tarjeta
     */
    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    /**
     * Get the value of direccin
     *
     * @return the value of direccin
     */
    public Direccion getDireccin() {
        return direccin;
    }

    /**
     * Set the value of direccin
     *
     * @param direccin new value of direccin
     */
    public void setDireccin(Direccion direccin) {
        this.direccin = direccin;
    }

    /**
     * Get the value of telefono
     *
     * @return the value of telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Set the value of telefono
     *
     * @param telefono new value of telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }               
}
