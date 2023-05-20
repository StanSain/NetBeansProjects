/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ruletarusadeagua;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(((int) (r.nextDouble() * 6))+1);
        }

    }

}
