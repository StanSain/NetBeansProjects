/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mascotas;

import entidades.Raza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import servicios.SerRaza;

/**
 *
 * @author John
 */
public class Mascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Raza> ra = new ArrayList<Raza>();
        SerRaza s = new SerRaza();
        boolean seguir = true;
        do {
            Raza r1 = new Raza();
            s.nuevaRaza(ra, r1);
            String salir = "s";
            System.out.println("salir s");
            salir = leer.next();
            if (salir.equals("s")) {
                seguir = false;
            } else {
                seguir = true;
            }
        } while (seguir == true);

        Iterator<Raza> iterator = ra.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("pepe")) {
                iterator.remove();
            }
        }
        for (int i = 0; i < ra.size(); i++) {
            System.out.println(ra.get(i).getNombre());
        }

    }

}
