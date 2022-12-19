/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjericiosPropuestos;

import java.util.Random;

/**
 *
 * @author ERICK
 */
public class arrayRelleno {
    
    /*
    Ejer 1: Rellenar un array con letras mayúsculas array de char[] (25 letras) 
    Ejer 2: Generamos un array de tamaño aleatorio entre 1 y 25 pero que no se salga del array de char 
    Ejer 3: Generamos un número aleatorio para que coja las posiciones del array de char[] y meta el char 
    valido en el nuevo array    
    */
    
    // Generador de número aleatorio
    private static Random generador = new Random();
    
    public static void main(String[] args) {
    
        // Ejercicio 
        generarLetrasMayus(generador);
        
    }
    
    public static void generarLetrasMayus(Random generador){
        
        char[] letrasMayus = new char[25];
        
        for(int i = 0; i < 25; i++){

            int letra = generador.nextInt(90 - 65 + 1) + 65;
            
            System.out.println("Letra: " + letra);
            
            letrasMayus[i] = (char) letra;                        
                        
            System.out.println("-" + letrasMayus[i]);
        }
    }    
    
    public static void arrayAleatorio(){
        char[] letrasMayus = new char[25];
    }
    
    public static void generarArray(){
        
    }
    
    
    
    
    
    
}
