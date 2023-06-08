/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Cadena;
import static jdk.nashorn.internal.objects.NativeString.substring;

/**
 *
 * @author John
 */
public class SerCadena {
    public void cuentaVocales(Cadena c){
        String fra = c.getFrase();
        System.out.println(substring(fra,0,1));
        System.out.println(fra.length());
        for (int i = 0; i < fra.length(); i++) {
            if(substring(fra,i, (i+1)).equals("a")){
                System.out.println("eureka");
            }
        }
    }
}
