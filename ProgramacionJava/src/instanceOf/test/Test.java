package instanceOf.test;

import instanceOf.domain.Empleado;
import instanceOf.domain.Gerente;

public class Test {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan", 500);//padre
        Test.determinarTipo(empleado);
        
        System.out.println();
        
        empleado = new Gerente("Juan", 1000, "Tecnologia");//hijo
        Test.determinarTipo(empleado);
    }

    public static void determinarTipo(Empleado empleado) {

        if (empleado instanceof Gerente) {
            System.out.println("Tipo Gerente");
        } else if (empleado instanceof Empleado) {
            System.out.println("Tipo Empleado");
        } else if (empleado instanceof Object) {
            System.out.println("Tipo Object");
        }

    }

}
