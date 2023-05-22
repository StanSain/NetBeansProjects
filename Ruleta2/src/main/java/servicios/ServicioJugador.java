/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Jugador;

/**
 *
 * @author John
 */
public class ServicioJugador {
    public void iniciaJugador(Jugador j){
        String[] ju = new String[6];
        for (int i = 0; i < 6; i++) {
            ju[i]="jugador: "+(i+1);
        }
        j.setJugador(ju);
        for (int i = 0; i < 6; i++) {
            System.out.println(j.getJugador()[i]);
        }
    }
    
}
