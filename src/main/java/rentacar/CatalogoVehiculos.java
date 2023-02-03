/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacar;

/**
 *
 * @author ERICK
 */
// Crea la clase heredando de la clase Catalogo(extends)
public class CatalogoVehiculos extends Catalogo<Vehiculo>{
   
    public CatalogoVehiculos(int tamanio){
        super(tamanio); // Llama al constructor de la clase padre
        
        for(int i = 0; i < tamanio; i++){
            this.anadirVehiculo(new Vehiculo());  
        }
    }
    
    public Vehiculo buscarVehiculos(String bastidor) {
        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor);
        int posicion = buscarVehiculo(aux);
        
        return (posicion >= 0) ? this.lista.get(posicion) : null;
        
    }
    
    
    
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

    
    
    
}
