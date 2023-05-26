/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author John
 */
public class Sala {

    private String[][] butacas;
    private Pelicula titulo;
    private double entrada;

    public Sala() {
    }

    public Sala(String[][] butacas, Pelicula titulo, double entrada) {
        this.butacas = butacas;
        this.titulo = titulo;
        this.entrada = entrada;
    }

    public String[][] getButacas() {
        return butacas;
    }

    public void setButacas(String[][] butacas) {
        this.butacas = butacas;
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
        return "Sala{" + "butacas=" + butacas + ", titulo=" + titulo + ", entrada=" + entrada + '}';
    }
    

}
