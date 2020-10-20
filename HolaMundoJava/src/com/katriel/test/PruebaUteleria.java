
package com.katriel.test;

//import com.katriel.paquetes.*;//es lo mismo, no afecta la eficiencia
import com.katriel.paquetes.Utileria;

//importacion de un metodo estatico para su uso sin su clase
import static com.katriel.paquetes.Utileria.imprimir;

public class PruebaUteleria {

    public static void main(String[] args) {
       
        Utileria.imprimir("1er forma");//recomendado
        
        imprimir("2da forma");
        
        
        com.katriel.paquetes.Utileria.imprimir("3era forma");
    }
    
}
