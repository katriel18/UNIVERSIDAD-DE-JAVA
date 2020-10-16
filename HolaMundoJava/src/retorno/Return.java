package retorno;

import clases.Persona;

public class Return {

    public static void main(String[] args) {
        Persona p1 = null;
        ////error en tiempo de ejecucion
       // p1.nombre = "Luis";
        //System.out.println("p1.nombre = " + p1.nombre);
        cambioValor(p1);//se envia la referencia del objeto
        //System.out.println("nuevo valor de p1.nombre = " + p1.nombre);
    }

    public static void cambioValor(Persona p) {
        if(p==null){
            System.out.println("valor de persona invalido:null");
        }
    }

}
