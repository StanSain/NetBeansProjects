/*Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente*/
package com.mycompany.cartasespaniolas;

import servicios.ServicioBaraja;

/**
 *
 * @author John
 */
public class CartasEspaniolas {

    public static void main(String[] args) {
        ServicioBaraja sb = new ServicioBaraja();
        sb.iniciaMazo();
        

    }
}
