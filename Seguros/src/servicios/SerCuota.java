/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Cuota;
import entidades.Poliza;
import java.util.ArrayList;

/**
 *
 * @author John
 */
public class SerCuota {

    public void iniciaCuotas(ArrayList<Poliza> p) {
        for (int i = 0; i < p.size(); i++) {
            System.out.println(p.get(i).getNumero()+" "+p.get(i).getCli().getApellido());
        }
    }
}
