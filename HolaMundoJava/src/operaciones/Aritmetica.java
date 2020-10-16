
package operaciones;

public class Aritmetica {
    
    //atributos
    int a;
    int b;
    
    //constructor
    public Aritmetica(){
        System.out.println("Ejecutadno constructor");
    }
    public Aritmetica(int a,int b){//no esta permitido usar 'var'
        this.a=a;
        this.b=b;
        System.out.println("Ejecutando constructor con argumentos");
    }

    //metodos
    public void sumar(){
        int resultado=a+b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        return a+b;
    }
    
//    public int sumerConArgumentos(int arg1,int arg2){
//        a=arg1;
//        b=arg2;
//        //return a+b;
//        return sumarConRetorno();
//    }
    
    public int sumerConArgumentos(int a,int b){
        this.a=a;
        this.b=b;
        return this.sumarConRetorno();
    }
}
