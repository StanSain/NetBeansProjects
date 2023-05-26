/*
 Nombre y apellido, documento, mail,
domicilio, teléfono.
 */
package entidades;

/**
 *
 * @author John
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String documento;
    private String domicilio;
    private String telefono;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String documento, String domicilio, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }
    
    
}
