 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Revista;
import Modelo.Articulo;

/**
 *
 * @author diego
 */
public interface IArticulo {
    public Articulo crearArticulo( Revista revista, String nombre, String tipo, String escritor, int año);
    ////public ArrayList<Articulo> listarArticulos(); 
    // listapersonajes se muestra en Revista
    public Articulo getArtiByName(Revista revista, String name);
    public Articulo getArtiByPosicion(Revista revista, int posicion);
    public Articulo modificarArticulo(Revista revista, Articulo articulo, String nombre, String tipo, String escritor, int año);
    public Articulo eliminarArticulo(Revista revista, Articulo articulo);
    
}