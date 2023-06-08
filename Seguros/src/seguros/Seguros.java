/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seguros;

import entidades.Carro;
import entidades.Cliente;
import entidades.Poliza;
import java.util.ArrayList;
import servicios.SerCarro;
import servicios.SerCliente;
import servicios.SerCuota;
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
        ArrayList<Cliente> ac = new ArrayList<Cliente>();
        SerCliente sc = new SerCliente();
        sc.creaClientes(ac);
        ArrayList<Carro> c = new ArrayList<Carro>();
        SerCarro sca = new SerCarro();
        sca.creaCarro(c);
        SerPoliza sp = new SerPoliza();
      
        ArrayList<Poliza>  arrp = new ArrayList<Poliza>();
        arrp =   sp.iniciaPoliza(ac, c);
        SerCuota serviC = new SerCuota();
        serviC.iniciaCuotas(arrp);
        
        
    }
    
}
