
package operaciones;

public class Aritmetica {
    //atributos
    int a;
    int b;
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
