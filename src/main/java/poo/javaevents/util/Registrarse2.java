/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package poo.javaevents.util;

import java.util.List;
import poo.javaevents.model.Cliente;

/** @author block */
public class Registrarse2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UtilUsuarios utilUsuarios = new UtilUsuarios();
        
        List<Cliente> lista = utilUsuarios.consultarClientes();
        
        for (Cliente c : lista) {
            System.out.println(c.toString());
        }
    }

}
