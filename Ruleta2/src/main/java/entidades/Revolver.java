/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author John
 */
public class Revolver {
private int [] tambor;

    public Revolver() {
        this.tambor = new int[6];
    }

    public Revolver(int[] tambor) {
        this.tambor = tambor;
    }

    public int[] getTambor() {
        return tambor;
    }

    public void setTambor(int[] tambor) {
        this.tambor = tambor;
    }

    @Override
    public String toString() {
        return "Revolver{" + "tambor=" + tambor + '}';
    }
    

}
