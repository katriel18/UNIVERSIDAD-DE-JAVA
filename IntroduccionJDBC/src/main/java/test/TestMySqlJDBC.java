
package test;

import java.sql.*;

public class TestMySqlJDBC {
  
    public static void main(String[] args) {
        
        /*var url="jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true"
                +"&serverTimezone=UTC&allowPublicKeyRetrieval=true";*/
        
        var url="jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true"
                ;
         
        //Class.forName("com.mysql.cj.jdbc.Driver");//Para pagina web
        
        try {
            var sql="SELECT * FROM persona";
            
            Connection conexion=DriverManager.getConnection(url, "root", "");
            Statement instruccion=conexion.createStatement();           
            ResultSet resultado=instruccion.executeQuery(sql);
            
            System.out.println("id  nombre  apellido  email  telefono");
            while(resultado.next()){
                System.out.println(resultado.getInt("idpersona")+" "
                    +resultado.getString("nombre")+" "
                    +resultado.getString("apellido")+" "
                    +resultado.getString("email")+" "
                    +resultado.getString("telefono"));
            }
            
            resultado.close();
            instruccion.close();
            conexion.close();
            
        } catch (SQLException ex) {
            
            ex.printStackTrace(System.out);
            System.out.println("ERROR DE ACCESO");
            
        }
    }
}
