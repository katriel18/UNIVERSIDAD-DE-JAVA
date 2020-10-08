
public class OperadoresCondicionales {

    public static void main(String args[]) {
        var a = 10;
        var r = a >= 0 && a <= 20;

        if (r) {
            System.out.println("dentro del rango");
        } else {
            System.out.println("fuerra del rango");
        }

        var vaciones = true;
        var diaDescanso = false;

        if (vaciones || diaDescanso) {
            System.out.println("puede asistir al estado");
        } else {
            System.out.println("no puede asistir al estado");
        }

    }

}
