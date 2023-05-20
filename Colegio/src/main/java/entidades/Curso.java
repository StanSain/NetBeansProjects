package entidades;

public class Curso {

    private int anio;

    private String division;

    private Profesor profe;

    public Curso() {
    }

    public Curso(int anio, String division, Profesor profe) {
        this.anio = anio;
        this.division = division;
        this.profe = profe;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public Profesor getProfe() {
        return profe;
    }

    public void setProfe(Profesor profe) {
        this.profe = profe;
    }
    

}
