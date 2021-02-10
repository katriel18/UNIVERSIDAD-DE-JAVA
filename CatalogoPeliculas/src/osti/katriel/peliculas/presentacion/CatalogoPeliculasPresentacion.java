/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osti.katriel.peliculas.presentacion;

import java.util.Scanner;
import osti.katriel.peliculas.servicio.CatalogoPeliculasImpl;
import osti.katriel.peliculas.servicio.ICatalogoPeliculas;

/**
 *
 * @author ASUS
 */
public class CatalogoPeliculasPresentacion {

    public static void main(String[] args) {
        var opcion = -1;
        var s = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();

        while (opcion != 0) {
            System.out.println("Eligir opcion: \n"
                    + "1.Iniciar catologo\n"
                    + "2.Agregar pelicula\n"
                    + "3.Listar peliculas\n"
                    + "4.Buscar pelicula\n"
                    + "0.Salir\n");
            opcion = Integer.parseInt(s.nextLine());

            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Nombre: ");
                    var n1 = s.nextLine();
                    catalogo.agregarPelicula(n1);
                    break;
                case 3:
                    catalogo.listarpeliculas();
                    break;
                case 4:
                    System.out.println("Nombre: ");
                    var n2 = s.nextLine();
                    catalogo.buscarPelicular(n2);
                    break;
                case 0:
                    System.out.println("Hasta pronto! ");
                    break;
                default:
                    System.out.println("Opcion no reconocida! ");
                    break;
            }
        }
    }
}
