/*
 Se registra la información de cada vehículo asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
 */
package entidades;

/**
 *
 * @author John
 */
public class Carro {

    private String marca;
    private String modelo;
    private String tipo;
    private int motor;
    private int chasis;

    public Carro() {
    }

    public Carro(String marca, String modelo, String tipo, int motor, int chasis) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.motor = motor;
        this.chasis = chasis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getChasis() {
        return chasis;
    }

    public void setChasis(int chasis) {
        this.chasis = chasis;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", motor=" + motor + ", chasis=" + chasis + '}';
    }
    
    

}
