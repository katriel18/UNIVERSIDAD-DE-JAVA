
package contextoestatico.test;

import contextoestatico.domain.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        
        Persona persona1=new Persona("Jose");
        Persona persona2=new Persona("Juan");
        
        
        PersonaPrueba.imprimir(persona1);
        imprimir(persona2);
    }
    
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    
}

/*


contexto estatico//no puede ingresar al dinamico
        'carga clasees'
no se usa this
metodo estatico->no accede a metdos y atributos no estaticos, solo a estaticos      

contexto dinamico//si puede ingresar al estatico
        'carga objetos'
si se usa this
metodo no estatico->si accede a metodo y atributos no estatico y estaticos
*/