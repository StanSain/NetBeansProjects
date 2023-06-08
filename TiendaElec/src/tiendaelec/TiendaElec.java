/*Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso*/
package tiendaelec;

import entidades.Electro;
import entidades.Lavadora;
import java.util.ArrayList;
import java.util.Scanner;

public class TiendaElec {

    public static void main(String[] args) {
        
        Electro e = new Electro();
        e.creaElectro(e);
        System.out.println(e.toString());
        Lavadora lav = new Lavadora();
        lav.creaLavadora(lav);
        System.out.println(lav.toString());
 
        
    }

}
