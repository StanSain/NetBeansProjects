/*Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.*/
package electrodomesticos;

import entidades.Electrodomestico;
import entidades.Lavadora;
import servicios.SerElectro;
import servicios.SerLava;

/**
 *
 * @author John
 */
public class Electrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Electrodomestico e1 = new Electrodomestico();
        SerElectro se = new SerElectro();
        se.creaElectrodomestico(e1);
        Lavadora la = new Lavadora();
        SerLava sla = new SerLava();
      sla.creaLavadora(la);
    }

}
