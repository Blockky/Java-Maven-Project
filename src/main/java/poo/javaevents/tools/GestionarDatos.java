/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.javaevents.tools;

import java.io.*;
import java.util.List;

/** @author Blocky */
public class GestionarDatos {
    public static <T> void guardarDatos(List<T> datos, String rutaArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
            oos.writeObject(datos);
        } catch (IOException e) {
            System.err.println("Error guardando datos: " + rutaArchivo);
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> List<T> cargarDatos(String rutaArchivo) {
        File archivo = new File(rutaArchivo);
        if (!archivo.exists()) return new java.util.ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            return (List<T>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error cargando datos: " + rutaArchivo);
            e.printStackTrace();
            return new java.util.ArrayList<>();
        }
    }
}

