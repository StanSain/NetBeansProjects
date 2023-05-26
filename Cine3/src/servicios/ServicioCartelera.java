/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Cartelera;
import entidades.Pelicula;

/**
 *
 * @author John
 */
public class ServicioCartelera {
    
    public void llenaSala(Cartelera ca) {
        Pelicula p = new Pelicula();
        p.setTitulo("La Bala que dobló la esquina");
        p.setDirector("Pedro Perez");
        p.setDuracion(1.60);
        p.setEdad(18);
        ca.setPeli(p);
        ca.setPrecio(1250.50);
        String[][] patio = new String[8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                patio[i][j] = "F" + (i + 1) + "C" + (j + 1) + "X";
            }
        }

//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 6; j++) {
//                System.out.println(patio[i][j]);
//            }
//        }
        patio[0][1] = "F1C2 ";
        patio[1][1] = "F1C2 ";
        patio[5][1] = "F1C2 ";
        patio[7][1] = "F1C2 ";
        patio[7][4] = "F1C2 ";
        patio[4][3] = "F1C2 ";
        patio[2][0] = "F1C2 ";
        patio[6][5] = "F1C2 ";
        
        ca.setSala(patio);
        
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 6; j++) {
//                System.out.print(patio[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

    }
