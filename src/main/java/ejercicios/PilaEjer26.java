/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guerig
 */
public class PilaEjer26<T> { // Clase generica
    
    private List<T> pila = new ArrayList<>();

    // Constructor de pila vacia 
    public PilaEjer26() {
    }
    
    public void crearLista(){
        
    }
    
    
    // Establecemos el tamaño de la lista
    public void establecerTamanio(int tamanio){
        int resTamanio = Math.abs(tamanio);
        
        pila = new ArrayList<>(resTamanio); 
    }
    
    // Añadir elemento
    public void pushElemento(T elemento){
        pila.add(elemento);
    }
    
    public void popElemento(){
        for(int i = pila.size(); i < 0; i--){
            System.out.println(pila.get(i));
        }
    }
    
    public void pilaVacia(){
        pila.isEmpty();
    }
    
    public boolean pilaContenido(){
        for(int i = 0; i < pila.size(); i++){
            if(!(pila.isEmpty())){
                return false;
            }
            
        }
    }
    
    
    
    
    
}
