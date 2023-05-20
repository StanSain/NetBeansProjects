/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author John
 */
public class BaseCurso {

    public void creaCurso(ArrayList<Curso> z) {
        Curso c1 = new Curso();
        c1.setAnio(1);
        c1.setDivision("A");
        z.add(c1);

        Curso c2 = new Curso();
        c2.setAnio(1);
        c2.setDivision("B");
        z.add(c2);

        Curso c3 = new Curso();
        c3.setAnio(2);
        c3.setDivision("A");
        z.add(c3);

        Curso c4 = new Curso();
        c4.setAnio(2);
        c4.setDivision("B");
        z.add(c4);

    }

}
