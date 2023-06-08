/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facilitadores;

import entidades.Alumno;
import java.util.ArrayList;
import servicios.Simulador;

/**
 *
 * @author John
 */
public class Facilitadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Simulador sa = new Simulador();
        ArrayList<Alumno> ar = new ArrayList<Alumno>();
        sa.creaLaumno(ar);
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i).getNombre());
        }

    }

}
