/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Raza;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class SerRaza {

    public ArrayList<Raza> nuevaRaza(ArrayList<Raza> ra , Raza r) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        r.setNombre(leer.next());
        ra.add(r);
        return ra;
    }
}
