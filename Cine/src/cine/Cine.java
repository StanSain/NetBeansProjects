/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cine;

import entidades.Pelicula;
import entidades.Sala;
import java.util.ArrayList;
import servicios.ServicioPelicula;
import servicios.ServicioSala;

/**
 *
 * @author John
 */
public class Cine {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        //Llena con los datos del enum Salas un Arraylist<String> patio
        ArrayList<String> patio = new ArrayList<String>();
        ServicioSala ss = new ServicioSala();
        patio = ss.llenaSalas();
        ServicioPelicula sp = new ServicioPelicula();
        ArrayList<Pelicula> pel = new ArrayList<Pelicula>();
        pel = sp.iniciaPeliculas();
        ArrayList<Sala> arrs = new ArrayList<Sala>();
        arrs = ss.preparaSalas(patio, pel);
    }
}
