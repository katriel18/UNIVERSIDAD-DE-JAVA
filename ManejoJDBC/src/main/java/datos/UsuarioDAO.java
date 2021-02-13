/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import domain.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class UsuarioDAO {

    private static final String SQL_SELECT = "SELECT * FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario(username,password) VALUES(?,?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET username=?,password=? WHERE idusuario=?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE idusuario=?";

    public List<Usuario> listar() {

        Connection conexion = null;
        PreparedStatement instruccion = null;
        ResultSet resultado = null;

        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<>();

        try {

            conexion = Conexion.getConnection();
            instruccion = conexion.prepareStatement(SQL_SELECT);
            resultado = instruccion.executeQuery();

            System.out.println("Query ejecutada: " + SQL_SELECT);

            while (resultado.next()) {

                usuario = new Usuario(resultado.getInt("idusuario"), resultado.getString("username"),
                        resultado.getString("password"));

                usuarios.add(usuario);
            }

        } catch (SQLException ex) {

            ex.printStackTrace(System.out);
            System.out.println("ERROR DE LECTURA EXTERNA");

        } finally {

            try {
                Conexion.close(resultado);
                Conexion.close(instruccion);
                Conexion.close(conexion);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
                System.out.println("ERROR DE LECTURA INTERNA");
            }

        }

        return usuarios;
    }

    public int insertar(Usuario usuario) {

        Connection conexion = null;
        PreparedStatement instruccion = null;

        int registros = 0;

        try {

            conexion = Conexion.getConnection();
            instruccion = conexion.prepareStatement(SQL_INSERT);

            instruccion.setString(1, usuario.getUsername());
            instruccion.setString(2, usuario.getPassword());

            System.out.println("Query ejecutada: " + SQL_INSERT);
            registros = instruccion.executeUpdate();
            System.out.println("Registros afectados: " + registros);
            
        } catch (SQLException ex) {

            ex.printStackTrace(System.out);
            System.out.println("ERROR DE ESCRITURA EXTERNA");

        } finally {

            try {
                Conexion.close(instruccion);
                Conexion.close(conexion);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
                System.out.println("ERROR DE ESCRITURA INTERNA");
            }

        }

        return registros;
    }

    public int actualizar(Usuario usuario) {

        Connection conexion = null;
        PreparedStatement instruccion = null;

        int registros = 0;

        try {

            conexion = Conexion.getConnection();
            instruccion = conexion.prepareStatement(SQL_UPDATE);

            instruccion.setString(1, usuario.getUsername());
            instruccion.setString(2, usuario.getPassword());
            instruccion.setInt(3, usuario.getIdUsuario());

            
            System.out.println("Query ejecutada: " + SQL_UPDATE);
            registros = instruccion.executeUpdate();
            System.out.println("Registros afectados: " + registros);
            
        } catch (SQLException ex) {

            ex.printStackTrace(System.out);
            System.out.println("ERROR DE ACTUALIZACION EXTERNA");

        } finally {

            try {
                Conexion.close(instruccion);
                Conexion.close(conexion);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
                System.out.println("ERROR DE ACTUALIZACION INTERNA");
            }

        }

        return registros;
    }

    public int eliminar(Usuario usuario) {

        Connection conexion = null;
        PreparedStatement instruccion = null;

        int registros = 0;

        try {

            conexion = Conexion.getConnection();
            instruccion = conexion.prepareStatement(SQL_DELETE);

            instruccion.setInt(1, usuario.getIdUsuario());

            
            System.out.println("Query ejecutada: " + SQL_DELETE);
            registros = instruccion.executeUpdate();
            System.out.println("Registros afectados: " + registros);

        } catch (SQLException ex) {

            ex.printStackTrace(System.out);
            System.out.println("ERROR DE ELIMINACION EXTERNA");

        } finally {

            try {
                Conexion.close(instruccion);
                Conexion.close(conexion);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
                System.out.println("ERROR DE ELIMINACION INTERNA");
            }

        }

        return registros;
    }
}
