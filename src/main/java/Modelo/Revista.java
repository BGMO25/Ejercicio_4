/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Revista {
    private String nombre;
    private String pais;
    private String idioma;
    private int anioEstreno;
    private ArrayList<Articulo> listaArticulos;

    public Revista(String nombre, String pais, String idioma, int anioEstreno) {
        this.nombre = nombre;
        this.pais = pais;
        this.idioma = idioma;
        this.anioEstreno = anioEstreno;
        this.listaArticulos = new ArrayList<>();
    }
    // Muestra la informacion de Revista
    @Override
    public String toString() {
        return "\n Pelicula: \nnombre: " + nombre + "\ntipo: " + idioma + "\npais:" + pais + "\nfechaEstreno:" + anioEstreno + " horas\nLista de articulos: \n" + listaArticulos;
    }
    
    //muestra la antiguedad de la pelicula basado en el anio actual
    public String antiguedadRevista(int anioActual){
        int antiguedad = anioActual - this.anioEstreno;
        String antiguedadRevista = "La revista "+getNombre()+ " tiene "+antiguedad+ " anios de antiguedad";
        return antiguedadRevista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setIdioma(String idioma) {
        this.pais = idioma;
    }

       public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

      public ArrayList<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public void setListaPersonajes(ArrayList<Articulo> listaArticulos) {
        this.listaArticulos = listaArticulos;
    }

    public void setListaArticulos(ArrayList<Articulo> listaArticulos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}