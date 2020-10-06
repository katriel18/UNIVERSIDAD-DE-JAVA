
import java.util.Scanner;


public class ConversionPrimitivos {
    public static void main(String args[]) {
        //conversion de un tipo String a in int
        
//        int edad=Integer.parseInt("20");//var edad=Integer.parseInt("20");
//        System.out.println("edad = " + (edad+1));
//        
//        double pi=Double.parseDouble("20.0");//var edad=Integer.parseInt("20");
//        System.out.println("pi = " + pi);
//        
//        var consola=new Scanner(System.in);
//        System.out.println("Proporciona tu edad:");
//        edad=Integer.parseInt(consola.nextLine());
//        System.out.println("edad = " + (edad+1));
        
        //conversion de un tipo int a String
        
        var edadTexto=String.valueOf(18);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter="Hola".charAt(1);
        System.out.println("caracter = " + caracter);
        
        var entrada=new Scanner(System.in);
        System.out.println("Proporciona un texto:");
        caracter=entrada.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
    }
}
