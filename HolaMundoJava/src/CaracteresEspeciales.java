
public class CaracteresEspeciales {

    public static void main(String args[]) {

        var nombre="KARLA";
        
        System.out.println("Nueva Linea: \n"+nombre);
        
        System.out.println("Tabulador: \t"+nombre);
        
        System.out.println("Retroceso: \b"+nombre);
        System.out.println("Retroceso: \b\b"+nombre);
        
        System.out.println("Comilla Simple: \'"+nombre+"\'");
        System.out.println("Comilla Simple: '"+nombre+"'");//no requerido la diagonal
        
        System.out.println("Comilla Doble: \""+nombre+"\"");//requerido la diagonal
    }
}
