/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.RevistaControl;

/**
 *
 * @author Fernado
 */
public class RevistaVista {

    public static void main(String[] args) {
        
        RevistaControl revistaControl = new RevistaControl();
        //Revista 1
        revistaControl.crearRevista("Ingenious", "Ecuador", "Ingles y Español", 1995);
        revistaControl.crearArticulo(revistaControl.getRevistaByPosicion(0), "cientifico", "hombre", "Phd. Sandro Silverio", 1999);
        revistaControl.crearArticulo(revistaControl.getRevistaByPosicion(0), "Energy storage", "hombre", "Phd Esteban Inga", 2005);
        revistaControl.crearArticulo(revistaControl.getRevistaByName(0), "Generacion de distribucion", "esperimental", "Phd. Sandra Cepeda", 2010);
        // Revista 2 2
       revistaControl.crearRevista("La granja", "Ecuador", "Esoañol", 2000);
        revistaControl.crearArticulo(revistaControl.getRevistaByPosicion(0), "Fertilizacion con magnecio", "hombre", "Phd. Gregorio Pesantez", 2003);
        revistaControl.crearArticulo(revistaControl.getRevistaByPosicion(0), "Trafico nacional de fauna silvestre", "hombre", "Phd Esteban Inga", 2005);
        revistaControl.crearArticulo(revistaControl.getRevistaByName(0), "Elaboracion de nanoparticolas", "mujer", "Phd. Patricia Moyeda", 2010);
        
        
        System.out.println("REVISTAS:");
        System.out.println(revistaControl.listar());
        
        // Modificar revista 1
        revistaControl.modificarRevista(revistaControl.getRevistaByName("La Granja"), "Ecuador", "Español ", 2000);
        System.out.println(">> Modificacion revista 2\nREVISTAS: ");
        System.out.println(revistaControl.listar());
        
        // modificar Articulo1 Revista1
        revistaControl.modificarArticulo(revistaControl.getRevistaByName("Ingenious"), 
        revistaControl.getArtiByName(revistaControl.getRevistaByName("Ingenious"),"Phd. Sandro Silverio"),
        "ecuador", "hombre ", "Ingles y Español", 1999);
        System.out.println(">> Modificacion Articulo1 de Revista1\nRevistas: ");
        System.out.println(revistaControl.listar());
       
        
        //eliminar revista 1
        revistaControl.eliminarRevista(revistaControl.getRevistaByName("Ingenious"));
        System.out.println(">> Eliminar revista1\nREVISTAS: ");
        System.out.println(revistaControl.listar());
        
        // eliminar revista2 revista 2
        revistaControl.eliminarArticulo(revistaControl.getRevistaByName("El hobbit : Un viaje inesperado"), 
                revistaControl.getArtiByName(revistaControl.getRevistaByName("La Granja"), "Patricia Moyeda"));
        System.out.println(">> Eliminar articulo2 pelicula 2\nREVISTAS: ");
        System.out.println(revistaControl.listar());
        
        // Metodo de la Clase revista
        System.out.println("Metodos Clase Revista");
        System.out.println("Obtener Infomacion:");
        System.out.println(revistaControl.getRevistaByName("La Granja").toString());
        System.out.println("Antuguedad pelicula");
        System.out.println(revistaControl.getRevistaByName("La granja").antiguedadRevista(2022));
        
        //Metodos de la clase Articulo
        System.out.println("Metodos Clase Articulo");
        System.out.println("Obtener Informacion:");
        System.out.println(revistaControl.getArtiByName(revistaControl.getRevistaByName("La Granja"), "Phd. Gregorio Pesantez").toString());
        System.out.println("Metodo articuloEsAlto()");
        
        
        
    }
}