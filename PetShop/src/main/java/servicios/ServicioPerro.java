/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class ServicioPerro {

    public void iniciaPerro(ArrayList<Perro> parr, Perro p) {
        Scanner leer = new Scanner(System.in);
        p.setNombre(leer.next());
        parr.add(p);
    }

    public void muestraPerros(ArrayList<Perro> parr) {
        for (Perro perro : parr) {
            System.out.println(perro.getNombre() + " adoptado " + perro.isAdoptado());
        }
    }
}
