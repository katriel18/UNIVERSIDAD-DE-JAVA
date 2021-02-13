package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import java.sql.Connection;
import java.sql.SQLException;

public class TestManejoPersonaJDBC {

    public static void main(String[] args) {

        Connection conexion = null;

        try {

            //configuracion de la conexion transaccional
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            PersonaDAO dao = new PersonaDAO(conexion);

            //sentencias transaccionales
            Persona personaA = new Persona(6, "Luis", "Perez", "luis@gmail.com", "933451234");
            dao.actualizar(personaA);

            Persona personaI = new Persona("Alvaro", "Valentin", "av@gmail.com", "933451234");
            //prueba del rollback
            personaI.setApellido("1111111111111111111111111111111111111111111111111111111111111111111111111111111"
                    + "111111111111111111111111111111111111111111111111111111111");
            dao.insertar(personaI);

            //guardado de la transaccion
            conexion.commit();
            System.out.println("Transaccion completa 'commit'");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Error de transaccion externa");

            try {
                conexion.rollback();
                 System.out.println("Transaccion incompleta 'rollback'");
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
                System.out.println("Error de transaccion interna");
            }
        }
    }

}
