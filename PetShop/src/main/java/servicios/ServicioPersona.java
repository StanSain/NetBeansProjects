/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class ServicioPersona {

    public void muestraPersonas(ArrayList<Persona> arrp) {
        for (int i = 0; i < arrp.size(); i++) {
            System.out.println(arrp.get(i).getNombre() + " ya tiene " + arrp.get(i).isYaTiene());
        }
        

    }


}
