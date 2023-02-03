/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ERICK
 */

// Clase genérica, sirve para cualquier tipo de objeto
public class Catalogo<T> {
    public List<T> lista;
    
    public Catalogo (int tamanio){
        tamanio = Math.abs(tamanio);
        
        this.lista = new ArrayList<>(tamanio);
        // lista.size() es 0
    }
    
    public String toString(){
        String tmp = "";
        
        for(T objeto : this.lista){
            tmp += objeto.toString() + "\n";
        }
        
        return tmp;        
    }
    
    public int getNumeroElementos(){
        return this.lista.size();
    }
    
    
    public int buscarElemento(T elemento){
        // Búsqueda secuencial
        for(int i = 0; i < this.lista.size(); i++){
            if(elemento.equals(this.lista.get(i))){
                return i;
            }
        }
        return -1;
    }
    
    public int buscarVehiculo(T elemento){
        
    }
    
            
            
    private int buscarVehiculo(Vehiculo v) {
        //Búsqueda secuencial
        if (v != null) {
            for (int i = 0; i < this.listaVehiculos.length; i++) {
                if (v.equals(this.listaVehiculos[i])) {
                    return i;
                }
            }
        }
        return -1;
    }        
            
    public boolean borrarElemento(T elemento){
        int pos = buscarElemento(elemento);
        
        if(pos >= 0){
            this.lista.remove(pos);
            return true;
        }
        return false;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
