
public class InferenciaTipos {
     public static void main(String args[]){
         
         //error
        //var num;//siempre se debe de inicializar
         
        //visualizar los tipos con el modo debugger usando el punto de ruptura
        
         var numInt=10;
         System.out.println("numInt = " + numInt);
         
         var numDouble=10.0;//var numDouble=10.0D;
         System.out.println("numDouble = " + numDouble);
         
         var numLong=10L;
         System.out.println("numLong = " + numLong);
         
         var numFloat=10.0F;
         System.out.println("numFloat = " + numFloat);
         
         var letra='a';
         System.out.println("letra = " + letra);
         var cadena="aeiou";
         System.out.println("cadena = " + cadena);
         
     }
}
