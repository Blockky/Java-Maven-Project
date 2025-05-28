package poo.javaevents.model;

/** @author Pablo García Hernández */
public class Administrador extends Usuario {
    
    // 
    public static final String correoAdmin = "admin@javaevents.com";
    public static final String claveAdmin = "admin";
    
    /**  */
    public Administrador() {
        super("Administrador", correoAdmin, claveAdmin);
    }
    
    public boolean loginAdmin(String correo, String clave) {
        return correo.equals(correoAdmin) && clave.equals(claveAdmin);
    }
}
