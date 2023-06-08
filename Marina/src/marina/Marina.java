/*n un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo*/



package marina;

import entidades.Barco;
import entidades.Motor;
import entidades.Velero;
import entidades.Yate;
import java.util.ArrayList;

/**
 *
 * @author John
 */
public class Marina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Barco> a = new ArrayList<Barco>();
        Barco b = new Barco();
        b.construyeBarco(a, b);
        ArrayList<Velero> av = new ArrayList<Velero>();
        Velero v = new Velero();
        v.construirVelero(av, v);
        ArrayList<Motor> am = new ArrayList<Motor>();
        Motor m = new Motor();
        m.construirMotor(am, m);        
    ArrayList<Yate> ay = new ArrayList<Yate>();
        Yate y = new Yate();
        y.construirYate(ay, y); 
    }
    
}
