/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosarrays;

import java.util.Arrays;
import servicios.Ser;

/**
 *
 * @author John
 */
public class DosArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] A = new double[50];
        double[] B = new double[20];
        Ser s = new Ser();
        s.iniciaArr(A);
        s.iniciaArr(B);
// s.muestrArr(B);
  s.muestrArr(A);
  System.out.println();
  Arrays.sort(A);
  s.muestrArr(A);
        
    }

}
