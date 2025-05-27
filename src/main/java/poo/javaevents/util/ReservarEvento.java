package poo.javaevents.util;

import java.time.LocalDateTime;
import java.util.List;
import poo.javaevents.model.Cliente;
import poo.javaevents.model.Evento;

/** @author Pablo García Hernández */
public class ReservarEvento {

    /** @param args the command line arguments */
    public static void main(String[] args) {
        
        //utilidades
        UtilEventos utilEventos = new UtilEventos();
        UtilReservas utilReservas = new UtilReservas();
        UtilUsuarios utilUsuarios = new UtilUsuarios();
        
        //iniciar sesión cliente
        String correo = "aaaa";
        String clave = "1111";
        boolean sesion = utilUsuarios.iniciarSesion(correo, clave);
        
        if (sesion) {
            Cliente c = utilUsuarios.obtenerClaseCliente(correo);
            
            //mostrar eventos por tipo
            String tipo = "ffiesta";
            List<Evento> listaFiltrada = utilEventos.filtrarTipo(tipo);

            //coger el primer evento de ese tipo
            Evento eventoElegido = listaFiltrada.get(0);

            //reservar el evento
            utilReservas.realizarReserva(c, eventoElegido, LocalDateTime.of(2025,12,1,20,15), 2);
        }
    }

}
