/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.BaseJugador;
import entidades.Jugador;
import entidades.Revolver;
import java.util.ArrayList;

/**
 *
 * @author John
 */
public class ServicioJuego {

    public void newJuego(ArrayList<Jugador> z, Revolver r) {

        BaseJugador bj = new BaseJugador();
        bj.baseJugadores(z);
//        for (int i = 0; i < z.size(); i++) {
//            System.out.println(z.get(i).getNombre());
//        }

    }

    public void ronda(ArrayList<Jugador> z, Revolver r) {

        System.out.println(z.get(0).getNombre());
        ServicioRevolver sr = new ServicioRevolver();
        System.out.println(sr.disparo(r));
    }
}
