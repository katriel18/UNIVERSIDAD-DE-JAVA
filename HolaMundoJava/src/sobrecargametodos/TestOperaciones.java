
package sobrecargametodos;

public class TestOperaciones {

    public static void main(String[] args) {
        
        System.out.println(Operaciones.sumar(4, 2));
        
        
        System.out.println(Operaciones.sumar(4,2.0));
        
        
        //Segun la jerarquia de clases se aplica  int < Long < Double
        System.out.println(Operaciones.sumar(4,2L));
        
    }
    
}
