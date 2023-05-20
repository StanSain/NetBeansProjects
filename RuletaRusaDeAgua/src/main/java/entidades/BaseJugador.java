/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class BaseJugador {

    public void baseJugadores(ArrayList<Jugador> j) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Jugador j1 = new Jugador();
        j1.setNombre("Juan Perez");
        j1.setId(1);
        j1.setMojado(false);
        j.add(j1);

        Jugador j2 = new Jugador();
        j2.setNombre("Juana Gonzalez");
        j2.setId(2);
        j2.setMojado(false);
        j.add(j2);

        Jugador j3 = new Jugador();
        j3.setNombre("Pedro Ramirez");
        j3.setId(3);
        j1.setMojado(false);
        j.add(j3);

        Jugador j4 = new Jugador();
        j4.setNombre("Maria Bustamante");
        j4.setId(4);
        j1.setMojado(false);
        j.add(j4);

        Jugador j5 = new Jugador();
        j5.setNombre("Sergio Ramirez");
        j5.setId(5);
        j5.setMojado(false);
        j.add(j5);

        Jugador j6 = new Jugador();
        j6.setNombre("Luisa Lopez");
        j6.setId(6);
        j6.setMojado(false);
        j.add(j6);

    }
}
