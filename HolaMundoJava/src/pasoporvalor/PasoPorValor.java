
package pasoporvalor;

public class PasoPorValor {

    public static void main(String[] args) {
       var x=10;
        System.out.println("x = " + x);
        cambioValor(x);//se envia una copia del valor primitivo
        System.out.println("nuevo valor de x = " +  x);
    }
    
    public static void cambioValor(int arg){
        System.out.println("arg = " + arg);
        arg=20;
    }
    
}
