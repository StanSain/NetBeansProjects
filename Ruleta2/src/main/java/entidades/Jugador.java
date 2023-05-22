/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author John
 */
public class Jugador {
    private String [] jugador;

    public Jugador() {
        this.jugador = new String[6];
        
    }

    public Jugador(String[] jugador) {
        this.jugador = jugador;
    }

    public String[] getJugador() {
        return jugador;
    }

    public void setJugador(String[] jugador) {
        this.jugador = jugador;
    }
    
}
