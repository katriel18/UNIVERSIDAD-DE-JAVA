
package polimorfismo;

import sobreescritura.domain.*;

//multiples formas en tiempo de ejecucion

public class test {

    public static void main(String[] args) {
        
        Empleado empleado=new Empleado("Juan",500);//padre
        //System.out.println("empleado = " + empleado.obtenerDetalles());
        test.imprimir(empleado);
     
        Gerente gerente=new Gerente("Juan",1000,"Tecnologia");//hijo
        //System.out.println("gerente = " + gerente.obtenerDetalles());
        test.imprimir(gerente);
       
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
    
}
