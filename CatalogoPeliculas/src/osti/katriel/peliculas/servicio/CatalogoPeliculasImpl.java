/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osti.katriel.peliculas.servicio;

import osti.katriel.peliculas.datos.AccesoDatosImpl;
import osti.katriel.peliculas.datos.IAccesoDatos;
import osti.katriel.peliculas.domain.Pelicula;
import osti.katriel.peliculas.excepciones.AccesoDatosEx;

/**
 *
 * @author ASUS
 */
public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

    private final IAccesoDatos datos;

    public CatalogoPeliculasImpl() {
        datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombre) {

        Pelicula p = new Pelicula(nombre);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.Escribir(p, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error dal agregar peliculas");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listarpeliculas() {

        try {
            var peliculas = datos.listar(NOMBRE_RECURSO);
            for (var pelicula : peliculas) {
                System.out.println("pelicula = " + pelicula);

            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al listar peliculas");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicular(String nombre) {

        var resultado = "no existe";
        try {
            resultado = datos.buscar(NOMBRE_RECURSO, nombre);

        } catch (AccesoDatosEx ex) {
            System.out.println("Error al buscar peliculas");
            ex.printStackTrace(System.out);
        }
        System.out.println("resultado = " + resultado);
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if (datos.existe(NOMBRE_RECURSO)) {
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            } else {
                datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar catalogo de peliculas");
            ex.printStackTrace(System.out);
        }

    }

}
