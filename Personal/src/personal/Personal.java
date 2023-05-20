/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personal;

import entidades.DNI;
import entidades.Persona;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.substring;

/**
 *
 * @author John
 */
public class Personal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Persona();
        p1.setNombre(leer.next());
        p1.setApellido(leer.next());
        int numero = leer.nextInt();
        String serie = leer.next();
        serie = substring(serie, 0, 1);
        DNI dni1 = new DNI();
        dni1.setNumero(numero);
        dni1.setSerie(serie);
        p1.setDni(dni1);

        Persona p2 = new Persona();
        p2.setNombre(leer.next());
        p2.setApellido(leer.next());
        numero = leer.nextInt();
        serie = leer.next();
        serie = substring(serie, 0, 1);
        DNI dni2 = new DNI();
        dni2.setNumero(numero);
        dni2.setSerie(serie);
        p2.setDni(dni2);
        
        
        System.out.println(p2.getApellido()+" DNI "+p2.getDni().getNumero()+" "+p2.getDni().getSerie());

    }

}
