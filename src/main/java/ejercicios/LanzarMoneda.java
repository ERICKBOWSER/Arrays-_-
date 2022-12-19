/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Random;

/**
 *
 * @author ERICK
 */
public class LanzarMoneda {
    private boolean[] array; // Crear array
    private Random generar = new Random();

    public LanzarMoneda() {
        array = new boolean[10];
    }
    
    public void rellenarArray(){        
        
        // Bucle que realiza las 1000 tiradas
        for(int i = 0; i < array.length; i++){
             
            boolean aleatorio = generar.nextBoolean(); // Creamos un número aleatorio
            
            array[i] = aleatorio; // Almacenamos el resultado del random en el array
            System.out.println(array[i]);
        }     
                
    }
    
    public void comprobarCaras(){
        int contador = 0;
        
        for(int i = 0; i < array.length; i++){
            if(array[i]){
                contador++;
            }
        }
        System.out.println("El número de caras es :" + contador);

    }
    
    public void comprobarCruces(){
        int contador = 0;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] == false){
                contador++;                
            }
        }
        
        System.out.println("El número de cruces es :" + contador);
    }
    
    public void resultado(){
        for(int i = 0; i < array.length; i++){
            
           for(int e = 1; i < array.length; i++){
               if(array[i]){
                System.out.println("El resultado " + e + " es cara");
               }else{
                   System.out.println("El resultado " + e + " es cruz");
               }
            } 
        }
    }
    
    
    
    
}
