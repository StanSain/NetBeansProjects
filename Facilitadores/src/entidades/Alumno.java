package entidades;

/*ombre completo, DNI y cantidad de votos.
 */

/**
 *
 * @author John
 */
public class Alumno {
    private String nombre;
    private int dni;
    private int votos;

    public Alumno() {
    }

    public Alumno(String nombre, int dni, int votos) {
        this.nombre = nombre;
        this.dni = dni;
        this.votos = votos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
    
    
}
