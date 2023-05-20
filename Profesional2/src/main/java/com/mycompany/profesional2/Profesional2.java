/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.profesional2;

import entidades.Alumno;
import entidades.Curso;
import java.util.ArrayList;

/**
 *
 * @author John
 */
public class Profesional2 {

    public static void main(String[] args) {
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.profesional2;

import entidades.Alumno;
import entidades.Curso;
import java.util.ArrayList;

/**
 *
 * @author John
 */
public class Profesional2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso c1 = new Curso();
        ArrayList<Alumno> al = new ArrayList<Alumno>();
        
        Alumno a1 = new Alumno();
        a1.setApellido("Perez");
        a1.setNombre("Juan");
        al.add(a1);

        Alumno a2 = new Alumno();
        a2.setApellido("Gomez");
        a2.setNombre("Julian");
        al.add(a2);
        
        Alumno a3 = new Alumno();
        a3.setApellido("Nuñez");
        a3.setNombre("Pedro");
        al.add(a3);
        
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i).getNombre());
            
        }
        
        
        
    }
}






