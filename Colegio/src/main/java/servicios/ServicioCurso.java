package servicios;

import entidades.Curso;
import entidades.Profesor;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioCurso {

    public void crearCurso(Curso c, ArrayList<Profesor> pro) {
        ServicioProfesor sp = new ServicioProfesor();
        Scanner leer = new Scanner(System.in);
        System.out.println("anio");
        c.setAnio(leer.nextInt());
        System.out.println("division");
        c.setDivision(leer.next());
        sp.muestraProfesores(pro);
        System.out.println("profesor #");
        int orden = leer.nextInt();
        c.setProfe(pro.get(orden));
        
    }

    public void muestraCurso(Curso c) {
        System.out.println(c.getAnio() + "division " + c.getDivision());
        System.out.println(c.getProfe().getApellido() + " edad " + c.getProfe().getEdad());
    }

    public void muestraCursos(ArrayList<Curso> c) {
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i).getAnio() + " div " + c.get(i).getDivision()+" - "+(i+1));
        }
    }
}
