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
    
    private ArrayList<T> pila = new ArrayList<>();

    // Constructor de pila vacia 
    public PilaEjer26() {
        pila = null;
    }    
    
    // Establecemos el tamaño de la lista
    public void establecerTamanio(int tamanio){
        int resTamanio = Math.abs(tamanio);
        
        pila = new ArrayList<>(resTamanio); 
    }
    
    // Añadir elemento
    public void pushElemento(T elemento){
        this.pila.add(elemento);
    }
    
    // Eliminar elemento
    public void popElemento(){
        for(int i = pila.size(); i < 0; i--){
            System.out.println(pila.get(i));
        }
    }
    
    // Elemento vacío
    public void pilaVacia(){
        pila.isEmpty();
    }
    
    // Comprobar si la pila esta llena
    public int pilaLlena(){
       int contador = 0;
       for(int i = 0; i < pila.size(); i++){
            if(!(pila.get(i) == null)){
                contador++;
            }
            
        } 
       return contador;
    }
    
    
    public void pilaContenido(){
        for(int i = pila.size(); i >= 0;  i--){
            System.out.println(pila.get(i)); 
        }
    }
    
    // Rellenar
    public void rellenar(T[] array){
                
        for(int i = 0; i < array.length; i++){
            pila.add(array[i]);
        }        
    }
    
    public Object[] sacarElemento(){
        Object[] objeto = pila.toArray(); // toArray, regresa un array con todos los elementos y en el mismo orden
        
        pila.clear(); // Eliminamos todos los elementos
        
        return objeto;
    }

    @Override
    public String toString() {
        return "PilaEjer26{" + "pila=" + pila + '}';
    }
  
    
    
}
