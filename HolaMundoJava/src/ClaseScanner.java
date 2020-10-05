
import java.util.Scanner;

public class ClaseScanner {

    public static void main(String args[]) {
        var usuario = "CARLOS";
        System.out.println("usuario = " + usuario);

        Scanner consola = new Scanner(System.in);

        System.out.println("Escribe tu nombre:");
        usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);

     }
}
