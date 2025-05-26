package poo.javaevents.model;

/** @author Blocky */
public class Administrador extends Usuario {
    
    // 
    public static final String correo = "admin@javaevents.com";
    public static final String clave = "admin";
    
    /**  */
    public Administrador() {
        super("Administrador", correo, clave);
    }
}
