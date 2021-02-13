package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoJDBC {

    public static void main(String[] args) {

        PersonaDAO dao = new PersonaDAO();

        //Insertar
        //Persona personaI=new Persona("Jhon","Wick","jhon@gmail.com","933451234");
        //dao.insertar(personaI);
        
        //Actualizar
//        Persona personaA = new Persona(1, "Jose", "Luis", "jl@gmail.com", "933451234");
//        dao.actualizar(personaA);
        
        //Eliminar
        Persona personaE = new Persona(1);
        dao.eliminar(personaE);

        //listar
        List<Persona> personas = dao.listar();

//         for(Persona p:personas){
//            System.out.println( p);
//        }

        personas.forEach(p -> {
            System.out.println(p);
        });

    }

}
