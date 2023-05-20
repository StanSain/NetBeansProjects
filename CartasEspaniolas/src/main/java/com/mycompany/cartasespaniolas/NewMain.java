/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.cartasespaniolas;

/**
 *
 * @author John
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = new int[3];
        int[] b = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        b[0] = 1;
        b[1] = 2;
        b[2] = 3;

        int[] c = new int[6];

        for (int i = 0; i < 3; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < 3; i++) {
            c[i + 3] = b[i];
        }
        
        for (int i = 0; i < 6; i++) {
            System.out.println(c[i]);
        }
    }

}
