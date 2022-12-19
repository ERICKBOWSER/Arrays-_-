/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author guerig
 */
public class Ejer5 {
    
    
    public static void main(String[] args) {
    
        int numero = 0, contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0;
        int[] numeros = new int[10]; //Es necesario crearlo si el array no tiene datos predeterminados
        
        leerValores(numeros);
        
        contadorPositivos = contarPositivos(numeros);
        System.out.println("Número de positivos: " + contadorPositivos);  
        
        contadorNegativos = contarNegativos(numeros);
        System.out.println("Número de negativos: " + contadorNegativos);
        
        //contadorCeros = contarCeros(numeros);
        System.out.println("Número de negativos: " + contadorNegativos);
          
    }
    
    public static void leerValores(int[] numeros){
        
        Scanner teclado = new Scanner(System.in);
        
        int contador = 0;
       
        do{
            System.out.println("Escribe los números: ");
            int numero = teclado.nextInt();
            numeros[contador] = numero;
            contador++;
        }while(contador < 4);                
    }
    
    public static int contarPositivos(int[] numeros){
        int contadorPositivo = 0;
        for(int valor:numeros){
            if(valor >= 1){
                contadorPositivo++;
            }
        }
        return contadorPositivo;
    }
    
    public static int contarNegativos(int[] numeros){
        int contadorNegativo = 0;
        
        for(int valor:numeros){
            if(valor < 0){
                contadorNegativo++;
            }
        }
        return contadorNegativo;
    }
    
    
    public void contarCeros(int[] numeros, int contadorCero){
        for(int valor:numeros){
            if(valor == 0){
                contadorCero++;
            }
        }
    }
    
    public void mostrarArray(int[] numeros){
        for(int valor:numeros){
            System.out.println(" - " + valor);
        }
    }
    
    public void calculaMediaPos(int[] numeros){
        int media = (numeros.length -1) / 2;
        int positivos = 0, totalMedia;
        
        for(int valor:numeros){
            if(valor >= 1){
                positivos += valor;
            }
        }  
        
        totalMedia = positivos / media;
        
        System.out.println("La media positiva es: " + totalMedia);
        
    }
    
    public void calcularMediaNeg(int[] numeros){
        int media = (numeros.length -1) / 2;
        int positivos = 0, totalMedia;
        
        for(int valor:numeros){
            if(valor < 0){
                positivos += valor;
            }
        }  
        
        totalMedia = positivos / media;
        
        System.out.println("La media positiva es: " + totalMedia);
    }
    
    
    
}
