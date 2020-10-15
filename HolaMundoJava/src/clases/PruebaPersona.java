
package clases;

public class PruebaPersona {
   
    public static void main(String[] args) {
        Persona p1;//variable 'p1' que guarda la referancia a un objeto Persona
        p1=new Persona();//se crea objeto Persona y se asigna su referencia a 'p1'
        p1.nombre="Jose";
        p1.apellido="Maria";
        p1.desplegarInformacion();
        
        Persona p2=new Persona();//instancia de clase = objeto
        
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        
        p2.desplegarInformacion();
        
        p2.nombre="Javier";
        p2.apellido="Flores";
        p2.desplegarInformacion();
        
    }
}
