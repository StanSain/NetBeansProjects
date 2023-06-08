/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

/**
 *
 * @author John
 */
public class Ser {
    public double[] iniciaArr( double [] a){
        for (int i = 0; i < a.length; i++) {
            a[i]=Math.random();
        }
        return a;
    }
    public void muestrArr(double[] d){
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
    }
}
