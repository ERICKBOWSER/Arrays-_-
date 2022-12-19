/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacarlistas;

import rentacar.*;

/**
 *
 * @author guerig
 */
public class EjemploVehiculoEnum {
    public static void main(String[] args) {
        Modelo aleatorio = Modelo.getAleatorio();
        System.out.println("El modelo aleatorio es " + aleatorio.getModelo());
        
        System.out.println("Color " + Color.getAleatorio());
        
        
        Vehiculo v = new Vehiculo();
        System.out.println(v);
        
        
        CatalogoVehiculos catalogo = new CatalogoVehiculos(10);
//        catalogo.mostrarCatalogo();
        
        System.out.println("Nº de vehiculos del catalogo " + catalogo.getNumeroVehiculos());
        System.out.println(catalogo);
        
//        catalogo.borrarVehiculo(catalogo.getListaVehiculos()[3]);
        
        
        Vehiculo aux = new Vehiculo();
        aux.setBastidor("12344321");
        catalogo.anadirVehiculo(aux);
        
        System.out.println("---------- Después de añadir el de la posición --------------");
        System.out.println("Nº vehiculos del catálogo " + catalogo.getNumeroVehiculos());
        System.out.println(catalogo);
        
        
        aux.setBastidor("9999999");
        catalogo.anadirVehiculo(aux);
        
        System.out.println("---------- Después de añadir -----------");
        System.out.println("Nº vehiculos del catálogo " + catalogo.getNumeroVehiculos());
        System.out.println(catalogo);
        
        CatalogoClientes cliente = new CatalogoClientes(10);
        
        System.out.println("Nº de clientes del catalogo " + cliente.getNumeroClientes());        
        System.out.println(cliente);
         
//        
//        Vehiculo[] array = catalogo.getListaVehiculos();
//        array[0].setBastidor("123A");
//        System.out.println("------------------------");
//        catalogo.mostrarCatalogo();
//        Vehiculo n = new Vehiculo();
//        v.setBastidor("123A");
//        System.out.println(n);
//        int pos = catalogo.buscarVehiculo(n);
//        System.out.println("Posicion: " + pos);
//        catalogo.borrarVehiculo(catalogo.getListaVehiculos()[4]);
//        System.out.println("------------ Después de borrar -----------------");
//        catalogo.mostrarCatalogo();
        
        
    }
}
