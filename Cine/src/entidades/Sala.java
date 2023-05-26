/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enums.Salas;
import java.util.ArrayList;

/**
 *
 * @author John
 */
public class Sala {

    private Salas nombreSal;
    private ArrayList<String> patioSala;
    private Pelicula titulo;
    private double entrada;

    public Sala() {
    }

    public Sala(Salas nombreSal, ArrayList<String> patioSala, Pelicula titulo, double entrada) {
        this.nombreSal = nombreSal;
        this.patioSala = patioSala;
        this.titulo = titulo;
        this.entrada = entrada;
    }

    public Salas getNombreSal() {
        return nombreSal;
    }

    public void setNombreSal(Salas nombreSal) {
        this.nombreSal = nombreSal;
    }

    public ArrayList<String> getPatioSala() {
        return patioSala;
    }

    public void setPatioSala(ArrayList<String> patioSala) {
        this.patioSala = patioSala;
    }

    public Pelicula getTitulo() {
        return titulo;
    }

    public void setTitulo(Pelicula titulo) {
        this.titulo = titulo;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    @Override
    public String toString() {
        return "Sala{" + "nombreSal=" + nombreSal + ", patioSala=" + patioSala + ", titulo=" + titulo + ", entrada=" + entrada + '}';
    }
    
    

}
