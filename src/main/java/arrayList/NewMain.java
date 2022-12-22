/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author guerig
 */
public class NewMain {
    public static void main(String[] args) {
        List<Ordenador> lista = new ArrayList<>();
        
        
        
        lista.add(new Ordenador("1", "Intel", 280, 32));
        lista.add(new Ordenador("4", "AMD", 100, 16));
        lista.add(new Ordenador("3", "Snapdragon", 40, 22));
        
        System.out.println("-------------- Lista original --------------");
        lista.forEach(System.out::println);
        
        System.out.println("------------ Ordenación por ID ------------");
        Collections.sort(, (o1, o2) -> o1.id().compareTo(o2.id()));
        lista.forEach(System.out::println);
        
        System.out.println("------------ Ordenación por RAM ------------");
        Collections.sort(, (o1, o2) -> o1.cantidadRAM().compareTo(o2.cantidadRAM()));
        lista.forEach(System.out::println);
        
        
    }
}
