package datos;

import domain.Persona;
import java.sql.*;
import java.util.*;

public class PersonaDAO {

    private Connection conexionTransaccional;
    
    private static final String SQL_SELECT = "SELECT * FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre,apellido,email,telefono) VALUES(?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre=?,apellido=?,email=?,telefono=? WHERE idpersona=?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE idpersona=?";

    public PersonaDAO() {
    }

    public PersonaDAO(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    
    public List<Persona> listar() throws SQLException {

        Connection conexion = null;
        PreparedStatement instruccion = null;
        ResultSet resultado = null;

        Persona persona = null;
        List<Persona> personas = new ArrayList<>();

        try {

            conexion = this.conexionTransaccional!=null?this.conexionTransaccional:Conexion.getConnection();
            instruccion = conexion.prepareStatement(SQL_SELECT);
            resultado = instruccion.executeQuery();
            
            System.out.println("Query ejecutada: " + SQL_SELECT);
            
            while (resultado.next()) {

                persona = new Persona(resultado.getInt("idpersona"), resultado.getString("nombre"),
                        resultado.getString("apellido"), resultado.getString("email"), resultado.getString("telefono"));

                personas.add(persona);
            }

        } finally {

            try {
                Conexion.close(resultado);
                Conexion.close(instruccion);
                if(this.conexionTransaccional==null){
                    Conexion.close(conexion);
                }
                
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
                System.out.println("ERROR DE LECTURA INTERNA");
            }

        }

        return personas;
    }

    public int insertar(Persona persona) throws SQLException {

        Connection conexion = null;
        PreparedStatement instruccion = null;
        
        int registros=0;
        
        try {

            conexion = this.conexionTransaccional!=null?this.conexionTransaccional:Conexion.getConnection();
            instruccion = conexion.prepareStatement(SQL_INSERT);

            instruccion.setString(1,persona.getNombre());
            instruccion.setString(2,persona.getApellido());
            instruccion.setString(3,persona.getEmail());
            instruccion.setString(4,persona.getTelefono());
            
            registros=instruccion.executeUpdate();
            
            System.out.println("Query ejecutada: " + SQL_INSERT);
        } finally {

            try {
                Conexion.close(instruccion);
                if(this.conexionTransaccional==null){
                    Conexion.close(conexion);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
                System.out.println("ERROR DE ESCRITURA INTERNA");
            }

        }

        return registros;
    }
    
    public int actualizar(Persona persona) throws SQLException {

        Connection conexion = null;
        PreparedStatement instruccion = null;
        
        int registros=0;
        
        try {

            conexion = this.conexionTransaccional!=null?this.conexionTransaccional:Conexion.getConnection();
            instruccion = conexion.prepareStatement(SQL_UPDATE);

            instruccion.setString(1,persona.getNombre());
            instruccion.setString(2,persona.getApellido());
            instruccion.setString(3,persona.getEmail());
            instruccion.setString(4,persona.getTelefono());
            instruccion.setInt(5,persona.getIdPersona());
            
            registros=instruccion.executeUpdate();
            
            System.out.println("Query ejecutada: " + SQL_UPDATE);
        } finally {

            try {
                Conexion.close(instruccion);
                if(this.conexionTransaccional==null){
                    Conexion.close(conexion);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
                System.out.println("ERROR DE ACTUALIZACION INTERNA");
            }

        }

        return registros;
    }
    
    public int eliminar(Persona persona) throws SQLException {

        Connection conexion = null;
        PreparedStatement instruccion = null;
        
        int registros=0;
        
        try {

            conexion = this.conexionTransaccional!=null?this.conexionTransaccional:Conexion.getConnection();
            instruccion = conexion.prepareStatement(SQL_DELETE);

            instruccion.setInt(1,persona.getIdPersona());
            
            registros=instruccion.executeUpdate();
            
            System.out.println("Query ejecutada: " + SQL_DELETE);
        } finally {

            try {
                Conexion.close(instruccion);
                if(this.conexionTransaccional==null){
                    Conexion.close(conexion);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
                System.out.println("ERROR DE ELIMINACION INTERNA");
            }

        }

        return registros;
    }

}
