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

public Velero construirVelero( Velero v){
  return v;
}
}
