/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osti.katriel.peliculas.servicio;

/**
 *
 * @author ASUS
 */
public interface ICatalogoPeliculas {

    String NOMBRE_RECURSO = "peliculas.txt";

    void agregarPelicula(String nombre);

    void listarpeliculas();

    void buscarPelicular(String nombre);

    void iniciarCatalogoPeliculas();
}
