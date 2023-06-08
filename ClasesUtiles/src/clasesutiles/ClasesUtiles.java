/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesutiles;

import entidades.Cadena;
import static jdk.nashorn.internal.objects.NativeString.substring;
import servicios.SerCadena;

/**
 *
 * @author John
 */
public class ClasesUtiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Construir un clase Cadena ");
        SerCadena sc = new SerCadena();
        Cadena c = new Cadena();
        c.setFrase("algo");
        sc.cuentaVocales(c);
//        System.out.println(substring(c.getFrase(),0,1));
    }
    
}
