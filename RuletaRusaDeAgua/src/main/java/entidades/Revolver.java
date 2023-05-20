/*Clase Revolver de agua: esta clase posee los siguientes atributos: posición 
actual (posición del tambor que se dispara, puede que esté el agua o no) y 
posición agua (la posición del tambor donde se encuentra el agua). Estas dos
posiciones, se generarán aleatoriamente*/
package entidades;

/**
 *
 * @author John
 */
public class Revolver {

    int tamborPosition;
    int aguaPosition;

    public Revolver() {
    }

    public Revolver(int tamborPosition, int aguaPosition) {
        this.tamborPosition = tamborPosition;
        this.aguaPosition = aguaPosition;
    }

    public int getTamborPosition() {
        return tamborPosition;
    }

    public void setTamborPosition(int tamborPosition) {
        this.tamborPosition = tamborPosition;
    }

    public int getAguaPosition() {
        return aguaPosition;
    }

    public void setAguaPosition(int aguaPosition) {
        this.aguaPosition = aguaPosition;
    }

    @Override
    public String toString() {
        return "Revolver{" + "tamborPosition=" + tamborPosition + ", aguaPosition=" + aguaPosition + '}';
    }
    
    

}
