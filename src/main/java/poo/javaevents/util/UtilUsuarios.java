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
    
    /** Iniciar sesion de un cliente
     * @param correo
     * @param clave
     * @return boolean */
    public boolean iniciarSesion(String correo, String clave) {
        Cliente c = clientes.stream()
                .filter(cliente -> cliente.getCorreo().equals(correo)).
                        findFirst().orElse(null);
        return (c != null && c.getClave().equals(clave));
    }
    
    /** Registrar un nuevo cliente
     * @param nombre
     * @param correo
     * @param clave
     * @param telefono
     * @param direccion
     * @param tarjeta
     * @param vip
     * @return boolean */
    public String registrar(String nombre, String correo, String clave, String telefono, 
            Direccion direccion, TarjetaCredito tarjeta, boolean vip) {
            boolean existe = clientes.stream().anyMatch(c -> c.getCorreo().equalsIgnoreCase(correo));
            if (existe) {return "YaExiste";} 
            else {
                if (nombre == null || nombre.trim().isEmpty() ||
                    correo == null || correo.trim().isEmpty() ||
                    clave == null || clave.trim().isEmpty() ||
                    telefono == null || telefono.trim().isEmpty() ||
                    direccion == null ||
                    tarjeta == null) {
                    return "CamposVacios";
                } else {
                    clientes.add(new Cliente(nombre, correo, clave, telefono, direccion, tarjeta, vip));
                guardar();
                return "RegistroExito";
                }
            }
        }
    
    public Cliente obtenerClaseCliente(String correo) {
        boolean existe = clientes.stream().anyMatch(c -> c.getCorreo().equalsIgnoreCase(correo));
        if (existe) {
            return clientes.stream()
            .filter(c -> c.getCorreo().equalsIgnoreCase(correo))
            .findFirst()
            .orElse(null);
        }
        else {
            return null;
        }
    }
    
    /** Consultar los clientes que hay registrados
     * @return clientes */
    public List<Cliente> consultarClientes() {
        return clientes;
    }
    
    /** Modificar los datos de un cliente
     * @param c
     * @param clave
     * @param telefono
     * @param direccion */
    public void modificarDatos(Cliente c, String clave, String telefono, 
            Direccion direccion) {
        if (!(clave=="")) c.setClave(clave);
        if (!(telefono=="")) c.setTelefono(telefono);
        if (direccion != null) c.setDireccion(direccion);
    }
    
    /** Serializar y guardar los datos de los clientes */
    public void guardar() {
        Serializador.guardarDatos(clientes, fichero);
    }
    
}
