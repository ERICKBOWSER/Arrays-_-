/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author ERICK
 */
public class Ejer3 {
    public static void main(String[] args) {
        
        // /Array de double de tamaño 20
        double[] numeros = new double[20];
        
        for(double i:numeros){
            System.out.println(i);
        }
                
        System.out.println("-------------- Rellenar -----------------");
        // Rellena el array con el valor 7.5 en todas sus posiciones.
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = 7.5;
            System.out.println(numeros[i]);
        }         
        
        // /Realiza una copia del array anterior en un nuevo array.
        double[] copia = numeros;
        
        // /Imprime ambos arrays
        System.out.println("----------- Original ------------");
        for(double i:numeros){
            System.out.println(i);
        }
        
        System.out.println("----------- Copia ----------------");
        for(double i:copia){
            System.out.println(i);
        }
        
        numeros[8] = 6.3;
        
        
        
        
        
        
                  
    }
}
