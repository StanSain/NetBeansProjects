/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Baraja;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author John
 */
public class ServicioBaraja {

    public void iniciaMazo() {
        ArrayList<Baraja> m = new ArrayList<Baraja>();
        Baraja b1 = new Baraja();
        b1.setNumero("1");
        b1.setPalo("Oro");
        m.add(b1);

        Baraja b2 = new Baraja();
        b2.setNumero("2");
        b2.setPalo("Oro");
        m.add(b2);

        Baraja b3 = new Baraja();
        b3.setNumero("3");
        b3.setPalo("Oro");
        m.add(b3);

        Baraja b4 = new Baraja();
        b4.setNumero("4");
        b4.setPalo("Oro");
        m.add(b4);

        Baraja b5 = new Baraja();
        b5.setNumero("5");
        b5.setPalo("Oro");
        m.add(b5);

        Baraja b6 = new Baraja();
        b6.setNumero("6");
        b6.setPalo("Oro");
        m.add(b6);

        Baraja b7 = new Baraja();
        b7.setNumero("7");
        b7.setPalo("Oro");
        m.add(b7);

        Baraja b8 = new Baraja();
        b8.setNumero("10");
        b8.setPalo("Oro");
        m.add(b8);

        Baraja b9 = new Baraja();
        b9.setNumero("11");
        b9.setPalo("Oro");
        m.add(b9);

        Baraja b10 = new Baraja();
        b10.setNumero("12");
        b10.setPalo("Oro");
        m.add(b10);
        //----------------------------

        Baraja b11 = new Baraja();
        b11.setNumero("1");
        b11.setPalo("Espada");
        m.add(b11);

        Baraja b12 = new Baraja();
        b12.setNumero("2");
        b12.setPalo("Espada");
        m.add(b12);

        Baraja b13 = new Baraja();
        b13.setNumero("3");
        b13.setPalo("Espada");
        m.add(b13);

        Baraja b14 = new Baraja();
        b14.setNumero("4");
        b14.setPalo("Espada");
        m.add(b14);

        Baraja b15 = new Baraja();
        b15.setNumero("5");
        b15.setPalo("Espada");
        m.add(b15);

        Baraja b16 = new Baraja();
        b16.setNumero("6");
        b16.setPalo("Espada");
        m.add(b16);

        Baraja b17 = new Baraja();
        b17.setNumero("7");
        b17.setPalo("Espada");
        m.add(b17);

        Baraja b18 = new Baraja();
        b18.setNumero("10");
        b18.setPalo("Espada");
        m.add(b18);

        Baraja b19 = new Baraja();
        b19.setNumero("11");
        b19.setPalo("Espada");
        m.add(b19);

        Baraja b20 = new Baraja();
        b20.setNumero("12");
        b20.setPalo("Espada");
        m.add(b20);
        //----------------------------

        Baraja b21 = new Baraja();
        b21.setNumero("1");
        b21.setPalo("Bastos");
        m.add(b21);

        Baraja b22 = new Baraja();
        b22.setNumero("2");
        b22.setPalo("Bastos");
        m.add(b22);

        Baraja b23 = new Baraja();
        b23.setNumero("3");
        b23.setPalo("Bastos");
        m.add(b23);

        Baraja b24 = new Baraja();
        b24.setNumero("4");
        b24.setPalo("Bastos");
        m.add(b24);

        Baraja b25 = new Baraja();
        b25.setNumero("5");
        b25.setPalo("Bastos");
        m.add(b25);

        Baraja b26 = new Baraja();
        b26.setNumero("6");
        b26.setPalo("Bastos");
        m.add(b26);

        Baraja b27 = new Baraja();
        b27.setNumero("7");
        b27.setPalo("Bastos");
        m.add(b27);

        Baraja b28 = new Baraja();
        b28.setNumero("10");
        b28.setPalo("Bastos");
        m.add(b28);

        Baraja b29 = new Baraja();
        b29.setNumero("11");
        b29.setPalo("Bastos");
        m.add(b29);

        Baraja b30 = new Baraja();
        b30.setNumero("12");
        b30.setPalo("Bastos");
        m.add(b30);
        //----------------------------

        Baraja b31 = new Baraja();
        b31.setNumero("1");
        b31.setPalo("Copa");
        m.add(b31);

        Baraja b32 = new Baraja();
        b32.setNumero("2");
        b32.setPalo("Copa");
        m.add(b32);

        Baraja b33 = new Baraja();
        b33.setNumero("3");
        b33.setPalo("Copa");
        m.add(b33);

        Baraja b34 = new Baraja();
        b34.setNumero("4");
        b34.setPalo("Copa");
        m.add(b34);

        Baraja b35 = new Baraja();
        b35.setNumero("5");
        b35.setPalo("Copa");
        m.add(b35);

        Baraja b36 = new Baraja();
        b36.setNumero("6");
        b36.setPalo("Copa");
        m.add(b36);

        Baraja b37 = new Baraja();
        b37.setNumero("7");
        b37.setPalo("Copa");
        m.add(b37);

        Baraja b38 = new Baraja();
        b38.setNumero("10");
        b38.setPalo("Copa");
        m.add(b38);

        Baraja b39 = new Baraja();
        b39.setNumero("11");
        b39.setPalo("Copa");
        m.add(b39);

        Baraja b40 = new Baraja();
        b40.setNumero("12");
        b40.setPalo("Copa");
        m.add(b40);
        //----------------------------
        for (Baraja baraja : m) {
            System.out.println(baraja);
        }
        Collections.shuffle(m);
        for (Baraja baraja : m) {
            System.out.println(baraja);
        }
    }
}
