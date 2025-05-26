package poo.javaevents.util;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

/** @author Pablo García Hernández */
public class Serializador {
    
    /** Método para serializar y guardar datos en un fichero de datos
     * @param datos
     * @param nombreFichero */
    public static <E> void guardarDatos(List<E> datos, String nombreFichero) {
        File dir = new File("resources");   // Los datos se guardarán en /resources
        if (!dir.exists()) {
            dir.mkdir();    // Si la carpeta no existe, se crea
        }
        String rutaFichero = dir + "/" + nombreFichero;
        try {
            FileOutputStream outFileDatos = new FileOutputStream(rutaFichero);
            ObjectOutputStream outObjDatos = new ObjectOutputStream(outFileDatos);
            outObjDatos.writeObject(datos);
            outFileDatos.close();
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
        String rutaFichero = "resources/" + nombreFichero;
        try {
            FileInputStream inFileDatos = new FileInputStream(rutaFichero);
            ObjectInputStream inObjDatos = new ObjectInputStream(inFileDatos);
            datos = (List<E>) inObjDatos.readObject();
            inFileDatos.close();
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
