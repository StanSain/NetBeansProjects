/*Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.*/

package entidades;

/**
 *
 * @author John
 */
public class Electrodomestico {
    protected String color;
    protected double precio;
    protected  char consumo;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(String color, double precio, char consumo, double peso) {
        this.color = color;
        this.precio = precio;
        this.consumo = consumo;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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
        return "Electrodomestico{" + "color=" + color + ", precio=" + precio + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    


    
}
