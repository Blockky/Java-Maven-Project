package poo.javaevents.tools;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.io.File;

/** @author Blocky */
public class GestionarDatos {
    
    /** Método para guardar datos serializados
     * @param datos
     * @param nombreFichero */
    public static <E> void guardarDatos(List<E> datos, String nombreFichero) {
        File dir = new File("resources");
        if (!dir.exists()) {
            dir.mkdir();
        }
        String rutaFichero = dir + "/" + nombreFichero;
        try {
            FileOutputStream outFileDatos = new FileOutputStream(rutaFichero);
            ObjectOutputStream outObjDatos = new ObjectOutputStream(outFileDatos);
            outObjDatos.writeObject(datos);
        } catch (IOException e) {
            System.err.println("Error guardando datos: " + rutaFichero);
        }
    }

    /** Método para cargar datos serializados
     * @param nombreFichero
     * @return lista de objetos de datos seralizados en el fichero especificado
     */
    public static <E> List<E> cargarDatos(String nombreFichero) {
        List<E> datos = new ArrayList<>();
        File dir = new File("resources");
        String rutaFichero = dir + "/" + nombreFichero;
        try {
            FileInputStream inputDatos = new FileInputStream(rutaFichero);
            ObjectInputStream objDatos = new ObjectInputStream(inputDatos);
            datos = (List<E>) objDatos.readObject();
            inputDatos.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return datos;
    }
}
