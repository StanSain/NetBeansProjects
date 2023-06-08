/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente*/
package herenciaanimal;

import entidades.Perro;

/**
 *
 * @author John
 */
public class HerenciaAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro p = new Perro();
        p.setAlimento("doggy");
        p.alimenta();

    }

}
