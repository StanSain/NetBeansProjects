/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class Velero extends Barco {
    private int mastiles;

    public Velero() {
    }

    public Velero(String matricula, Integer eslora, Integer anioFabrica) {
        super(matricula, eslora, anioFabrica);
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

public ArrayList<Velero> construirVelero(ArrayList<Velero> av, Velero v){
    Scanner leer = new Scanner(System.in);
    System.out.println("Año fabrica");
    v.setAnioFabrica(leer.nextInt());
    System.out.println("Eslora");
    v.setEslora(leer.nextInt());
    System.out.println("Mastiles");
    v.setMastiles(leer.nextInt());
    System.out.println("Matricula");
    v.setMatricula(leer.next());
    av.add(v);
    return av;
}
}
