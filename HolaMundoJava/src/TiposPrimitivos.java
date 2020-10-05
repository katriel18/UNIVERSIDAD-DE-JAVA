
public class TiposPrimitivos {

    public static void main(String args[]) {

        /*
            tipos primitivos enteros: 
            byte 8 bits , short 16 bits, int 32 bits, long 64 bits.
         */
        
        //Byte
        System.out.println("Bytes: "+Byte.BYTES);
        System.out.println("Minimo valor: "+Byte.MIN_VALUE);
        System.out.println("Maximo valor: "+Byte.MAX_VALUE);
        System.out.println("Bits"+Byte.SIZE);
        System.out.println("Tipo"+Byte.TYPE);
        
        byte numByte=20;
        System.out.println("numByte = " + numByte);
        
        //numByte=128;//error excede el maximo valor
        numByte=(byte)128;//conversion a un tipo byte
        System.out.println("numByte = " + numByte);
    }

}
