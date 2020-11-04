package instanceOf.test;

import instanceOf.domain.Empleado;
import instanceOf.domain.Gerente;

public class Test2 {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan", 500);//padre
        Test2.determinarTipo(empleado);

        System.out.println();

        empleado = new Gerente("Juan", 1000, "Tecnologia");//hijo
        Test2.determinarTipo(empleado);
    }

    public static void determinarTipo(Empleado empleado) {

        if (empleado instanceof Gerente) {
            System.out.println("Tipo Gerente");
            
            //System.out.println( ((Gerente) empleado).getDepartamento());
            Gerente gerente = (Gerente) empleado;
            System.out.println(gerente.getDepartamento());
            
        }else if (empleado instanceof Empleado) {
            System.out.println("Tipo Empleado");

            System.out.println(empleado.getNombre());
            
        }else if (empleado instanceof Object) {
            System.out.println("Tipo Object");
            
            System.out.println(empleado.toString());
        }

    }

}
