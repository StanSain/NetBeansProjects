/*Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, 
el juego se trata de un número de jugadores, que, con un revolver de agua, 
el cual posee una sola carga de agua, se dispara y se moja. Las clases por 
hacer del juego son las siguientes:*/
package com.mycompany.ruletarusadeagua;

import entidades.BaseJugador;
import entidades.Jugador;
import entidades.Revolver;
import java.util.ArrayList;
import servicios.ServicioJuego;
import servicios.ServicioRevolver;

/**
 *
 * @author John
 */
public class RuletaRusaDeAgua {

    public static void main(String[] args) {
        ServicioRevolver sr = new ServicioRevolver();
        ArrayList<Jugador> aj = new ArrayList<Jugador>();
        BaseJugador bj = new BaseJugador();
        Revolver r = new Revolver();
//        sr.llenarRevolver(r);
//        sr.toString(r);
//        System.out.println(sr.mojar(r));
        ServicioJuego sj = new ServicioJuego();
        sj.newJuego(aj, r);
        sj.ronda(aj, r);
// 

    }
}
