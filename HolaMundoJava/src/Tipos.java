
public class Tipos {
    public static void main(String args[]){
        //definicion de la variable
        int variableEntera=20;
        System.out.println(variableEntera);
        //modificacion del valor de la variable
        variableEntera=18;
        System.out.println(variableEntera);//sout + tab
        
        String varibleCadena="hola";
        System.out.println(varibleCadena);//ctrl + space
        
         varibleCadena="adios";
        System.out.println(varibleCadena);//ctrl + space
        
        //var - inferencia de tipo
        var variableGeneral1=2;
        System.out.println(variableGeneral1);//sout + tab -> ctrl + space
        
        var variableGeneral2="dos";
        System.out.println("variableGeneral2 = " + variableGeneral2);//coutv + space
         
        
        
        //////////////////////errores///////////////////////////
        
        String color;
        //no se ha asignado aún un valor a la variable y el compilador manda el error:
        //System.out.println("color = " + color);
        
        
        //var variableGeneral2;//debe inicalizarse un tipo var al crearse
        
    }
}