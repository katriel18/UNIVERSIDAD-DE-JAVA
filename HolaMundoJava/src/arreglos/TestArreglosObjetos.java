
package arreglos;

public class TestArreglosObjetos {

    public static void main(String[] args) {
  
        Persona personas[]=new Persona[2];
   
        personas[0]=new Persona("Luis");
        personas[1]=new Persona("Jhon");

        for(int i=0;i<2;i++){
            System.out.println( personas[i].toString());
        
        
    }
        
    }
    
}

class Persona{
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + "},"+super.toString();
    }
    
}
