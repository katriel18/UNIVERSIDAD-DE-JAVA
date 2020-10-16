
package encapsulamiento.dominio;

public class Persona {
    
    private String nombre;
    private String apellido;
    private boolean eliminado;

    public Persona(String nombre, String apellido, boolean eliminado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.eliminado = eliminado;
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

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", eliminado=" + eliminado + '}';
    }
    
    
    
}
