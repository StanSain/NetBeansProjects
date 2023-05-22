/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author John
 */
public class Persona {
    private String nombre;
    private boolean yaTiene;

    public Persona() {
        this.yaTiene=false;
    }

    public Persona(String nombre, boolean yaTiene) {
        this.nombre = nombre;
        this.yaTiene = yaTiene;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isYaTiene() {
        return yaTiene;
    }

    public void setYaTiene(boolean yaTiene) {
        this.yaTiene = yaTiene;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", yaTiene=" + yaTiene + '}';
    }
    
}
