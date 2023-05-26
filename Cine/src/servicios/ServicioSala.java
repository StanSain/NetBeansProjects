/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Pelicula;
import entidades.Sala;
import enums.Butacas;
import java.util.ArrayList;

/**
 *
 * @author John
 */
public class ServicioSala {

    public ArrayList<String> llenaSalas() {

        ArrayList<String> patio = new ArrayList<String>();
        for (Butacas bu : Butacas.values()) {
            patio.add(bu.name() + "X");
        }

        return patio;
    }
public ArrayList<Sala> preparaSalas(ArrayList<String> patio, ArrayList<Pelicula> pel){
    ArrayList<Sala> arrs = new ArrayList<Sala>();
    for (int i = 0; i < pel.size(); i++) {
System.out.println(pel.get(i).getTitulo()+" Edad Minima "+pel.get(i).getEdadMinima());        
    }
    return arrs;
}
}
