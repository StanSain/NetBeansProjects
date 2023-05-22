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

    public void iniciaPersona(ArrayList<Persona> arrp, Persona p) {
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
        for (Persona persona : arrp) {
            System.out.println(persona);
        }
    }

    public void personaAdopta(ArrayList<Persona> p, ArrayList<Perro> pr) {
        Scanner leer = new Scanner(System.in);
        for (Persona pe : p) {
            System.out.println(pe.getNombre()+"yaTiene "+pe.isYaTiene());
        }
        System.out.println("nombre #+1");
        int numPersona = leer.nextInt();
        System.out.println("persona elegida: " + p.get(numPersona));

        System.out.println();
        System.out.println("elije a perro : ");
        for (int i = 0; i < pr.size(); i++) {
            System.out.println(pr.get(i).getNombre()+" adoptado "+pr.get(i).isAdoptado());
        }
        System.out.println("perro #");
        int numPerro = leer.nextInt();
        System.out.println("perro elegido " + pr.get(numPerro));

        if (pr.get(numPerro).isAdoptado() == false) {
            pr.get(numPerro).setAdoptado(true);
            p.get(numPersona).setYaTiene(true);
        }
    }

}
