/*
Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). */
package entidades;

import java.util.Date;

/**
 *
 * @author John
 */
public class Poliza {

    private Carro car;
    private Cliente cli;
    private int numero;
    private int cuotas;
    private double monto;
    private Date fechaInicio;
    private Date fechaFin;

    public Poliza() {
    }

    public Poliza(Carro car, Cliente cli, int numero, int cuotas, double monto, Date fechaInicio, Date fechaFin) {
        this.car = car;
        this.cli = cli;
        this.numero = numero;
        this.cuotas = cuotas;
        this.monto = monto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Carro getCar() {
        return car;
    }

    public void setCar(Carro car) {
        this.car = car;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Poliza{" + "car=" + car + ", cli=" + cli + ", numero=" + numero + ", cuotas=" + cuotas + ", monto=" + monto + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }
    

}
