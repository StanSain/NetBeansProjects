/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author John
 */
public class Utilitario extends Vehiculo {
    private String chofer;
    private double gas;

    public Utilitario(String chofer, double gas) {
        this.chofer = chofer;
        this.gas = gas;
    }

    public Utilitario(String chofer, double gas, String marca, String tipo, int numero) {
        super(marca, tipo, numero);
        this.chofer = chofer;
        this.gas = gas;
    }
  

}
