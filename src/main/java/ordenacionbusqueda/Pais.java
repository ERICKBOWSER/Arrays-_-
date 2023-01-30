/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacionbusqueda;

import java.util.Objects;

/**
 *
 * @author guerig
 */

// Para implementar Collections hay que añadir : implements Comparable<NombreClase>
public class Pais implements Comparable<Pais> { // Permite que la clase se ordene por nombre ya que se especifico en el override
    private String nombre;
    private long poblacion;
    private long superficie;
    private String moneda;

    public Pais(String nombre, long poblacion, long superficie, String moneda) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.superficie = superficie;
        this.moneda = moneda;
    }

    public Pais() {
    }

    public String getNombre() {
        return nombre;
    }

    public long getPoblacion() {
        return poblacion;
    }

    public long getSuperficie() {
        return superficie;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoblacion(long poblacion) {
        this.poblacion = poblacion;
    }

    public void setSuperficie(long superficie) {
        this.superficie = superficie;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
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
        final Pais other = (Pais) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    // Al crear el comparator se añade este método
    @Override
    public int compareTo(Pais o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }
    
    
    
    
}
