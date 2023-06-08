/*Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.*/

 /*Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.*/

 /*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.*/

 /*Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
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
Mayor que 80 kg $1000
 */
package servicios;

import entidades.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class SerElectro {

    private void compruebaLetra(Electrodomestico e) {

    }

    private void compruebaColor(Electrodomestico e) {

    }

    public void creaElectrodomestico(Electrodomestico e) {
        Scanner leer = new Scanner(System.in);
        SerElectro se1 = new SerElectro();
        e.setConsumo('F');
        e.setColor("blanco");
//        se1.compruebaLetra(e);
//        se1.compruebaColor(e);
        e.setPrecio(1000);
        e.setPeso(0);
//        System.out.println(e);
    }

    public void precioFinal(Electrodomestico e) {
        char c = e.getConsumo();
        if (c == 'A') {
            e.setPrecio(e.getPrecio() + 1000);
        }
        if (c == 'B') {
            e.setPrecio(e.getPrecio() + 800);
        }
        if (c == 'C') {
            e.setPrecio(e.getPrecio() + 600);
        }
        if (c == 'D') {
            e.setPrecio(e.getPrecio() + 500);
        }
        if (c == 'E') {
            e.setPrecio(e.getPrecio() + 300);
        }
        if (c == 'F') {
            e.setPrecio(e.getPrecio() + 100);
        }
        double p = e.getPeso();
        if ((p >= 1) && (p <= 19)) {
            e.setPeso(e.getPeso() + 100);
        }
        if ((p >= 20) && (p <= 49)) {
            e.setPeso(e.getPeso() + 500);
        }
        if ((p >= 50) && (p <= 79)) {
            e.setPeso(e.getPeso() + 800);
        }
        if ((p >= 80) && (p <= 100)) {
            e.setPeso(e.getPeso() + 1000);
        }
     
    }
}
