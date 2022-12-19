/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayList;

import java.util.ArrayList;

/**
 *
 * @author guerig
 */
public class ListasNumeros {
    
    public static void main(String[] args) {
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        
        listaEnteros.add(10);
        listaEnteros.add(9);
        listaEnteros.add(8);
        listaEnteros.add(7);
        listaEnteros.add(6);
        
        
        System.out.println("Tamaño de la lista " + listaEnteros.size());
        for(int i = 0; i < listaEnteros.size(); i++){
            System.out.println("Elemento " + (i+1) + "=>" + listaEnteros.get(i));
            System.out.println("Element " + (i) + "=>" + listaEnteros.get(i));
        }
        
        if(listaEnteros.contains(7)){
            System.out.println("El 7 está en la lista");
                        
        }
        Integer numero = 10;
        listaEnteros.remove(numero);
        
        int posicion = listaEnteros.indexOf(6);
        System.out.println("Posición del 6 en la lista: " + posicion);
        
        listaEnteros.add(100);
        listaEnteros.forEach(System.out::println);
        
        for(Integer num : listaEnteros){ // no controla las posiciones, simplemente recorre el array
            System.out.println(" - " + num);
        }
        System.out.println("");
        
        listaEnteros.add(0, 200);
        
        for(Integer num : listaEnteros){
            System.out.println(" - " + num);
        }
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
