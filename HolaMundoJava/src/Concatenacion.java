
public class Concatenacion {

    public static void main(String args[]) {
        
        //no se recomienda acentos en el programa en general
        
        var usuario = "Juan";
        var titulo = "Ingeniero";
        
        var union = usuario + " " + titulo;
        
        System.out.println("union = " + union);
        
        var  i=3;
        var j=4;
        System.out.println(i+j);//7
    
        System.out.println(i+j+usuario);//7Juan//suma+concatenacion
        System.out.println(usuario+i+j);//Juan34//concatenacion pura
        System.out.println(usuario+(i+j));//suma+concatenacion
    }
}
