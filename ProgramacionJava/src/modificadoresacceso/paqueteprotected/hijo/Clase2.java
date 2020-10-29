package modificadoresacceso.paqueteprotected.hijo;

public class Clase2 {
    
    protected String atributoProtected="atributo Protected";

    protected Clase2() {
        System.out.println("constructor Protected");
    }
    
    public Clase2(String args) {
        System.out.println("constructor Public");
    }

    protected void metodoProtected() {
        System.out.println("metodo Protected");
    }
    
    
    
    
}
