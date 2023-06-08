/*
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
 */
package entidades;
import java.util.Date;
/**
 *
 * @author John
 */
public class Cuota {
    private Poliza pol;
    private int numero;
    private double monto;
    private boolean pagada;

    public Cuota() {
    }

    public Cuota(Poliza pol, int numero, double monto, boolean pagada) {
        this.pol = pol;
        this.numero = numero;
        this.monto = monto;
        this.pagada = pagada;
    }

    public Poliza getPol() {
        return pol;
    }

    public void setPol(Poliza pol) {
        this.pol = pol;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    @Override
    public String toString() {
        return "Cuota{" + "pol=" + pol + ", numero=" + numero + ", monto=" + monto + ", pagada=" + pagada + '}';
    }
    
    

    
}
