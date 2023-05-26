/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cine3;

import entidades.Cartelera;
import entidades.Publico;
import java.util.ArrayList;
import servicios.SerPub;
import servicios.ServicioCartelera;

/**
 *
 * @author John
 */
public class Cine3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cartelera cart = new Cartelera();
        ServicioCartelera sc = new ServicioCartelera();
        sc.llenaSala(cart);
        SerPub sp = new SerPub();
        ArrayList<Publico> pu = new ArrayList<Publico>();

        pu = sp.creaPub();

//        for (int i = 0; i < pu.size(); i++) {
//            System.out.println(pu.get(i).getNombre());
//        }
        sp.boleteria(cart, pu);

    }

}
