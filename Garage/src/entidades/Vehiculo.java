/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author John
 */
public class Vehiculo {
    protected String marca;
    protected String tipo;
    protected int numero;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String tipo, int numero) {
        this.marca = marca;
        this.tipo = tipo;
        this.numero = numero;
    }


    public void escriboAlgo(){
        System.out.println("Algo se mueve en el fondo");
    }
}
