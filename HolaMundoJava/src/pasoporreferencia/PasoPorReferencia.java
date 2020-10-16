package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        p1.nombre = "Luis";
        System.out.println("p1.nombre = " + p1.nombre);
        cambioValor(p1);//se envia la referencia del objeto
        System.out.println("nuevo valor de p1.nombre = " + p1.nombre);
    }

    public static void cambioValor(Persona p) {
        p.nombre = "Jhon";
    }

}
