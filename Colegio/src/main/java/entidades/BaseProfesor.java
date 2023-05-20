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
public class BaseProfesor {

    public void creaBaseProfesor(ArrayList<Profesor> z) {
        
        Profesor p1 = new Profesor();
        p1.setNombre("Juan");
        p1.setApellido("Perez");
        p1.setEdad(19);
        z.add(p1);

        Profesor p2 = new Profesor();
        p2.setNombre("Juana");
        p2.setApellido("Gomez");
        p2.setEdad(29);
        z.add(p2);

        Profesor p3 = new Profesor();
        p3.setNombre("Lola");
        p3.setApellido("Salvo");
        p3.setEdad(39);
        z.add(p3);

    }
}
