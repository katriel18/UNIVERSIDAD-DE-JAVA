
package bloquesinicializacion;

public class Persona {
    
    private final int idPersona; 
    private static int contadorPersonas;
    
    //Se ejecutan antes del constructor y son bloques de inicializacion:
    //solo se va a cargar la primera vez que se carga a memoria la clase
    static{
        System.out.println("Ejecucion de bloque estatico" );//estatico
        ++Persona.contadorPersonas;
        //this.idPersona=10;//error
    }
    //se va ejecutar cada vez que se crea un objeto d nuestra clase
    {
        System.out.println("Ejecucion de bloque no estatico" );//dinanmico
        this.idPersona=Persona.contadorPersonas++;
    }
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
}
