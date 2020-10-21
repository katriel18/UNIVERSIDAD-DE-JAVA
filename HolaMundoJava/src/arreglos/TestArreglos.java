
package arreglos;

public class TestArreglos {

    public static void main(String[] args) {
        
        //no crecen dinamicamente
        //varable->objeto Arreglo 
        int edades[]=new int[5];//ya no sirve modificar la cantidad del objeto,pero la variblae si
       
        System.out.println("a = " + edades);
        
        edades[0]=10;
        System.out.println("edades[0] = " + edades[0]);        
        
        //edades[10]=15;//produce un error en tiempo de ejecucion
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
        
        for(int i=0;i<edades.length;i++){
            System.out.println("edades["+i+"] = " + edades[i]);
        }
        
        //sintaxis resumida
        String frutas[]={"Pera","Fresa"};
       for(int i=0;i<frutas.length;i++){
            System.out.println( frutas[i]);
        }
        
    }
    
}
