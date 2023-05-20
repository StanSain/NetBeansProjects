/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Alumno;
import entidades.Curso;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class ServicioAlumno {

//    public void creaAlumno(Alumno a, ArrayList<Curso> cur) {
//        ServicioCurso sc = new ServicioCurso();
//        Scanner leer = new Scanner(System.in);
//        System.out.println("nombre alumno");
//        System.out.println("alumno apellido");
//        System.out.println("nombre");
//        a.setNombre(leer.next());
//        System.out.println("apellido");
//        a.setApellido(leer.next());
//        sc.muestraCursos(cur);
//        System.out.println("curso # ");
//        int orden = leer.nextInt();
//        if ((orden > 0) && (orden < cur.size())) {
//            a.setCur(cur.get(orden));
//        } else {
//            System.out.println("curso # ");
//            orden = leer.nextInt();
//        }

//    }
    public void muestraAlumnos(ArrayList<Alumno> z){
        for (int i = 0; i < z.size(); i++) {
            System.out.println(z.get(i).getNombre()+" "+z.get(i).getApellido());

        }
    }
}
