/*
Clase Vehiculo, atributos marca, tipo y patente, sublases Utilitarios atributo
chofer, Familiar atributo plazas, Automovil atributos chofer gasolina */
package garage;

import entidades.Auto;
import entidades.Vehiculo;


/**
 *
 * @author John
 */
public class Garage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo();
        v.escriboAlgo();
Auto a = new Auto();
a.escriboAlgo();
    }

}
