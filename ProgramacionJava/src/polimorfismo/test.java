
package polimorfismo;

import sobreescritura.domain.*;

//multiples formas en tiempo de ejecucion

public class test {

    public static void main(String[] args) {
        
        Empleado empleado=new Empleado("Juan",500);//padre
       test.imprimir(empleado);
     
        //Gerente gerente=new Gerente("Juan",1000,"Tecnologia");//hijo
        empleado=new Gerente("Juan",1000,"Tecnologia");//hijo
        test.imprimir(empleado);
       
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
    
}
