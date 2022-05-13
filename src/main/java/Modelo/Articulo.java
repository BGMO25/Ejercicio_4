/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Fernando
 */
public class Articulo {
    private String nombre;
    private String tipo;
    private String escritor;
    private int año;
 
    public Articulo(String nombre, String tipo, String escritor, int año) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.escritor = escritor;
        this.año = año;
            }

    
    // Muestra la informacion de articulo
    @Override
    public String toString() {
        return "\n\t Personaje: \n\t nombre: " + nombre + "\n\t tipo: " + tipo + "\n\t actor: " + escritor + "\n\t año: " + año;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
           
    
}