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
public class Barco {

    protected String matricula;
    protected Integer eslora;
    protected Integer anioFabrica;

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Integer anioFabrica) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabrica = anioFabrica;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioFabrica() {
        return anioFabrica;
    }

    public void setAnioFabrica(Integer anioFabrica) {
        this.anioFabrica = anioFabrica;
    }

    public ArrayList<Barco> construyeBarco(ArrayList<Barco> a, Barco b) {
        Scanner leer = new Scanner(System.in);
        b.setMatricula(leer.next());
        b.setEslora(leer.nextInt());
        b.setAnioFabrica(leer.nextInt());
        a.add(b);

        return a;

    }
}
