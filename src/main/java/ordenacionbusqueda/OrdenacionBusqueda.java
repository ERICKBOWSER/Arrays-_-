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
public class OrdenacionBusqueda {

    public static void main(String[] args) {
        List<Pais> paises = new ArrayList<>();
        paises.add(new Pais("España", 46, 505_400, "Euro"));
        paises.add(new Pais("Portugal", 23, 25_400, "Euro"));
        paises.add(new Pais("EEUU", 146, 1_505_400, "Dólar Americano"));
        paises.add(new Pais("Italia", 46, 505_400, "Euro"));
        
        paises.forEach(System.out::println);
        System.out.println("----------------------");
        
        // Ordenación usando orden natural (requiere que Pais implemente Comparable)
        Collections.sort(paises);
        paises.forEach(System.out :: println);
        
        // Ordenación usando comparator (proporcionamos el criterio mediante una lambda)
        Comparator<Pais> criterioSuperficie = (p1, p2) -> Long.compare(p1.getSuperficie(), p2.getSuperficie());
        Comparator<Pais> criterioPoblacion = (p1, p2) -> Long.compare(p1.getPoblacion(), p2.getPoblacion()); // La expresión lambda crea un nuevo comparador, por lo que no hace falta crearlo
        Comparator<Pais> criterioNombre = (p1, p2) -> p1.getNombre(), p2.getNombre());
        
        
        Collections.sort(paises, criterioSuperficie.thenComparing(criterioNombre)); // La ordenación la hace por nombre
        //Collections.sort(paises, criterioPoblacion.reversed()); // Invierte
        System.out.println("-----------------------");
        paises.forEach(System.out :: println);
        
        Collections.sort(paises, criterioSuperficie);
        
    }
    
}
