
package palabrathis;

public class PalabraThis {

    public static void main(String[] args) {
     
//        //INEFICIENTE, SE UTILIAZA DIFERENTES REFERENCIAS A OBJETOS
//        Persona p1=new Persona(new String("Juan"),new String("Juan"));
//        System.out.println("p1 = " + p1);
//        System.out.println("p1.nombre = " + p1.nombre);
//        System.out.println("p1.apellido = " + p1.apellido);
//        
//        //EFICIENTE,SE REUTILIZA LA MISMA REFERENCIA DE UN OBJETO
//        Persona p2=new Persona("Juan","Juan");
//        System.out.println("p2 = " + p2);
//        System.out.println("p2.nombre = " + p2.nombre);
//        System.out.println("p2.apellido = " + p2.apellido);
        
        
        Persona p=new Persona("Maria","Jose");
        System.out.println("p = " + p);
        System.out.println("p.nombre = " + p.nombre);
        System.out.println("p.apellido = " + p.apellido);
        
        
        
    }
    
}

 class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre,String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
        System.out.println("objeto persona usando this = " +this);
        new Imprimir().imprimir(this);
    }
            
    
}
class Imprimir{
    
    public Imprimir(){
        super();//constructor de la clase object (padre),reserva memoria
    }
    
    public void imprimir(Persona persona){
        System.out.println("persona desde imprimir = " + persona);
        System.out.println("impresiondel objeto actual (this) = " + this);
    }
}
