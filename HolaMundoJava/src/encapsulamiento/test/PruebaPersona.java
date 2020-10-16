
package encapsulamiento.test;

import encapsulamiento.dominio.Persona;


public class PruebaPersona {

    public static void main(String[] args) {
       
        
        Persona p=new Persona("Juan","Jose",false);
        
        System.out.println(p.getNombre());
        p.setNombre("Jhon");
        System.out.println(p.getNombre());
        
        System.out.println("p.getApellido = " + p.getApellido());
        System.out.println("p.isEliminado = " + p.isEliminado());
        
        System.out.println("p = " + p.toString());
        System.out.println("p = " + p);
    }
    
}
