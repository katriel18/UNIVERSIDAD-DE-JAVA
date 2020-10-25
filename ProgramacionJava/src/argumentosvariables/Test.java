package argumentosvariables;

public class Test {

    public static void main(String[] args) {
        imprimir();
        imprimir(18);
        imprimir(18, 81);
        imprimir("Jose", 18, 81, 18);
    }

    private static void imprimir(int... numeros) {

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("i = " + numeros[i]);
        }

    }

    private static void imprimir(String nombre, int... numeros) {

        System.out.println("nombre = " + nombre);
        imprimir(numeros);

    }

}
