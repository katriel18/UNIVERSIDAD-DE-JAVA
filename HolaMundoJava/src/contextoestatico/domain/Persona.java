
package contextoestatico.domain;

public class Persona {
    private int idPersona;
    private String nombre;
    private static int cantPersonas;
    public Persona(String nombre){
        this.nombre=nombre;
        Persona.cantPersonas++;//no recomendable usar this para 'static'
        this.idPersona=Persona.cantPersonas;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getCantPersonas() {
        return cantPersonas;
    }

    public static void setCantPersonas(int cantPersonas) {
        Persona.cantPersonas = cantPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }

}
