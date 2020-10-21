package matrices;

public class TestMatrices {

    public static void main(String[] args) {

        //int numeros[][]=new int[3][];//no es necesario definir las columnas
        int numeros[][] = new int[3][2];

        System.out.println("numeros = " + numeros);

        numeros[0][0] = 12;
        numeros[0][1] = 15;
        System.out.println("0-0 = " + numeros[0][0]);
        System.out.println("0-1 = " + numeros[0][1]);

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println(numeros[i][j]);
            }
        }

        //sintaxis resumida
        String frutas[][] = {{"Pera", "Fresa"}, {"Coco", "Miel"}};
        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[i].length; j++) {
                System.out.println(frutas[i][j]);
            }
        }
        imprimir(frutas);

        Persona personas[][] = new Persona[3][2];
        personas[0][0] = new Persona("Luis");
        personas[0][1] = new Persona("Jhon");
        imprimir(personas);
    }

    public static void imprimir(Object matriz[][]) {
        System.out.println(" =========================== ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
        System.out.println(" =========================== ");
    }
}

class Persona {

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + "}," + super.toString();
    }

}
