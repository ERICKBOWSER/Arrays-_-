/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacar;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author ERICK
 */
public class Empresa {
    
    private String cif;
    private String nombre;
    private boolean disponibilidad;
    
    private Cliente[] listaClientes;
    
    
    private CatalogoVehiculos catalogoVehiculo;
    private CatalogoClientes catalogoCliente;
    private CatalogoAlquiler catalogoAlquiler;

    public Empresa() {
    }

    public Empresa(String cif, String nombre) {
        this.cif = cif;
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public String getNombre() {
        return nombre;
    }

    public CatalogoVehiculos getCatalogoVehiculo() {
        return catalogoVehiculo;
    }

    public CatalogoClientes getCatalogoCliente() {
        return catalogoCliente;
    }

    public CatalogoAlquiler getCatalogoAlquiler() {
        return catalogoAlquiler;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCatalogoVehiculo(CatalogoVehiculos catalogoVehiculo) {
        this.catalogoVehiculo = catalogoVehiculo;
    }

    public void setCatalogoCliente(CatalogoClientes catalogoCliente) {
        this.catalogoCliente = catalogoCliente;
    }

    public void setCatalogoAlquiler(CatalogoAlquiler catalogoAlquiler) {
        this.catalogoAlquiler = catalogoAlquiler;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa{");
        sb.append("cif=").append(cif);
        sb.append(", nombre=").append(nombre);
        sb.append(", catalogoVehiculo=").append(catalogoVehiculo);
        sb.append(", catalogoCliente=").append(catalogoCliente);
        sb.append(", catalogoAlquiler=").append(catalogoAlquiler);
        sb.append('}');
        return sb.toString();
    }
    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.cif);
        hash = 41 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.cif, other.cif)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    // Registrar cliente
    public void registrarCli(Cliente cliente){
        this.catalogoCliente.anadirCliente(cliente);
    }
    
    // Registrar vehiculo
    public void registrarVehic(Vehiculo vehiculo){
        this.catalogoVehiculo.anadirVehiculo(vehiculo);
    }
    
    // Buscar cliente
    // Al buscar en un método array, hay que especificarlo al crear el método
    // de lo contrario no se puede usar ese método
    public Cliente buscarCli(String nif){
        return this.catalogoCliente.buscarClientes(nif);
    }
    
    // Buscar vehiculo
    public Vehiculo buscarVehiculo(String bastidor){
        return this.catalogoVehiculo.buscarVehiculos(bastidor);
    }
    
    // Registrar alguiler
    public boolean registroAlquiler(String nif, String bastidor, LocalDate fechaInicio, int numeroDias){
        //
        Cliente auxCli = this.catalogoCliente.buscarClientes(nif);
        Vehiculo auxVe = this.catalogoVehiculo.buscarVehiculos(bastidor);
        
        if(auxCli != null && auxVe != null && auxVe.isDisponible() == true){
            /*
            this.catalogoAlquiler, accedemos al catalogo para poder usar el método anadirAlquiler,
            luego creamos un nuevo alquiler con new Alquiler() y le pasamos los párametros            
            */
            this.catalogoAlquiler.anadirAlquiler(new Alquileres(auxCli, auxVe, fechaInicio, numeroDias));
            return true;
        }
        
        return false;
    }
    
    public void recibirVehic(Alquileres a){
        
        if(this.catalogoVehiculo.buscarVehiculos(cif) != null){ // Comprobamos que el bastidor del vehiculo existe
            a.getVehiculo().setDisponible(true); // Establecemos que vuelve estar disponible para alquilar

            //this.catalogoAlquiler.borrarAlquiler(a); // Borramos los datos del alguiler
        }
                
    }



















    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

