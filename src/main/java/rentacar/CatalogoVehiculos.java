/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacar;

import java.util.Arrays;

/**
 *
 * @author guerig
 */
public class CatalogoVehiculos {

    private int numeroVehiculos;
    private Vehiculo[] listaVehiculos;
    
    
    // El constructor recibe el tamaño del catálogo e
    // inicializa la estructura de datos con vehiculos aleatorios
    public CatalogoVehiculos(int tamanio){
        tamanio = Math.abs(tamanio);
        
        this.numeroVehiculos = tamanio;
        
        // Generamos la estructura pero no tiene valores
        this.listaVehiculos = new Vehiculo[tamanio]; // Nueva estructura para que me genere en memoria
        
        // Una vez creada la estructura de datos le doy valor a cada elemento
        for(int i = 0; i < listaVehiculos.length; i++){
            this.listaVehiculos[i] = new Vehiculo();
        }
        
        
    }
    
//    public void mostrarCatalogo(){
//        for(Vehiculo v:listaVehiculos){
//            System.out.println(v);
//        }
//    }
    
    public String toString(){
        String tmp = "";
        
        for(Vehiculo v : listaVehiculos){
            if(v!=null){
                tmp += v.toString() + "\n";
            }
        }
        
        return tmp;        
    }

    // Nº de vehiculos que hay en el catalogo, no el tamaño del array
    public int getNumeroVehiculos() {
        return numeroVehiculos;
    }
    
    // Borrar un vehiculo
    public void borrarVehiculo(Vehiculo v){
        int pos = buscarVehiculo(v);
        if(pos >= 0){
            this.listaVehiculos[pos] = null; // se convierte los datos en null, el espacio sigue disponible pero vacio
        }        
    }
    
    public Vehiculo buscarVehiculos(String bastidor) {
        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor);
        int posicion = buscarVehiculo(aux);
        return (posicion >= 0) ? this.listaVehiculos[posicion] : null;
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
    
    public void anadirVehiculo(Vehiculo v){
        // Si hay hueco, se inserta en el hueco
        if(this.numeroVehiculos < this.listaVehiculos.length){
            for(int i = 0; i < this.listaVehiculos.length; i++){
                if(this.listaVehiculos[i] == null){
                    this.listaVehiculos[i] = v;
                    this.numeroVehiculos++;
                    System.out.println("Guardando vehiculo en pos " + i);
                    break;
                }
            }
        }else{ // El array está lleno
            //Vehiculo[] nuevo = Arrays.copyOf(listaVehiculos, ++this.numeroVehiculos);
            //this.listaVehiculos = nuevo;
            
            this.listaVehiculos =  Arrays.copyOf(listaVehiculos, ++this.numeroVehiculos);
            this.listaVehiculos[this.numeroVehiculos-1] = v;
            
        }
    }
    
    private void copiarVehiculo(Vehiculo v){
        // Arrays.copyOf(original, int newLength)
        // Original: matriz original
        // newLewLength: número de indices del nuevo array
        this.listaVehiculos = Arrays.copyOf(listaVehiculos, ++this.numeroVehiculos);
        this.listaVehiculos[this.numeroVehiculos-1] = v;
    }
    

//    public Vehiculo[] getListaVehiculos() {
//        return listaVehiculos;
//    }
    
    
    
}
