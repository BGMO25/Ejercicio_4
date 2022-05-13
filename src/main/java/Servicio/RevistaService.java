/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Revista;
import Modelo.Articulo;
import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class RevistaService implements IRevista, IArticulo{
    
    private final ArrayList<Revista> listaRevistas = new ArrayList<>();
    
    // METODOS IRevistas
    
    @Override
    public Revista crearRevista(Revista revista) {
        listaRevistas.add(revista);
        return revista;
    }

    @Override
    public ArrayList<Revista> listarRevistas() {
        return listaRevistas;
    }

    @Override
    public Revista getRevistaByPosicion(int posicionRevista) {
        return listaRevistas.get(posicionRevista);
    }

    @Override
    public Revista getRevistaByName(String name) {
        int posicion=-1;
        for (Revista revi : listaRevistas){
            if(revi.getNombre().equalsIgnoreCase(name)){
                posicion = listaRevistas.indexOf(revi);
                break;
            }
        }
        
        
        return  listaRevistas.get(posicion);
    }
    
    
            @Override
    public Revista modificarRevista(Revista nuevaRevista, Revista revista) {
        // mantener articulos
        int posicion = listaRevistas.indexOf(revista);
        nuevaRevista.setListaArticulos(listaRevistas.get(posicion).getListaArticulos());
        listaRevistas.set(posicion, nuevaRevista);
        return nuevaRevista;
    }

    @Override
    public Revista eliminarRevista(int posicion) {
        return listaRevistas.remove(posicion);
    }
    
    // METODOS IArticulos

    @Override
    public Articulo crearArticulo(Revista revista, String nombre, String tipo, String escritor, int año) {
        Articulo articulo = new Articulo(nombre, tipo, escritor, año);
        int posicion = listaRevistas.indexOf(revista);
        listaRevistas.get(posicion).getListaArticulos().add(articulo);
        return articulo;
        
    }

    @Override
    public Articulo modificarArticulo(Revista revista, Articulo articulo, String nombre, String tipo, String escritor, int año) {
        Articulo nuevoArticulo = new Articulo(nombre, tipo, escritor, año);
        int posicionRevista = listaRevistas.indexOf(revista);
        int posicionArticulo = listaRevistas.get(posicionRevista).getListaArticulos().indexOf(articulo);
        listaRevistas.get(posicionRevista).getListaArticulos().set(posicionArticulo, nuevoArticulo);
        return nuevoArticulo;
    }

    @Override
    public Articulo eliminarArticulo(Revista revista, Articulo articulo) {
        int posicionRevista = listaRevistas.indexOf(revista);
        int posicionArticulo = listaRevistas.get(posicionRevista).getListaArticulos().indexOf(articulo);
        return listaRevistas.get(posicionRevista).getListaArticulos().remove(posicionArticulo);
    }

    @Override
    public Articulo getArtiByName(Revista revista, String name) {
        int posicionArticulo = -1;
        int posicionRevista = listaRevistas.indexOf(revista);
        for (Articulo pers : listaRevistas.get(posicionRevista).getListaArticulos()){
            if(pers.getNombre().equalsIgnoreCase(name)){
                posicionArticulo = listaRevistas.get(posicionRevista).getListaArticulos().indexOf(pers);
            }
        }
        return listaRevistas.get(posicionRevista).getListaArticulos().get(posicionArticulo);
    }

    @Override
    public Articulo getArtiByPosicion(Revista revista, int posicion) {
        int posicioRevista = listaRevistas.indexOf(revista);
        return listaRevistas.get(posicioRevista).getListaArticulos().get(posicion);
        
    }


    
}