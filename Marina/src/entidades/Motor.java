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
public class Motor extends Barco {

    protected Integer potencia;

    public Motor() {
    }

    public Motor(Integer potencia) {
        this.potencia = potencia;
    }

    public Motor(Integer potencia, String matricula, Integer eslora, Integer anioFabrica) {
        super(matricula, eslora, anioFabrica);
        this.potencia = potencia;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

 public ArrayList<Motor> construirMotor(ArrayList<Motor> am, Motor m){
    Scanner leer = new Scanner(System.in);
    System.out.println("Año fabrica");
    m.setAnioFabrica(leer.nextInt());
    System.out.println("Eslora");
    m.setEslora(leer.nextInt());
    System.out.println("Potencia");
    m.setPotencia(leer.nextInt());
    System.out.println("Matricula");
    m.setMatricula(leer.next());
    am.add(m);
    return am;
}
}
