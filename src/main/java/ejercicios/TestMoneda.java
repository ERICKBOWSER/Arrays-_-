/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author ERICK
 */
public class TestMoneda {
    public static void main(String[] args) {
        LanzarMoneda moneda = new LanzarMoneda();
        moneda.rellenarArray();;
        
        moneda.comprobarCaras();
        
        moneda.comprobarCruces();
        
        moneda.resultado();
        
    }
    
    
}
