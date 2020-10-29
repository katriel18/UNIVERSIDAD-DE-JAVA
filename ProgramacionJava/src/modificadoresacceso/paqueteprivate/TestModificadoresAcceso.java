package modificadoresacceso.paqueteprivate;


public class TestModificadoresAcceso{
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1("Publico");
        clase1.setAtributoPrivado("cambio valor atributo");
        System.out.println("clase1 = " + clase1.getAtributoPrivado());
    }
}
