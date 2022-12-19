/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacar;

import java.util.Arrays;

/**
 *
 * @author ERICK
 */
public class CatalogoAlquiler {
    
    private int numeroAlquiler;
    private Alquileres[] listaAlquiler;
    
    // El constructor recibe el tamaño del catalogo e inicializa la estructura
    // de datos con vehiculos aleatorios.
    
    public CatalogoAlquiler(int alquiler){
        alquiler = Math.abs(alquiler);
        this.numeroAlquiler = alquiler;
        this.listaAlquiler = new Alquileres[alquiler];
        for(int i=0; i < listaAlquiler.length; i++){
            this.listaAlquiler[i] = new Alquileres();
        }        
    }
    
    public String toString(){
        String tmp = "";
        
        for(Alquileres a : listaAlquiler){
            if(a != null){
                tmp += a.toString() + "\n";
            }
        }
        return tmp;
    }
    
    public int getNumeroAlquiler(){
        return numeroAlquiler;
    }
    
    private int buscarAlquiler(Alquileres a)    {
        if(a != null){
            for(int i = 0; i < this.listaAlquiler.length; i++){
                if(this.listaAlquiler[i] != null && a.equals(this.listaAlquiler[i])){
                    return i;
                }
            }
        }
        return -1;
    }
    
    public Alquileres buscarAlquiler(int id){
        Alquileres aux = new Alquileres();
        aux.setAlquilerID(id);
        int posicion = buscarAlquiler(aux);
        return (posicion >= 0) ? this.listaAlquiler[posicion] : null;
    }
        
    public void borrarAlquiler(Alquileres a){
        int pos = buscarAlquiler(a);
        if(pos >= 0){
            this.listaAlquiler[pos] = null;
        }
    }
    
    public void anadirAlquiler(Alquileres a){
        // Si hay hueco, se inserta en el hueco
        
        if(this.numeroAlquiler < this.listaAlquiler.length){
            for(int i = 0; i < this.listaAlquiler.length; i++){
                if(this.listaAlquiler[i] == null){
                    this.listaAlquiler[i] = a;
                    this.numeroAlquiler++;
                    System.out.println("Guardando alquiler en posición " + i);
                    break;
                }
            }
        }else{
            this.numeroAlquiler++;
            this.listaAlquiler = Arrays.copyOf(listaAlquiler, this.numeroAlquiler);
            
            this.listaAlquiler[this.numeroAlquiler - 1] = a;
            
        }
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
