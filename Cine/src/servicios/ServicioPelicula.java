/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class ServicioPelicula {
   public ArrayList<Pelicula> iniciaPeliculas() {
        Scanner leer = new Scanner(System.in);
        ArrayList<Pelicula> pelis = new ArrayList<Pelicula>();

        Pelicula p1 = new Pelicula();
//        System.out.println("titulo");
        p1.setTitulo("La bala loca");
//        System.out.println("director");
        p1.setDirector("El Loco Adams");
//        System.out.println("duracion");
        p1.setDuracion(1.30);
//        System.out.println("edad");
        p1.setEdadMinima(1);
        pelis.add(p1);

        Pelicula p2 = new Pelicula();
//        System.out.println("titulo");
        p2.setTitulo("El Pedo Negro");
//        System.out.println("director");
        p2.setDirector("Juan Perez");
//        System.out.println("duracion");
        p2.setDuracion(2.20);
//        System.out.println("edad");
        p2.setEdadMinima(15);
        pelis.add(p2);

        Pelicula p3 = new Pelicula();
//        System.out.println("titulo");
        p3.setTitulo("La esquina doblada");
//        System.out.println("director");
        p3.setDirector("Mike Tyson");
//        System.out.println("duracion");
        p3.setDuracion(1.15);
//        System.out.println("edad");
        p3.setEdadMinima(15);
        pelis.add(p3);

        Pelicula p4 = new Pelicula();
//        System.out.println("titulo");
        p4.setTitulo("Romanos putos");
//        System.out.println("director");
        p4.setDirector("Jacob Ariel");
//        System.out.println("duracion");
        p4.setDuracion(1.50);
//        System.out.println("edad");
        p4.setEdadMinima(18);
        pelis.add(p4);

        Pelicula p5 = new Pelicula();
//        System.out.println("titulo");
        p5.setTitulo("Negra Noche");
//        System.out.println("director");
        p5.setDirector("Juana Gomez");
//        System.out.println("duracion");
        p5.setDuracion(1.10);
//        System.out.println("edad");
        p5.setEdadMinima(1);
        pelis.add(p5);

        return pelis;
    }  
}
