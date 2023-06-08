/*Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.*/
package servicios;

import entidades.Lavadora;

/**
 *
 * @author John
 */
public class SerLava {
    public void creaLavadora(Lavadora la){
        SerElectro se = new SerElectro();
        se.creaElectrodomestico(la);
        
        System.out.println(la.toString());
    }
}
