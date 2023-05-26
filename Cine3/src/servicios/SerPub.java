/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Cartelera;
import entidades.Publico;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class SerPub {

    public ArrayList<Publico> creaPub() {
        ArrayList<Publico> p = new ArrayList<Publico>();
        Publico pu1 = new Publico();
        pu1.setNombre("Juan");
        pu1.setDinero(1600.0);
        pu1.setEdad(13);
        p.add(pu1);

        Publico pu2 = new Publico();
        pu2.setNombre("Pepe");
        pu2.setDinero(600.0);
        pu2.setEdad(19);
        p.add(pu2);

        Publico pu3 = new Publico();
        pu3.setNombre("tito");
        pu3.setDinero(100.0);
        pu3.setEdad(21);
        p.add(pu3);

        Publico pu4 = new Publico();
        pu4.setNombre("Nilda");
        pu4.setDinero(1650.0);
        pu4.setEdad(23);
        p.add(pu4);

        Publico pu5 = new Publico();
        pu5.setNombre("Tita");
        pu5.setDinero(2600.0);
        pu5.setEdad(31);
        p.add(pu5);
        return p;
    }
    
    public void boleteria( Cartelera c , ArrayList<Publico> a){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i).getNombre()+" edad "+a.get(i).getEdad()+" dinero "+a.get(i).getDinero());
        }
        System.out.println("nombre ");
        int n = leer.nextInt();
        System.out.println("elegido "+a.get(n-1));
        
        System.out.println(c.getPeli().getEdad()+" "+c.getPrecio()+" ");
        
        ServicioCartelera sc = new ServicioCartelera();
 
        
        
        
        
    }

}
