/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osti.katriel.peliculas.datos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import osti.katriel.peliculas.domain.Pelicula;
import osti.katriel.peliculas.excepciones.AccesoDatosEx;
import osti.katriel.peliculas.excepciones.EscrituraDatosEx;
import osti.katriel.peliculas.excepciones.LecturaDatosEx;

/**
 *
 * @author ASUS
 */
public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean existe(String nombreRecurso) {

        var archivo = new File(nombreRecurso);
        return archivo.exists();

    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {

        var archivo = new File(nombreRecurso);
        List<Pelicula> peliculas = new ArrayList<>();

        try {
            var entrada = new BufferedReader(new FileReader(archivo));

            String linea = null;
            linea = entrada.readLine();

            while (linea != null) {
                Pelicula p = new Pelicula(linea);
                peliculas.add(p);
                linea = entrada.readLine();
            }

            entrada.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar, " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar, " + ex.getMessage());
        }

        return peliculas;

    }

    @Override
    public void Escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {

        var archivo = new File(nombreRecurso);
        try {
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se ha escrito = " + pelicula);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Excepcion al escribir, " + ex.getMessage());
        }
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {

        var archivo = new File(nombreRecurso);
        String resultado = null;
        try {
            var entrada = new BufferedReader(new FileReader(archivo));

            String linea = null;
            linea = entrada.readLine();
            var indice = 1;
            while (linea != null) {
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    resultado = "Pelicula " + indice + " - " + linea;
                    break;
                }

                linea = entrada.readLine();
                indice++;
            }

            entrada.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar, " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar, " + ex.getMessage());
        }

        return resultado;
        
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {

        var archivo = new File(nombreRecurso);
        try {
            var salida = new PrintWriter(new FileWriter(archivo));

            salida.close();
            System.out.println("Se ha creado el archivo ");
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Excepcion al crear, " + ex.getMessage());
        }

    }

    @Override
    public void borrar(String nombreRecurso) {

        var archivo = new File(nombreRecurso);

        if (archivo.exists()) {
            archivo.delete();
        }

        System.out.println("Archivo borrado!");
    }

}
