
public class TipoPrimitivoChar {
    public static void main(String args[]){
        
        //List of Unicode characters
        
        System.out.println("char:");
        System.out.println("Bytes: "+Character.BYTES);
        System.out.println("Minimo valor: "+Character.MIN_VALUE);
        System.out.println("Maximo valor: "+Character.MAX_VALUE);
        System.out.println("Bits: "+Character.SIZE);
        System.out.println("Tipo: "+Character.TYPE);
        
        char letraChar='a';
        System.out.println("letraChar = " + letraChar);
        int letraInt='a';//conversion automatica  char(16 bits)->int(32 bits)
        System.out.println("letraInt = " + letraInt);
        
        
        
        
        //Signo de Exlamacion
        //usando la varable 'var'
        System.out.println("char");
        
        char code='\u0021';
        System.out.println("code = " + code);
        
        char decimal=33;
        System.out.println("decimal = " + decimal);
        
        char simbolo='!';
        System.out.println("simbolo = " + simbolo);
        
        //usando la varable 'var'
        System.out.println("VAR");
        
        var code2='\u0021';
        System.out.println("code2 = " + code2);
        
        var decimal2=33;
        System.out.println("decimal2 = " + decimal2);
        var decimalConvertida=(char)33;
        System.out.println("decimalConvertida = " + decimalConvertida);
        
        var simbolo2='!';
        System.out.println("simbolo2 = " + simbolo2);
        
     }
}
