/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.BaseProfesor;
import entidades.Profesor;
import java.util.ArrayList;

/**
 *
 * @author John
 */
public class ServicioProfesor {

    public void creaProfesor(Profesor p) {
   
//        Scanner leer = new Scanner(System.in);
//        System.out.println("nombre profesor");
//        p.setNombre(leer.next());
//        System.out.println("apellido profesor");
//        p.setApellido(leer.next());
//        System.out.println("edad profesor ");
//        p.setEdad(leer.nextInt());
    }

//    public void muestraProfesor(Profesor p) {
//        System.out.println(p.getNombre() + " " + p.getApellido() + " edad " + p.getEdad());
//    }

    public void muestraProfesores(ArrayList<Profesor> p) {
    for (int i = 0; i < p.size(); i++) {
        System.out.println(p.get(i).getApellido()+" - "+(i+1));
    }

    }
}
