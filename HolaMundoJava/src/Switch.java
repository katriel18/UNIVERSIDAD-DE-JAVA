
public class Switch {

    public static void main(String args[]) {

        var numero = 35;
        var texto = "Desconocido";

        switch (numero) {
            case 1:
                texto = "uno";
                break;
            case 2:
                texto = "dos";
                break;
            case 3:
                texto = "tres";
                break;
            default:
                break;
        }
        System.out.println("texto = " + texto);

    }
}


/*
//2da forma

switch (numero) {
            case 1 -> texto = "uno";
            case 2 -> texto = "dos";
            case 3 -> texto = "tres";
            default -> {
            }
        }
*/
