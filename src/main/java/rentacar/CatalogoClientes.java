/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacar;

import java.util.Arrays;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author ERICK
 */
public class CatalogoClientes {
    
    private int numeroClientes;
    private Cliente[] listaClientes;

    public CatalogoClientes() {
    }
    
    public CatalogoClientes(int numClientes){
        numClientes = Math.abs(numClientes);
        
        this.numeroClientes = numClientes;
        
        this.listaClientes = new Cliente[numClientes];        
        for(int i = 0; i < listaClientes.length; i++){
            this.listaClientes[i] = new Cliente();
        }
    }
    
    public String toString(){
        String tmp = "";
        
        /*
        Genera un bucle que obtiene la lista de clientes, y las va almacenando en la variable tmp,
        con el "\n" se consigue que al terminar con los datos de cada uno de los usuarios haya
        un salto de linea
        El return devuelve la variable con todos los datos de los clientes*/
        for(Cliente c : listaClientes){
            if(c != null){
                tmp += c.toString() + "\n";
            }
        }
        return tmp;
    }
        
    // Número de clientes
    public int getNumeroClientes(){
        return numeroClientes;
    }
    
    // Buscar cliente
    public Cliente buscarClientes(String nif) {
        Cliente aux = new Cliente();
        aux.setNif(nif);
        int posicion = buscarCliente(aux);
        return (posicion >= 0) ? this.listaClientes[posicion] : null;
    }            
    
    
    // Borrar cliente    
    public void borrarCliente(Cliente c){
        int posicion = buscarCliente(c);
        if(posicion >= 0){
            this.listaClientes[posicion] = null;
        }
    }
    
    private int buscarCliente(Cliente c) {
        //Búsqueda secuencial
        if (c != null) {
            for (int i = 0; i < this.listaClientes.length; i++) {
                if (this.listaClientes[i] != null && c.equals(this.listaClientes[i])) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    public void anadirCliente(Cliente c){
        if(this.numeroClientes < this.listaClientes.length){ // Al borrar los clientes, el número de clientes se reduce, con esto comprobamos si hay el mismo número de clientes que en la lista
            for(int i = 0; i < this.listaClientes.length; i++){
                if(this.listaClientes[i] == null){ // si se encuentra un espacio vacio en el array se ejecuta
                    this.listaClientes[i] = c; // Añade al nuevo cliente
                    this.numeroClientes++; // suma en 1 los clientes
                    System.out.println("Guardando cliente en la posición " + i);
                    break;
            }
        }
        }else{
            this.listaClientes = Arrays.copyOf(listaClientes, ++this.numeroClientes);
            this.listaClientes[this.numeroClientes-1] = c;
                
        }
    }
    
    
    
    
    
    
    
}
