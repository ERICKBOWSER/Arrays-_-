/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacarlistas;

import rentacar.*;
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
    
    private CatalogoClientes cc;
    private CatalogoVehiculos cv;
    private CatalogoAlquiler ca;
    
    
    public Empresa(){
        
    }
    
    public void registrarCliente(Cliente cli){
        
    }
    
    public void registrarVehiculo(Vehiculo v){
        
    }
    
    public boolean registrarAlquiler(String nif, String bastidor, int nDias, LocalDate fechaInicio){
        return true;        
    }
    
    
    public Cliente buscarCliente(String nif){
        return null;
    }
    
    public Vehiculo buscarVehiculo(String bastidor){
        return null;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}    