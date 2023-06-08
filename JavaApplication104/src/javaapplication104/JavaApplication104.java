/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication104;

import servicios.Operaciones;

/**
 *
 * @author John
 */
public class JavaApplication104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Operaciones op = new Operaciones();
        int c = op.entero();
//        int c =op.fuma(2, 5);
System.out.println(c);
    }

}
