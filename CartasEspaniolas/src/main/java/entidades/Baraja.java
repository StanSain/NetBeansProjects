/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author John
 */
public class Baraja {
    private int[]numero;
    private String palo;

    public Baraja() {
    }

    public Baraja(int[] numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int[] getNumero() {
        return numero;
    }

    public void setNumero(int[] numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Baraja{" + "numero=" + numero + ", palo=" + palo + '}';
    }
    
}