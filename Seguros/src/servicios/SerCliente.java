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

    public void creaClientes(ArrayList<Cliente> a) {
        Cliente c1 = new Cliente();
        c1.setNombre("Juan");
        c1.setApellido("Perez");
        c1.setDocumento("DNI 5.602.351");
        c1.setDomicilio("calle oscura 45");
        c1.setTelefono("por tarrito desde la calle");
        a.add(c1);

        Cliente c2 = new Cliente();
        c2.setNombre("Juana");
        c2.setApellido("Gomez");
        c2.setDocumento("DNI 5.425.340");
        c2.setDomicilio("avenida del perro");
        c2.setTelefono("jaifon nuevo");
        a.add(c2);

    }
}
