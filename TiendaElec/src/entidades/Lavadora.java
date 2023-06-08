/*A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados*/
package entidades;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Lavadora extends Electro {
private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga) {
        this.carga = carga;
    }

public Lavadora creaLavadora(Lavadora lav){
    lav.creaElectro(lav);
    return lav;
}
}