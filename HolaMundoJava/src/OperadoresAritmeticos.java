
public class OperadoresAritmeticos {

    public static void main(String args[]) {

        //var a=3,b=2;//solo se usa el 'var' para declarar una variable
        int a = 3, b = 2;

        var r = a + b;
        System.out.println("suma = " + r);

        r = a - b;
        System.out.println("resta = " + r);

        r = a * b;
        System.out.println("muliplicacion = " + r);

        r = a / b;// r(entero) = a (entero)/ b (entero)
        System.out.println("divion entera = " + r);
        
        var r2 = a*1.0 / b;// r2(decimal) =a (entero) /b (entero)*1.0
        System.out.println("divion flotante = " + r2);
        
        r=a%b;
        System.out.println("modulo = " + r);
        
        if(a%2==0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
        
    }
}
