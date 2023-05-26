/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author John
 */
public class BasePersona {

    public void basePersona(ArrayList<Persona> arrp) {
        Persona p1 = new Persona();
        p1.setNombre("Pedro Picapiedras");
        arrp.add(p1);
        Persona p2 = new Persona();
        p2.setNombre("Vilma Picapiedras");
        arrp.add(p2);
        Persona p3 = new Persona();
        p3.setNombre("Pablo Marmol");
        arrp.add(p3);
        Persona p4 = new Persona();
        p4.setNombre("Violeta Ribas");
        arrp.add(p4);
    }
}
