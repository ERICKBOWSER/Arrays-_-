/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacarlistas;

import java.util.ArrayList;
import rentacar.*;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author guerig
 */
public class CatalogoVehiculos {

    private List <Vehiculo> lista;
    
    
    // El constructor recibe el tamaño del catálogo e
    // inicializa la estructura de datos con vehiculos aleatorios
    public CatalogoVehiculos(int tamanio){
        tamanio = Math.abs(tamanio);
        
        this.lista = new ArrayList<>(tamanio);
        
        // Una vez creada la estructura de datos le doy valor a cada elemento
        for(int i = 0; i < tamanio; i++){
           this.lista.add(new Vehiculo());
        }   
        
    }
    
//    public void mostrarCatalogo(){
//        for(Vehiculo v:listaVehiculos){
//            System.out.println(v);
//        }
//    }
    
    public String toString(){
        String tmp = "";
        
        for(Vehiculo v : this.lista){

            tmp += v.toString() + "\n";
        }
        
        return tmp;        
    }

    // Nº de vehiculos que hay en el catalogo, no el tamaño del array
    public int getNumeroVehiculos() {
        return this.lista.size();
    }
    
    // Borrar un vehiculo
    public boolean borrarVehiculo(Vehiculo v){
        int pos = buscarVehiculo(v);
        if(pos >= 0){
            this.lista.remove(pos); // se convierte los datos en null, el espacio sigue disponible pero vacio
            return true;
        }        
        return false;
    }
    
    public Vehiculo buscarVehiculos(String bastidor) {
        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor);
        int posicion = buscarVehiculo(aux);
        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }  
    
    
        
    private int buscarVehiculo(Vehiculo v) {
        //Búsqueda secuencial
        if (v != null) {
            for (int i = 0; i < this.lista.lista.size; i++) {
                if (v.equals(this.lista.get(i))) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    public void anadirVehiculo(Vehiculo v){
        this.lista.add();
    }   
   
    
}
