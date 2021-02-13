package datos;

import domain.Persona;
import java.sql.*;
import java.util.*;

public class PersonaDAO {

    private static final String SQL_SELECT = "SELECT * FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre,apellido,email,telefono) VALUES(?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre=?,apellido=?,email=?,telefono=? WHERE idpersona=?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE idpersona=?";

    public List<Persona> listar() {

        Connection conexion = null;
        PreparedStatement instruccion = null;
        ResultSet resultado = null;

        Persona persona = null;
        List<Persona> personas = new ArrayList<>();

        try {

            conexion = Conexion.getConnection();
            instruccion = conexion.prepareStatement(SQL_SELECT);
            resultado = instruccion.executeQuery();

            while (resultado.next()) {

                persona = new Persona(resultado.getInt("idpersona"), resultado.getString("nombre"),
                        resultado.getString("apellido"), resultado.getString("email"), resultado.getString("telefono"));

                personas.add(persona);
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

        return personas;
    }

    public int insertar(Persona persona) {

        Connection conexion = null;
        PreparedStatement instruccion = null;
        
        int registros=0;
        
        try {

            conexion = Conexion.getConnection();
            instruccion = conexion.prepareStatement(SQL_INSERT);

            instruccion.setString(1,persona.getNombre());
            instruccion.setString(2,persona.getApellido());
            instruccion.setString(3,persona.getEmail());
            instruccion.setString(4,persona.getTelefono());
            
            registros=instruccion.executeUpdate();
            
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
    
    public int actualizar(Persona persona) {

        Connection conexion = null;
        PreparedStatement instruccion = null;
        
        int registros=0;
        
        try {

            conexion = Conexion.getConnection();
            instruccion = conexion.prepareStatement(SQL_UPDATE);

            instruccion.setString(1,persona.getNombre());
            instruccion.setString(2,persona.getApellido());
            instruccion.setString(3,persona.getEmail());
            instruccion.setString(4,persona.getTelefono());
            instruccion.setInt(5,persona.getIdPersona());
            
            registros=instruccion.executeUpdate();
            
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
    
    public int eliminar(Persona persona) {

        Connection conexion = null;
        PreparedStatement instruccion = null;
        
        int registros=0;
        
        try {

            conexion = Conexion.getConnection();
            instruccion = conexion.prepareStatement(SQL_DELETE);

            instruccion.setInt(1,persona.getIdPersona());
            
            registros=instruccion.executeUpdate();
            
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
