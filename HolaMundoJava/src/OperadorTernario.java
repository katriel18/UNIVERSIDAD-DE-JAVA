
public class OperadorTernario {

    public static void main(String args[]) {

        var resultado = (8 > 4) ? "Es mayor" : "Es menor";
        System.out.println("resultado = " + resultado);

        var numero =4;
        resultado = numero % 2 == 0 ? "Es par" : "Es impar";
        System.out.println("resultado = " + resultado);
    }
}
