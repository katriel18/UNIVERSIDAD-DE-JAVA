
public class BreakContinue {

    public static void main(String[] args) {

//        for(var contador=0;contador<3;contador++){
//            if(contador%2==0){
//                System.out.println("contador = " + contador);
//                break;//SALE DEL CICLO AL EJECUTARSE EL IF
//            }
//        }


        for (var contador = 0; contador < 3; contador++) {
            if (contador % 2 == 0) {
                continue;//ir a la siguiente iteracion ignorando lo demasS
            }
            System.out.println("contador = " + contador);
        }
    }

}
