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
public class BasePerro {

    public void basePerros(ArrayList<Perro> p) {
        Perro p1 = new Perro();
        p1.setNombre("Pepe");
        p.add(p1);

        Perro p2 = new Perro();
        p2.setNombre("Terry");
        p.add(p2);

        Perro p3 = new Perro();
        p3.setNombre("Pipo");
        p.add(p3);
        
        Perro p4 = new Perro();
        p4.setNombre("Toby");
        p.add(p4);

        Perro p5 = new Perro();
        p5.setNombre("Sushi");
        p.add(p5);
    }
}
