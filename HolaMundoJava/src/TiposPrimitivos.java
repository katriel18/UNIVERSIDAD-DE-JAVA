
public class TiposPrimitivos {

    public static void main(String args[]) {

        /*
            tipos primitivos enteros: 
            byte 8 bits , short 16 bits, int 32 bits, long 64 bits.
         */
        
        //Byte///////////////////////////////////////////
        System.out.println("Byte:");
        System.out.println("Bytes: "+Byte.BYTES);
        System.out.println("Minimo valor: "+Byte.MIN_VALUE);
        System.out.println("Maximo valor: "+Byte.MAX_VALUE);
        System.out.println("Bits: "+Byte.SIZE);
        System.out.println("Tipo: "+Byte.TYPE);
        
        byte numByte=20;
        System.out.println("numByte = " + numByte);
        
        //numByte=128;//error excede el maximo valor(error de conversion)
        numByte=(byte)128;// perdida de precision(perdida de bits)
        System.out.println("numByte = " + numByte);
        
        //short///////////////////////////////////////////
        System.out.println("short:");
        System.out.println("Bytes: "+Short.BYTES);
        System.out.println("Minimo valor: "+Short.MIN_VALUE);
        System.out.println("Maximo valor: "+Short.MAX_VALUE);
        System.out.println("Bits: "+Short.SIZE);
        System.out.println("Tipo: "+Short.TYPE);
        
        //int///////////////////////////////////////////
        System.out.println("int:");
        System.out.println("Bytes: "+Integer.BYTES);
        System.out.println("Minimo valor: "+Integer.MIN_VALUE);
        System.out.println("Maximo valor: "+Integer.MAX_VALUE);
        System.out.println("Bits: "+Integer.SIZE);
        System.out.println("Tipo: "+Integer.TYPE);
        
        
        //superar el tipo entero de la literal por defecto
        //por defecto es entero
        //int num=948594754975454;//error de literal por defecto
        //int num=948594754975454L;//error de conversion
        int num=(int)948594754975454L;
        
        //long///////////////////////////////////////////
        System.out.println("long:");
        System.out.println("Bytes: "+Long.BYTES);
        System.out.println("Minimo valor: "+Long.MIN_VALUE);
        System.out.println("Maximo valor: "+Long.MAX_VALUE);
        System.out.println("Bits: "+Long.SIZE);
        System.out.println("Tipo: "+Long.TYPE);
    }

}
