/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacionbusqueda;

import java.util.*;
import java.util.Collections;

/**
 *
 * @author guerig
 */
public class OrdenacionBusquedaVideojuego {
    
    public static void main(String[] args) {
        List<Videojuegos> videojuego = new ArrayList<>();
        
        videojuego.add(new Videojuegos("Valorant", 2020, 6, 2, "Riot Games", Modo.SHOOTER));
        videojuego.add(new Videojuegos("League of legends", 2009, 10, 27, "Riot games", Modo.MOBA));
        videojuego.add(new Videojuegos("The legend of Zelda: Breath of the wild", 2017, 3, 3, "Nintendo", Modo.AVENTURA));
        videojuego.add(new Videojuegos("Horizon Zero Dawn", 2017, 2, 28, "Guerrilla games", Modo.MUNDO_ABIERTO));
        videojuego.add(new Videojuegos("Zamba", 2010, 5, 4, "Nintendo", Modo.DEPORTES));
        
        // Lista desordenada
        System.out.println("Lista desordenada:");
        videojuego.forEach(System.out :: println);
        System.out.println("------------------------------");
        
        // Ordenación con comparator (lambda)
        // Al usar el comparator hay que usar el nombre de la clase con la que lo estamos comparando
        Comparator<Videojuegos> criterioNombre = (v1, v2) -> v1.getNomJuego().compareToIgnoreCase(v2.getNomJuego());
        Comparator<Videojuegos> criterioFecha = (v1, v2) -> v1.getAnioLanzamiento().compareTo(v2.getAnioLanzamiento());
        
        System.out.println("Lista ordenada:");
        Collections.sort(videojuego, criterioNombre);
        videojuego.forEach(System.out :: println);
        System.out.println("------------------------------");
        
        // Ordenación por nombre y luego por año
        Collections.sort(videojuego, criterioNombre.thenComparing(criterioFecha));
        videojuego.forEach(System.out :: println);
        System.out.println("------------------------------");
        
        
    }
    
    
}
