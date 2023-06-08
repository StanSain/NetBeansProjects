/*Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso*/
package entidades;

import java.util.Scanner;
import servicios.SerElectro;

public class Electro {

    protected double precio;
    protected String color;
    protected char consumo;
    protected double peso;

    public Electro() {
        this.precio = 1000;
    }

    public Electro(double precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electro{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }

///----------------------------------------------------
    /*Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible*/
    public void compruebaC(char A) {

    }

    /*Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible*/
    public void compuebaColor(String c) {

    }

    /*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.*/
    public Electro creaElectro(Electro e) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Consumo A B C D E F ");
        e.setConsumo(leer.next().charAt(0));
        e.compruebaC(e.getConsumo());
        System.out.println("color blanco negro rojo azul gris");
        e.setColor(leer.next());
        e.compuebaColor(e.getColor());
        System.out.println("peso");
        e.setPeso(leer.nextDouble());
        System.out.println("precio: ");
        e.setPrecio(leer.nextDouble());
        return e;
    }

    /*Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:*/
 /*
LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100
PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $100
     */
    public void precioFinal(Electro e) {

    }

    //-----------------------------------------------------
}
