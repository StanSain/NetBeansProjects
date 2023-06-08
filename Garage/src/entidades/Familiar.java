/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author John
 */
public class Familiar extends Vehiculo  {
    private String depto;
    private Integer plazas;

    public Familiar(String depto, Integer plazas) {
        this.depto = depto;
        this.plazas = plazas;
    }

    public Familiar(String depto, Integer plazas, String marca, String tipo, int numero) {
        super(marca, tipo, numero);
        this.depto = depto;
        this.plazas = plazas;
    }
    
}
