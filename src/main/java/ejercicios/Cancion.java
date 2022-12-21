/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.ArrayList;

/**
 *
 * @author guerig
 */
public class Cancion {
        ArrayList <String> canciones;
        
    // Método constructor    
    public Cancion() {        
        this.canciones = new ArrayList<>();
    }
    
    // Devuelve el número total de canciones
    public int numeroCanciones(){
        return canciones.size();
    }
    
    // Devuelve true si la lista esta vacía 
    public boolean estaVacia(){
        if(canciones.size() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    // Se el pasa como parámetro el indice y devuelve la canción que se esta escuchando
    public String escucharCancion(int cancion){
        return canciones.get(cancion);
    }
    
    public int cambiarCancion(int posicion, Cancion cancion){
        
    }
    
    














































    
}
