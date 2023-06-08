/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author John
 */
public class Lavadora extends Electrodomestico {

    public double carga;
    
    public Lavadora(){
        
    }

    public Lavadora(double carga) {
        this.carga = carga;
    }

    public Lavadora(double carga, String color, double precio, char consumo, double peso) {
        super(color, precio, consumo, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public char getConsumo() {
        return consumo;
    }

    @Override
    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }
    

}
