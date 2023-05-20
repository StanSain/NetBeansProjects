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
public class BaseAlumno {

    public void creaAlumno(ArrayList<Alumno> z) {
        Alumno a1 = new Alumno();
        a1.setNombre("Juan");
        a1.setApellido("Gomez");
        z.add(a1);

        Alumno a2 = new Alumno();
        a2.setNombre("Maria");
        a2.setApellido("Figueroa");
        z.add(a2);

        Alumno a3 = new Alumno();
        a3.setNombre("Pedro");
        a3.setApellido("Luis");
        z.add(a3);

        Alumno a4 = new Alumno();
        a4.setNombre("Silvia");
        a4.setApellido("Martinez");
        z.add(a4);

    }
}
