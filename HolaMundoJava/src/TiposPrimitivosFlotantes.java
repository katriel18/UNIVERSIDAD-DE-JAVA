
public class TiposPrimitivosFlotantes {
    public static void main(String args[]) {
        
        /*
            tipos primitivos flotentes: 
            float 32 bits, double 64 bits.
         */
        
        //float///////////////////////////////////////////
        System.out.println("float:");
        System.out.println("Bytes: "+Float.BYTES);
        System.out.println("Minimo valor: "+Float.MIN_VALUE);
        System.out.println("Maximo valor: "+Float.MAX_VALUE);
        System.out.println("Bits: "+Float.SIZE);
        System.out.println("Tipo: "+Float.TYPE);
        
        float numFloat=10;//por defecto se hace conversion de int a float
        System.out.println("numFloat = " + numFloat);
        
        //error
        //numFloat=10.5;//las literales flotantes por defecto son double
        //solucion
        numFloat=(float)10.5;//conversion de double a float
        System.out.println("numFloat = " + numFloat);
        numFloat=(float)10.5D;//es lo mismo ue el anterior
        System.out.println("numFloat = " + numFloat);
        numFloat=10.5F;//forma de declarar un float
        System.out.println("numFloat = " + numFloat);
        
        
        //double///////////////////////////////////////////
        System.out.println("double:");
        System.out.println("Bytes: "+Double.BYTES);
        System.out.println("Minimo valor: "+Double.MIN_VALUE);
        System.out.println("Maximo valor: "+Double.MAX_VALUE);
        System.out.println("Bits: "+Double.SIZE);
        System.out.println("Tipo: "+Double.TYPE);
        
        double numDouble=10;//conversion automatica de int a double
        System.out.println("numDouble = " + numDouble);
        
        numDouble=10.5;//las literales flotantes por defecto son double
        System.out.println("numDouble = " + numDouble);
        numDouble=10.5D;//es lo mismo ue el anterior mas formal
        System.out.println("numDouble = " + numDouble);
    
    }
    
}
