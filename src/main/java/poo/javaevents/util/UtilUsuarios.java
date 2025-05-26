package poo.javaevents.util;

import java.util.ArrayList;
import java.util.List;

import poo.javaevents.model.Cliente;
import poo.javaevents.model.Direccion;
import poo.javaevents.model.TarjetaCredito;

/** @author Pablo García Hernández */
public class UtilUsuarios {
    private final List<Cliente> clientes;
    private final String fichero = "usuarios.dat";
    
    /** Constructor de la clase UtilUsuario
     * * En cada instancia se carga la información de los clientes */
    public UtilUsuarios() {
        List<Cliente> cargados = Serializador.cargarDatos(fichero);
        if (cargados == null) {
            cargados = new ArrayList<>();
        }
        this.clientes = cargados;
    }
    
    /** Registrar un nuevo cliente
     * @param nombre
     * @param correo
     * @param clave
     * @param telefono
     * @param direccion
     * @param tarjeta
     * @param vip */
    public void registrar(String nombre, String correo, String clave, String telefono, 
            Direccion direccion, TarjetaCredito tarjeta, boolean vip) {
        Cliente c = new Cliente(nombre, correo, clave, telefono, direccion, tarjeta, vip);
        clientes.add(c);
    }
    
    /** Consultar los clientes que hay registrados
     * @return clientes */
    public List<Cliente> consultarClientes() {
        return clientes;
    }
    
    public void modificarDatos(Cliente c, String clave, String telefono, 
            Direccion direccion, TarjetaCredito tarjeta, Boolean vip) {
        if (clave != null) c.setClave(clave);
        if (telefono != null) c.setTelefono(telefono);
        if (direccion != null) c.setDireccion(direccion);
        if (tarjeta != null) c.setTarjeta(tarjeta);
        if (vip != null) c.setVip(vip);
    }
    
    /** Serializar y guardar los datos de los clientes */
    public void guardar() {
        Serializador.guardarDatos(clientes, fichero);
    }
    
}
