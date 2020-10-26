
package foreach;

public class TestForEach {

    public static void main(String[] args) {
       int edades[]={22,11,55,99,33,66};
       
       for(int i:edades){
           System.out.println("i = " + i);
       }
       
       //var personas[];//error para arreglos,solo para variables locales
       Persona personas[]={new Persona("Luis"),new Persona("Juan"),new Persona("Pedro")};
       for(Persona p:personas){
           System.out.println("p = " + p);
       }
       for(Object p:personas){//un tipo compatible,puede ser el padre si es herencia
           System.out.println("p = " + p);
       }
       
    }
    
}
