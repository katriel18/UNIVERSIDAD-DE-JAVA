package modificadoresacceso.paqueteprotected.padre;

import modificadoresacceso.paqueteprotected.hijo.Clase2;

public class Clase2Hija extends Clase2 {

    public Clase2Hija() {
        super();
        this.atributoProtected="modeificacion atributo protected";
        System.out.println(this.atributoProtected);
        this.metodoProtected();
    }
    
    
}
