/*Clase Revolver posicionTambor = 0 entonces dispara metodos hace girar el tambor metodo
aprieto el gatillo */
package com.mycompany.ruleta2;

import entidades.Jugador;
import entidades.Revolver;
import servicios.ServicioJugador;
import servicios.ServicioRevolver;

/**
 *
 * @author John
 */
public class Ruleta2 {

    public static void main(String[] args) {
        Revolver r = new Revolver();
        ServicioRevolver sr = new ServicioRevolver();
//        sr.iniciaRevolver(r);
        Jugador j = new Jugador();
        ServicioJugador sj = new ServicioJugador();
        sj.iniciaJugador(j);

    }
}
