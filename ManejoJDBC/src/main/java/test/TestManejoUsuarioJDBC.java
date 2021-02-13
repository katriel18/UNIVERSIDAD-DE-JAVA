
package test;

import datos.UsuarioDAO;
import domain.Persona;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuarioJDBC {

    public static void main(String[] args) {
        
        UsuarioDAO dao=new UsuarioDAO();
        
        //Insertar
//        Usuario usuarioI=new Usuario("juan.nehil","123");
//        dao.insertar(usuarioI);
        
        //Actualizar
//        Usuario usuarioA=new Usuario(3,"jhon.wick","123");
//        dao.actualizar(usuarioA);
        
        //Eliminar
//        Usuario usuarioE = new Usuario(2);
//        dao.eliminar(usuarioE);
        
        List<Usuario> lista=dao.listar();
        
        lista.forEach(usuario -> {
            System.out.println(usuario);
        });
        
    }
    
}
