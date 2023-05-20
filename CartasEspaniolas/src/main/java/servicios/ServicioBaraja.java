/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Baraja;

/**
 *
 * @author John
 */
public class ServicioBaraja {

    public void iniciaMazo() {
        int[] ca = new int[10];
        ca[0] = 1;
        ca[1] = 2;
        ca[2] = 3;
        ca[3] = 4;
        ca[4] = 5;
        ca[5] = 6;
        ca[6] = 7;
        ca[7] = 10;
        ca[8] = 11;
        ca[9] = 12;

        Baraja b1 = new Baraja();
        b1.setPalo("Espada");
        b1.setNumero(ca);

        Baraja b2 = new Baraja();
        b2.setPalo("Oro");
        b2.setNumero(ca);

        Baraja b3 = new Baraja();
        b3.setPalo("Basto");
        b3.setNumero(ca);

        Baraja b4 = new Baraja();
        b4.setPalo("Copa");
        b4.setNumero(ca);

        Baraja maso = new Baraja();
        
        

    }

}
