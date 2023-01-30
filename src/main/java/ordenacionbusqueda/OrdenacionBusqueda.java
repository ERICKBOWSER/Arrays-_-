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
        Collections.sort(paises); // Se ordenan automaticamente porque se especifica en el comparable
        paises.forEach(System.out :: println);
        
        // Ordenación usando comparator (proporcionamos el criterio mediante una lambda)
        Comparator<Pais> criterioSuperficie = (p1, p2) -> Long.compare(p1.getSuperficie(), p2.getSuperficie());
        Comparator<Pais> criterioPoblacion = (p1, p2) -> Long.compare(p1.getPoblacion(), p2.getPoblacion()); // La expresión lambda crea un nuevo comparador, por lo que no hace falta crearlo
        Comparator<Pais> criterioNombre = (p1, p2) -> p1.getNombre().compareToIgnoreCase(p2.getNombre());
        
        
        Collections.sort(paises, criterioSuperficie.thenComparing(criterioNombre)); // La ordenación la hace por nombre
        //Collections.sort(paises, criterioPoblacion.reversed()); // Invierte
        System.out.println("-----------------------");
        paises.forEach(System.out :: println);
        
        // Ordena la lista de paises por superficie y luego por población
        Collections.sort(paises, criterioSuperficie.thenComparing(criterioPoblacion));
        
        
        // Collections.sort(paises, criterioSuperficie); > Comentado por Vico
        
        // Búsqueda por orden natural (por nombre)
        /* La lista donde buscar la información debe estar ordenada previamente
            según el criterio de orden natural(nombre) --> Comparable en Pais        
        */
        Collections.sort(paises); // Ordena por el orden natural
        System.out.println("-------------- Búsqueda binaria ---------------");
        System.out.println("Lista ordenada según orden natural(nombre)");
        paises.forEach(System.out :: println);
        
        Pais objetoBuscar = new Pais();
        objetoBuscar.setNombre("Portugal"); // Lista ordenada por nombre, búsqueda por nombre, key es nombre
        int posicion = Collections.binarySearch(paises, objetoBuscar); // Como pais ya tiene comparable, no hace falta el criterio
        System.out.println("Portugal está en la posición " + posicion);
        
        // Si intento buscar en la lista con un valor que es nombre se puede obtener una posición errónea
//        objetoBuscar.setNombre("");
//        objetoBuscar.setPoblacion(23);
        
        posicion = Collections.binarySearch(paises, objetoBuscar);
        System.out.println(posicion);
        
        // Si ordeno la lista por un criterio y busco por otro, el resultado es inesperado
        posicion = Collections.binarySearch(paises, objetoBuscar, criterioPoblacion);
        System.out.println(posicion);
        
        System.out.println("------- Ordenación y búsqueda por población ---------");
        // Antes de usar binarySearch por población la lista debe estar ordenada por población
        Collections.sort(paises, criterioPoblacion);
        paises.forEach(System.out :: println);
        objetoBuscar = new Pais();
        objetoBuscar.setPoblacion(146);
        posicion = Collections.binarySearch(paises, objetoBuscar, criterioPoblacion);
        
        System.out.println("El pais que tiene 146 millones es " + paises.get(posicion));
        
        
    }
    
}
