/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Cliente;
import java.util.ArrayList;

/**
 *
 * @author John
 */
public class SerCliente {
    public Cliente  creaClientes(){
        Cliente c1 = new Cliente();
        c1.setNombre("Juan");
        c1.setApellido("Perez");
        c1.setDocumento("DNI 5.602.351" );
        c1.setDomicilio("calle oscura 45");
        c1.setTelefono("por tarrito desde la calle");
        
        return c1;
    }
}
