/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona*/

package com.mycompany.adopcionperro;

import entidades.Perro;
import entidades.Persona;
import servicios.ServicioAdopcion;

/**
 *
 * @author John
 */
public class AdopcionPerro {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("Juan");
        p1.setApellido("Perez");

        Persona p2 = new Persona();
        p2.setNombre("Mario");
        p2.setApellido("Gomez");
        
        
        
        Perro pe1 = new Perro();
        pe1.setNombre("Toto");
        pe1.setRaza("perro");
        pe1.setEdad(5);
        
        Perro pe2 = new Perro();
        pe2.setNombre("Tito");
        pe2.setRaza("perrol");
        pe2.setEdad(4);
        
        ServicioAdopcion sa = new ServicioAdopcion();
        sa.muestraMascota(p2, pe1);
        
        System.out.println(p2.getNombre()+ " mascota "+pe1.getNombre());
        
    }
}
