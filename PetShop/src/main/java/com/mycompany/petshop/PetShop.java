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
import entidades.BasePersona;

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
        BasePersona bpe = new BasePersona();

        bp.basePerros(parr);
//

        bpe.basePersona(arrp);
        boolean seguir = true;
        do {
            sper.muestraPersonas(arrp);
            System.out.println("elija persona");
            int elije = leer.nextInt();

            System.out.println("Persona elegida " + arrp.get(elije).getNombre() + " ya tiene " + arrp.get(elije).isYaTiene());

            sp.muestraPerros(parr);
            System.out.println("elije perro");
            int eli = leer.nextInt();

            System.out.println("Perro elegido " + parr.get(eli).getNombre() + " adoptado " + parr.get(eli).isAdoptado());
            if ((arrp.get(eli).isYaTiene() == false) && (parr.get(eli).isAdoptado() == false)) {
                arrp.get(eli).setYaTiene(true);
                parr.get(eli).setAdoptado(true);
            }
            String salir = "n";
            System.out.println("salir s0"
                    + "");
            salir =leer.next();
            if (salir.equals("s")){
                seguir = false;
            }
            
        } while (seguir == true);
    }
}
