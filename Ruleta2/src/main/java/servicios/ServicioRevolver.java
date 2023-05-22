/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Revolver;

/**
 *
 * @author John
 */
public class ServicioRevolver {

    public void iniciaRevolver(Revolver r) {
        int[] pos = new int[6];
        pos[0] = 1;
        pos[1] = 2;
        pos[2] = 3;
        pos[3] = 4;
        pos[4] = 5;
        pos[5] = 6;
        r.setTambor(pos);
        for (int i = 0; i < 6; i++) {
            System.out.println(r.getTambor()[i]);
        }

    }
}
