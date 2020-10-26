
package boxing;


public class Test {

    public static void main(String[] args) {
        /*
        Integer-int
        Long-long
        Float-Float
        Double-double
        boolean-Boolean
        byte-Byte
        char-Character
        short-Short
        */
        
        
       int var1=10;//para realizar calculos los primitivos son recomendados
       Integer var2=15;//Autoboxing
       
        System.out.println("var2 = " + var2);              //entero
        System.out.println("var2 = " + var2.toString());  //cadena 
        System.out.println("var2 = " + var2.doubleValue());//double
        
        //Unboxing
        int var3=var2;
        System.out.println("var3 = " + var3);
        
    }
    
}
