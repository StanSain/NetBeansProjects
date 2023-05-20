/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Revolver;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class ServicioRevolver {

    public void llenarRevolver(Revolver r) {
        Random ran = new Random();
        int posicionAgua = (int) (ran.nextDouble() * 6) + 1;
        r.setAguaPosition(posicionAgua);
        Random ran1 = new Random();
        int posicionRevolver = (int) (ran1.nextDouble() * 6) + 1;
        r.setTamborPosition(posicionRevolver);
//        System.out.println("agua " + r.getAguaPosition() + " tambor  " + r.getTamborPosition());
    }

    public boolean mojar(Revolver r) {
        boolean moja = false;
        if (r.getAguaPosition() == r.getTamborPosition()) {
            moja = true;
        }
        return moja;
    }

    public void siguienteChorro(Revolver r) {
        Scanner leer = new Scanner(System.in);
        ServicioRevolver sr = new ServicioRevolver();
        sr.llenarRevolver(r);
    }
    
    public void toString(Revolver r){
        System.out.println(r.toString());
    }
    
    public boolean disparo(Revolver r){
        boolean disparo = false;
        ServicioRevolver sr = new ServicioRevolver();
        sr.siguienteChorro(r);
        disparo = sr.mojar(r);       
        return disparo;
    }
    
    

}
