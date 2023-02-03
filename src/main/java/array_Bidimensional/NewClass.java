/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array_Bidimensional;

import java.util.*;

/**
 *
 * @author guerig
 */
public class NewClass {
    public static void main(String[] args) {
        int[][] matriz = {
            {4, 6, 3, 8},
            {5, 9, 7, 6},
            {4, 4, 1, 1},
            {0, 3, 6, 8}
        };
        
        //casillasVecinas(0, 0, matriz);
        
        List<Casilla> listaCasillas = casillasVecinas(0, 0, matriz);
        
        System.out.println("Casillas vecinas: ");
        for(Casilla casilla : listaCasillas){
            System.out.println(casilla);
        }
        
        System.out.println("Mostrar matriz: ");
        mostrar(matriz); // Método mostrar
        System.out.println();
        
        
        System.out.println("Elemento diagonal principal:");
        List<Integer> diagonal = elementoDiagonalPrincipal(matriz); // Recomendado
        diagonal.forEach(System.out :: println);
        
        // IMPORTANTE
        // elementoDiagonalPrincipal(matriz).forEach(System.out :: println); // Se tiene que evitar, es una guarrada
        
        System.out.println("Elemento diagonal secundario:");
        System.out.println(Arrays.toString(elementoDiagonalSecundaria(matriz)));
    }
    
    // No se puede meter primitivos en listas. Ejemplo: (int)
    public static List<Integer> elementoDiagonalPrincipal(int[][] m){
        List<Integer> lista = new ArrayList<>();
        
        //int[] array =  new int[m.length];
        
        for(int i = 0; i < m.length ; i++){
            lista.add(m[i][i]);
        }
        
        return lista;
    }
    
    public static int[] elementoDiagonalSecundaria(int[][] m){
        
        int[] array =  new int[m.length];
        
        for(int i = 0; i < m.length ; i++){
            array[i] = m[i][m.length -1 - i];
        }
        
        return array;
    }
    
    // Método de las casillas
    public static List<Casilla> casillasVecinas(int fila, int columna, int[][] m){
        List<Casilla> lista = new ArrayList<>();
        
        // Comprobamos fila y columna, para que sean validas
        if(filaValida(fila, m) && columnaValida(columna, m)){
            
            // Recorremos fila anterior a la casilla hasta fila posterior
            for(int i = fila - 1; i <= fila + 1; i++){
                if(filaValida(i, m)){ //Se salta las filas que no existen   // Vico: si alguna no es válida, no la mira
                    
                    // Recorremos columna anterior a la casilla hasta la columna posterior
                    for(int j = columna - 1; j <= columna + 1; j++){
                        
                        // Si alguna columna no es válida, no la mira
                        if(columnaValida(j, m)){
                            if(i == fila && j == columna){
                                continue;
                            }

                            System.out.println("Casilla " + i + " " + j);
                            lista.add(new Casilla(i, j, m[i][j]));
                        }
                    }
                }
            }
        }
        
        return lista;
    }
    
    // Si la fila es mayor que 0 y la fila es menor que el largo de la matriz
    public static boolean filaValida(int fila, int[][] matriz){
        return fila >= 0 && fila < matriz.length;
    }
    
    // Si la columna es mayor que 0 y la columna es menor que el largo que la matriz
    public static boolean columnaValida(int columna, int[][] matriz){
        return columna >= 0 && columna < matriz.length;
    }
    
    
    public static void mostrar(int[][] m){
        for(int[] fila : m){ // Por cada fila de la matriz m
            for(int valor : fila){ // Por cada elemento que hay en la fila
                System.out.print(valor + " ");
            }
            System.out.println("");
        }
    }
    
    
    
    
}
