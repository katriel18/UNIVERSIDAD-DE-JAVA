
public class TipoBoolean {
    public static void main(String args[]){
        
        System.out.println("boolean:");
        System.out.println("TYPE: "+Boolean.TYPE);
        System.out.println("FALSE: "+Boolean.FALSE);
        System.out.println("TRUE: "+Boolean.TRUE);

        
        boolean bandera=false;
        
        if(bandera){
            System.out.println("La bandera esta activa");
        }else{
            System.out.println("La bandera esta desactiva");
        }
        
        int edad=11;
        //var mayor=edad>=18;
        if(edad>=18){
            System.out.println("Mayor de edad");
        }else{
            System.out.println("Menor de edad");
        }
    }
}
