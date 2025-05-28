package poo.javaevents.util;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import poo.javaevents.model.Direccion;
import poo.javaevents.model.Evento;

/** @author Pablo García Hernández */
public class UtilEventos {
        private final List<Evento> eventos;
        private final String fichero = "eventos.dat";
    
    /** Constructor de la clase UtilEventos
     * * En cada instancia se carga la información de los clientes */
    public UtilEventos() {
        List<Evento> cargados = Serializador.cargarDatos(fichero);
        if (cargados == null) {
            cargados = new ArrayList<>();
        }
        this.eventos = cargados;
    }
    
    /** Consular una lista con los eventos
     * @return reservas */
    public List<Evento> consultarEventos() {
        return eventos;
    }
    
    /** Consultar una lista con los eventos de tipo especificado
     * @param tipo
     * @return reservas */
    public List<Evento> filtrarTipo(String tipo) {
        List<Evento> lista = eventos.stream().filter(e -> 
                e.getTipo().equalsIgnoreCase(tipo)).collect(Collectors.toList());
        return lista;
    }
    
    /** Consultar una lista con los eventos que toman lugar en una ciudad especificada
     * @param ciudad
     * @return reservas */
    public List<Evento> filtrarCiudad(String ciudad) {
        List<Evento> lista = eventos.stream().filter(e -> 
                e.getDireccion().getCiudad().equalsIgnoreCase(ciudad)).collect(Collectors.toList());
        return lista;
    }
    
    /** Añadir un nuevo evento
     * @param titulo
     * @param tipo
     * @param dir
     * @param fechas
     * @param precio
     * @param portada */
    public String agregarEvento(String titulo, String tipo, Direccion dir,
            List<LocalDateTime> fechas, double precio, String portada) {
        boolean existe = eventos.stream().anyMatch(e -> e.getTitulo().equalsIgnoreCase(titulo));
        if (existe) {return "YaExiste";
        } 
        else {
            if (titulo == null || titulo.trim().isEmpty() ||
                    tipo == null || tipo.trim().isEmpty() ||
                    portada == null || portada.trim().isEmpty() ||
                    dir == null ||
                    fechas == null) {
                    return "CamposVacios";
            } else {
                Evento e = new Evento(titulo, tipo, dir, fechas, precio, portada);
                eventos.add(e);
                guardar();
                return "Creado";
            }
        }
    }
    
    public void eliminarEvento(String titulo) {
        Evento borrar = null;
        try {
            for (Evento e : eventos) {
                if (e.getTitulo().equals(titulo)) {
                    borrar = e;
                    break;
                }
            }
            if (borrar == null) {
                throw new Exception("Evento " + titulo + " no encontrado.");
            } else {
                eventos.remove(borrar);
                guardar();
            }
        } catch (Exception e) {
            System.err.println("Error al modificar datos: " + e.getMessage());
        }
    }
    
    /** Serializar y guardar los datos de los eventos */
    public void guardar() {
        Serializador.guardarDatos(eventos, fichero);
    }
}
