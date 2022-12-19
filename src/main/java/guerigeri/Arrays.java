/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package guerigeri;

/**
 *
 * @author ERICK
 */
public class Arrays {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        
        // Ver un indice especifico del array
        // array[num], se especifica la posición que queremos ver        
        System.out.println("El elemento del indice cinco: " + numeros[5]);
        
        // Número de atributos que tiene el array
        // array.length
        System.out.println("Tamaño del array numeros: " + numeros.length);
        
        // Imprimimos todos los datos
        for(int i = 0; i < numeros.length; i++){
            System.out.println("-" + numeros[i]);
        }
        
        System.out.println("-------------------------------------------------");
        
        // foreach
        // for(tipo aux:array), variable en la que almacenar : array que recorrer uno por uno
        System.out.println("Recorrer datos con foreach");
        for(int aux:numeros){
            System.out.println("-" + aux);
        }
        
        System.out.println("---------------------------------------------------");
        
        // Modificar un dato
        System.out.println("Modificar el valor de la posición 5");        
        numeros[5] = 90;
        
        for(int i = 0; i < numeros.length; i++){
            System.out.println(" - " + numeros[i]);
        }
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
