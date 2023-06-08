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
public class Yate extends Motor {
    private int camarotes;

    public Yate() {
    }

    public Yate(int camarotes) {
        this.camarotes = camarotes;
    }

    public Yate(int camarotes, Integer potencia) {
        super(potencia);
        this.camarotes = camarotes;
    }

    public Yate(int camarotes, Integer potencia, String matricula, Integer eslora, Integer anioFabrica) {
        super(potencia, matricula, eslora, anioFabrica);
        this.camarotes = camarotes;
        
    }


    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
    
    
    
    public ArrayList<Yate> construirYate(ArrayList<Yate> ay, Yate y){
        System.out.println("Año");
        y.setAnioFabrica(anioFabrica);
        System.out.println("camarotes");
        y.setCamarotes(0);
        System.out.println("eslora");
        y.setEslora(eslora);
        System.out.println("matricula");
        y.setMatricula(matricula);
        System.out.println("potencia");
        y.setPotencia(potencia);      
        return ay;
    }
}

















