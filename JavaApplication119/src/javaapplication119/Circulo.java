/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication119;

import java.util.Scanner;

/**
 *
 * @author John
 */
public abstract class Circulo implements Calculo {

    @Override
    public void area() {
        Scanner leer = new Scanner(System.in);
        double radio = leer.nextDouble();
        double area = cte *(Math.pow(radio, 2));
    }
}
