/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Carro;
import java.util.ArrayList;

/**
 *
 * @author John
 */
public class SerCarro {

    public void creaCarro(ArrayList<Carro> ca) {
        Carro c1 = new Carro();
        c1.setMarca("Ford");
        c1.setModelo("Fino");
        c1.setChasis(123);
        c1.setMotor(258);
        c1.setTipo("auto");
        ca.add(c1);

        Carro c2 = new Carro();
        c2.setMarca("fiat");
        c2.setModelo("Choto");
        c2.setChasis(12354);
        c2.setMotor(4587);
        c2.setTipo("camion");
        ca.add(c2);

        
        
    }

}
