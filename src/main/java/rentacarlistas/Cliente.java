/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacarlistas;

import rentacar.*;
import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author ERICK
 */
public class Cliente {
    private String nombre;
    private String nif; // no se puede pasar el valor porque es un final
    private String apellidos;
    private static int contador = 0;

    public Cliente(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        contador++;
        this.nif = String.valueOf(contador);
    }
    
    public Cliente(){
        this.nombre = RandomStringUtils.randomAlphabetic(5);
        this.apellidos = RandomStringUtils.randomAlphabetic(9);
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", Apellidos=" + apellidos + ", nif=" + nif + '}';
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    public String getNif() {
        return nif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public void setNif(String nif){
        this.nif = nif;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nif);
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
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.nif, other.nif);
    }



    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
