/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.petshop;

import entidades.BasePerro;
import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.ServicioPerro;
import servicios.ServicioPersona;

/**
 *
 * @author John
 */
public class PetShop {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Perro> parr = new ArrayList<Perro>();
        ServicioPerro sp = new ServicioPerro();
        ServicioPersona sper = new ServicioPersona();
        ArrayList<Persona> arrp = new ArrayList<Persona>();
        BasePerro bp = new BasePerro();

        bp.basePerros(parr);
        sp.muestraPerros(parr);

        Persona p = new Persona();
        sper.iniciaPersona(arrp, p);

        boolean otro = true;
//        do {
//
//            sper.personaAdopta(arrp, parr);
//            String otra = "s";
//            System.out.println("otra s ");
//            otra = leer.next();
//            if (otra.equals("s")) {
//                otro = true;
//            } else {
//                otro = false;
//            }
//
//        } while (otro == true);

    }
}
