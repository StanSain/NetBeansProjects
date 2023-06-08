/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.*/
package veterinaria;

import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

/**
 *
 * @author John
 */
public class Veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro p1 = new Perro("Pepito", "carne", 10, "mestizo");
        Perro p2 = new Perro("Tito", "croquetas", 8, "perro");
        Gato g1 = new Gato("Solito", "pescado", 5, "mestizo");
        Caballo c1 = new Caballo("oscuro", "pasto", 4, "arabe");
        System.out.println(c1.getAlimento());
    }

}
