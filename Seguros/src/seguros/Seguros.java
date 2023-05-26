/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seguros;

import entidades.Cliente;
import java.util.ArrayList;
import servicios.SerCliente;
import servicios.SerPoliza;

/**
 *
 * @author John
 */
public class Seguros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cliente c = new Cliente();
        SerCliente sc = new SerCliente();
        c = sc.creaClientes();
        SerPoliza sp = new SerPoliza();
        sp.iniciaPoliza(c);
        

    }

}
