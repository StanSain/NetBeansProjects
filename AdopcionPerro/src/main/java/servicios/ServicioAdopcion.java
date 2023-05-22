/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Perro;
import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class ServicioAdopcion {

    public void muestraMascota(Persona p, Perro pe) {
        Scanner leer = new Scanner(System.in);
        
        p.setMascota(pe);
        
    }
}
