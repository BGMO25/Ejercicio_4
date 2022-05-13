/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Revista;
import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public interface IRevista {
    public Revista crearRevista(Revista revista);
    public ArrayList<Revista> listarRevistas();
    public Revista getRevistaByPosicion(int posicionRevista);
    public Revista getRevistaByName(String name);
    public Revista modificarRevista(Revista nuevaRevista, Revista revista);
    public Revista eliminarRevista(int posicion);
}