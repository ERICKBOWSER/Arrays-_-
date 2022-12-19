/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacar;

import java.util.Random;

/**
 *
 * @author guerig
 */
public enum Color {
    ROJO, NEGRO, AMARILLO, VERDE, AZUL, BLANCO;
    
    public static Color getAleatorio(){
        
        // Array de colores con .values()
        var r = new Random();
        
        Color[] colores = Color.values();
        
        int posicion = r.nextInt(0, colores.length);
        
        return colores[posicion];    
    }    
    
    
    
    
    
}
