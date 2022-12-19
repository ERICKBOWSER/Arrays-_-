/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author ERICK
 */
public class Ejer2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int personas, totalEdades;
        double persona, sacarMedia = 0, totalMedia;
        
        // array
        double [] edades = {0};
        
        System.out.println("Indique el número de personas: ");
        personas = teclado.nextInt();
        
        // Bucle para la altura de todas las personas
        for(int i = 1; i <= personas; i++){
            System.out.println("Escribe la altura de la persona " + i);
            persona = teclado.nextDouble();
            
            // Positivo
            Math.abs(persona);
            
            // Recorrer el array y añadir altura
            for(int a = 0; a <= personas; a++){
                edades[a] = persona;
                System.out.println(a);
                System.out.println("array: " + persona);
            
            }
                        
        }
        
        // Sumar edades
        for(double aux:edades){
            sacarMedia = sacarMedia + aux;                
        }
        
        totalEdades = edades.length - 1;                
        totalMedia = sacarMedia / totalEdades;
                
        System.out.println("La média es: " + totalMedia);
        
        
        // Altura superior a la media
        int contadorSuperior = 0;
        for(double aux:edades){
            if(aux > totalMedia){
                contadorSuperior++;
            }
        }
        
        System.out.println("El número de persona con altura superior a la media es de " + contadorSuperior);
        
        // Altura inferior a la media
        int contadorInferior = 0;
        for(double aux:edades){
            if(aux < totalMedia){
                contadorInferior++;
            }
        }
        
        System.out.println("El número de persona con altura superior a la media es de " + contadorInferior);

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
