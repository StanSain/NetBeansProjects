/*
 película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada.
 */
package entidades;

/**
 *
 * @author John
 */
public class Cartelera {
    private Pelicula peli;
    private String[][] sala;
    private double precio;

    public Cartelera() {
    }

    public Cartelera(Pelicula peli, String[][] sala, double precio) {
        this.peli = peli;
        this.sala = sala;
        this.precio = precio;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine{" + "peli=" + peli + ", sala=" + sala + ", precio=" + precio + '}';
    }
    
    
}
