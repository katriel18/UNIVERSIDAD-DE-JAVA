
public class OperadoresUnarios {
   
    public static void main(String args[]) {
        
        var a=3;
        var b=-a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c=true;
        var d=!c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        System.out.println("pre-incremento");
        var e=5;
        var f=++e;//primero se incrementa la variable y despues se usa el valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        System.out.println("post-incremento");
        var g=5;
        var h=g++;//primero se utiliza el valor y despues se incrementa 
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        System.out.println("pre-decremento");
        var i=5;
        var j=--i;//primero se incrementa la variable y despues se usa el valor
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        System.out.println("post-decremento");
        var k=5;
        var l=k--;//primero se utiliza el valor y despues se incrementa 
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    
    }
}
