
package operaciones;

public class PruebaAritmetica {

    //Los metodos staticos no pueden acceder al operador 'this'
    public static void main(String[] args) {
        
        Aritmetica a1=new Aritmetica();
        
        a1.a=4;
        a1.b=6;
        a1.sumar();
        
        int r=a1.sumarConRetorno();
        System.out.println("r = " + r);
        
        r=a1.sumerConArgumentos(6, 6);//metodo con parametros
        System.out.println("r = " + r);
    
    }
    
}
