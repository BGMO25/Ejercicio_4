/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Revista;
import Modelo.Articulo;
import Servicio.RevistaService;
import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class RevistaControl {
    
    final RevistaService revistaService =  new RevistaService();

    public RevistaControl() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    // Metodos para revista
    
    public Revista crearRevista(String nombre, String pais, String idioma, int fechaEstreno){
        if (validarFechaEstreno(fechaEstreno)){
            Revista revista = new Revista(nombre, pais, idioma, fechaEstreno);
            revistaService.crearRevista(revista);
            return revista;
        }
        
        throw new IllegalArgumentException("El anio debe ser mayor a 1960 ");
        
    }
    
    public Revista modificarRevista(Revista revista, String nombre, String pais, String idioma, int fechaEstreno){
        if (validarFechaEstreno(fechaEstreno)){
            Revista nuevarevista = new Revista(nombre, pais, idioma, fechaEstreno);
            revistaService.modificarRevista(nuevarevista, revista);
            return nuevarevista;
        }
        
        throw new IllegalArgumentException("El anio debe ser mayor  a 1960");
    }
    
    public Revista eliminarRevista(Revista revista){
            int posicion = revistaService.listarRevistas().indexOf(revista);
            return revistaService.eliminarRevista(posicion);
    }
    
        
    public ArrayList<Revista> listar(){
        return revistaService.listarRevistas();
    }
    
    public Revista getRevistaByPosicion(int posicionRevista){
        return revistaService.getRevistaByPosicion(posicionRevista);
    }
    
    public Revista getRevistaByName(String nombreRevista){
        return revistaService.getRevistaByName(nombreRevista);
    }
    
    //Metodos privados clase revista
    // valida que solo se ingresen revistas estrenadas despues de 1960
    private boolean validarFechaEstreno(int anio){
        var flag = true;
        if (anio < 1960){
            flag = false;
        }
        return flag;
    }
    
       
    // Metodos para Personaje
    
    
    
    public Articulo crearPersonaje(Revista revista, String nombre, String tipo, String escritor, int año){
       
        if (validarAño(año) && validarSoloTexto(tipo)){
            Articulo articulo = new Articulo(nombre, tipo, escritor, año);
            revistaService.crearArticulo(revista, nombre, tipo, escritor, año);
            return articulo;
        } else {
            throw new IllegalArgumentException("el año debe ser un valor positivo y el tipo debe contener solo texto");
        }
        
    }
    
    public Articulo modificarArticulo(Revista revista, Articulo articulo, String nombre, String tipo, String escritor, int año ){
        
        if (validarAño(año) && validarSoloTexto(tipo)){
            
            return revistaService.modificarArticulo(revista, articulo, nombre, tipo, escritor, año);
        } 
        
        throw new IllegalArgumentException("el año debe ser un valor positivo y el tipo debe contener solo texto");
        
    }
    
    public Articulo eliminarArticulo(Revista revista, Articulo articulo){
        return revistaService.eliminarArticulo(revista, articulo);
    }
    
    
    public Articulo getArtijeByPosicion(Revista revista, int posicion){
        return revistaService.getArtiByPosicion(revista, posicion);
    }
    
    public Articulo getArtiByName(Revista revista, String name){
        return revistaService.getArtiByName(revista, name);
    }
    
    // metodos privados clase Articulo
    //valida que no se ingresen valores negativos en "año"
    public boolean validarAño(int año){
        var flag = true;
        if(año<= 0){
           flag = false;
        }
        return flag;
    }
    
    //valida que sea solo texto para el atributo tipo
    public boolean validarSoloTexto(String texto){
        var flag=true;
        for (char t: texto.toCharArray ()){
            if (!((t >= 'a' && t <= 'z') || (t >= 'A' && t <= 'Z') || t == ' '))
                flag=false;
        }
        return flag;
    }

}        