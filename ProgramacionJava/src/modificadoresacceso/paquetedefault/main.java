
package modificadoresacceso.paquetedefault;

public class main {

    public static void main(String[] args) {
        
        Clase3 padre=new  Clase3();
        padre.atributoDefault="modificado";
        System.out.println(padre.atributoDefault);   
        padre.metodoDefault();
        
        Clase3Hija hija=new  Clase3Hija();
        System.out.println(hija);
        
        
    }
    
}
