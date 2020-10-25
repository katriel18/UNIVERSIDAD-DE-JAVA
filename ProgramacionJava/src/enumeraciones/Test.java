
package enumeraciones;

public class Test {

    public static void main(String[] args) {
       
        System.out.println("Dia 1: " + Dias.LUNES);
        
        imprimir(Dias.MARTES);
        
    }
    private static void imprimir(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Dia 1");
            break;
            case MARTES:
                System.out.println("Dia 2");

        }
        /*
        switch(dia){
            case LUNES -> System.out.println("Dia 1");
            case MARTES -> System.out.println("Dia 2");
        }
        */
    }
    
}
