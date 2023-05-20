package com.mycompany.colegio;

import entidades.Alumno;
import entidades.BaseAlumno;
import entidades.BaseCurso;
import entidades.BaseProfesor;
import entidades.Curso;
import entidades.Profesor;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.ServicioAlumno;
import servicios.ServicioCurso;

import servicios.ServicioProfesor;

public class Colegio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Curso> cur = new ArrayList<Curso>();
        ServicioCurso sc = new ServicioCurso();
        ArrayList<Profesor> pro = new ArrayList<Profesor>();
        ServicioProfesor sp = new ServicioProfesor();
        ArrayList<Alumno> al = new ArrayList<Alumno>();
        ServicioAlumno sa = new ServicioAlumno();
        BaseProfesor bp = new BaseProfesor();
        BaseCurso bc = new BaseCurso();
        BaseAlumno ba = new BaseAlumno();
        //-----MENU
        boolean seguir = true;
        do {
            int opc = 0;
            System.out.println("curso: 1 , profesor: 2 , alumno: 3 , salir: 4 ");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    //-----------CURSO
                    Curso c = new Curso();
                    bc.creaCurso(cur);
                    sc.muestraCursos(cur);
              
                    opc = 0;
                    seguir = true;
                    break;
                case 2:
                    //----crea profesor 
                    Profesor p = new Profesor();
                    bp.creaBaseProfesor(pro);
                    sp.muestraProfesores(pro);
                    //-----------lo agrega al ArrayList
                    pro.add(p);
                    opc = 0;
                    seguir = true;
                    break;
                case 3:
//                    Alumno a = new Alumno();
                    ba.creaAlumno( al);
                    sa.muestraAlumnos(al);
                    break;
                case 4:
                    seguir = false;
                    break;
            }
        } while (seguir == true);
    }

}
