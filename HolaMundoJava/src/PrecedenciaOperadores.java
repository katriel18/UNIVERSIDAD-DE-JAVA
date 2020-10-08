
public class PrecedenciaOperadores {

    public static void main(String args[]) {

        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        var r = 4 + 5 * 6 / 3;//4+((5*6)/3)
        System.out.println("r = " + r);

        r = (4 + 5) * 6 / 3;//
        System.out.println("r = " + r);

    }
}
