/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bases;

import entidades.Espectador;
import java.util.ArrayList;

/**
 *
 * @author John
 */
public class BaseExpectador {

    public void creaEspectadores(ArrayList<Espectador> e) {

        Espectador es1 = new Espectador();
        es1.setNombre("Pepe");
        es1.setEdad(19);
        es1.setDinero(750);
        e.add(es1);

        Espectador es2 = new Espectador();
        es1.setNombre("Juan");
        es1.setEdad(15);
        es1.setDinero(850);
        e.add(es2);

        Espectador es3 = new Espectador();
        es1.setNombre("Maria");
        es1.setEdad(20);
        es1.setDinero(550);
        e.add(es3);

        Espectador es4 = new Espectador();
        es1.setNombre("Silvia");
        es1.setEdad(14);
        es1.setDinero(1000);
        e.add(es4);

        Espectador es5 = new Espectador();
        es1.setNombre("Tito");
        es1.setEdad(29);
        es1.setDinero(650);
        e.add(es5);

        Espectador es6 = new Espectador();
        es1.setNombre("Nene");
        es1.setEdad(16);
        es1.setDinero(750);
        e.add(es6);
    }

}
