/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacionbusqueda;

import java.util.*;
//import java.util.GregorianCalendar;
//import java.util.Objects;

/**
 *
 * @author guerig
 */
public class Videojuegos implements Comparable<Videojuegos>{ // Al añadir el comparable hay que añadir los métodos abstractos
    private String nomJuego;
    private GregorianCalendar anioLanzamiento;
    private String distribuidor;
    private Modo modo;

    public Videojuegos(String nomJuego, int anio, int mes, int dia, String distribuidor, Modo modo) {
        this.nomJuego = nomJuego;
        this.anioLanzamiento = getFecha(anio, mes, dia);
        this.distribuidor = distribuidor;
        this.modo = modo;
    }

    public Videojuegos() {
    }
    
    

    public String getNomJuego() {
        return nomJuego;
    }

    public Date getAnioLanzamiento() { // Se devuelve un date ya que el método getTime() pertenece a la clase Date, pero por herencia también lo tiene la clase GregorianCalendar
        return anioLanzamiento.getTime();
    }

    public String getDistribuidor() {
        return distribuidor;
    }
    
    public Modo getModo(){
        return modo;
    }

    public void setNomJuego(String nomJuego) {
        this.nomJuego = nomJuego;
    }

    public void setAnioLanzamiento(GregorianCalendar anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public void setModo(Modo modo) {
        this.modo = modo;
    }

    @Override
    public String toString() {
        return "Videojuegos{" + "Nombre=" + nomJuego + ", Año de lanzamiento=" + anioLanzamiento.getTime() + ", distribuidor=" + distribuidor + ", modo=" + modo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.nomJuego);
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
        final Videojuegos other = (Videojuegos) obj;
        return Objects.equals(this.nomJuego, other.nomJuego);
    }

    // Método abstracto necesario para utilizar los comparable
    @Override
    public int compareTo(Videojuegos o) {
        return this.nomJuego.compareToIgnoreCase(nomJuego);
    }

    // Método para obtener la fecha de lanzamiento
    public GregorianCalendar getFecha(int anio, int mes, int dia){
         GregorianCalendar fechaLanzamiento = new GregorianCalendar(anio, mes - 1, dia);
         
         return fechaLanzamiento;
    }
    
    
    
}
