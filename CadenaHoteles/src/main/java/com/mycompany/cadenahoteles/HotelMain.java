/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.cadenahoteles;

import entidades.Hotel;
import entidades.Hotel1;
import entidades.Hotel2;
import entidades.Hotel3;
import entidades.Hotel4;
import entidades.Hotel5;
import java.util.ArrayList;

/**
 *
 * @author John
 */
public class HotelMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
ArrayList<Hotel> ah = new ArrayList<Hotel>();
Hotel h = new Hotel(8);
Hotel1 h1 = new Hotel1(15.50d,4.5d,20) ;

Hotel2 h2 = new Hotel2(25.50d,5.5d,30) ;

Hotel3 h3 = new Hotel3(35.50d,6.5d,40) ;
ah.add(h3);
Hotel4 h4 = new Hotel4(125.50d,9.5d,70) ;
ah.add(h4);
Hotel5 h5 = new Hotel5(1125.50d,19.5d,120) ;


ah.add(h);
ah.add(h1);
ah.add(h2);
ah.add(h3);
ah.add(h4);
ah.add(h5);

        for (Hotel hotel : ah) {
            if ( hotel instanceof Hotel5){
                Hotel5 object = (Hotel5)hotel;
                
            }
        }


    }
    
}
