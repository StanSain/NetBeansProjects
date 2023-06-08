/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author John
 */
public class Simulador {

    public ArrayList<Alumno> creaLaumno(ArrayList<Alumno> ar) {
        String[] nombre = new String[4];
        nombre[0] = "pepe";
        nombre[1] = "toto";
        nombre[2] = "tito";
        nombre[3] = "juana";
        String[] apellido = new String[4];
        apellido[0] = "gomez";
        apellido[1] = "perez";
        apellido[2] = "garcia";
        apellido[3] = "lopez";
        Random rnd = new Random();

        for (int i = 0; i < 4; i++) {
            int indiceNombre = (int) (rnd.nextDouble() * 4);
            int indiceApellido = (int) (rnd.nextDouble() * 4);
            Alumno a = new Alumno();
            String nom = nombre[indiceNombre];
            String ape = apellido[indiceApellido];

            a.setNombre(nom + " " + ape);
            ar.add(a);

        }

        return ar;
    }
}
