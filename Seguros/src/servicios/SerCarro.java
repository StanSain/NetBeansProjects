/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Carro;

/**
 *
 * @author John
 */
public class SerCarro {
    public Carro creaCarro(){
        Carro c = new Carro();
        c.setMarca("Ford");
        c.setModelo("Fino");
        c.setChasis(123);
        c.setMotor(258);
        c.setTipo("auto");
        return c;
    }
    
}
