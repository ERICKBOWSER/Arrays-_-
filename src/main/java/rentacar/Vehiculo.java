/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacar;

import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author guerig
 */
public class Vehiculo {

    private String bastidor;
    private String matricula;
    private Color color;
    private Modelo modelo;
    private boolean disponible;
    private double tarifa;
    

    // Generar vehiculo aleatorio
    
    public Vehiculo(){
        this.bastidor = RandomStringUtils.randomAlphanumeric(10);
        this.matricula = RandomStringUtils.randomNumeric(4) + " " + RandomStringUtils.randomAlphabetic(3);
        this.color = Color.getAleatorio();
        this.modelo = Modelo.getAleatorio();
    }
    
    
    
    
    
    
    @Override
    public String toString() {
        return "Vehiculo{" + "bastidor=" + bastidor + ", matricula=" + matricula + ", color=" + color + ", modelo=" + modelo + ", disponible=" + disponible + ", tarifa=" + tarifa + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.bastidor);
        hash = 79 * hash + Objects.hashCode(this.matricula);
        hash = 79 * hash + Objects.hashCode(this.color);
        hash = 79 * hash + Objects.hashCode(this.modelo);
        hash = 79 * hash + (this.disponible ? 1 : 0);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.tarifa) ^ (Double.doubleToLongBits(this.tarifa) >>> 32));
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
        final Vehiculo other = (Vehiculo) obj;
        
        return Objects.equals(this.bastidor, other.bastidor);
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getBastidor() {
        return bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public Color getColor() {
        return color;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    
    
    
}
