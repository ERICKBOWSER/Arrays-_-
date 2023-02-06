/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.ArrayList;

/**
 *
 * @author guerig
 */
public class PruebasEjer26 {
    public static void main(String[] args) {
        
        PilaEjer26<String> pila = new PilaEjer26<>();
        
        pila.pushElemento("1");
        pila.pushElemento("2");
        pila.pushElemento("3");
        pila.pushElemento("4");
        
        pila.pilaContenido();
        
        
    }
}


class Cancion{
    private String nombre;
    private String cantante;
    
    public Cancion(String nombre, String cantante){
        this.nombre = nombre;
        this.cantante = cantante;
    }
}