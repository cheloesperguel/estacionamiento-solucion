/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.estacionamiento;

import java.time.LocalDateTime;

/**
 *
 * @author Marcelo
 */
public class Main {
    
    
    public static void main(String args[]) throws InterruptedException{
        
        Estacionamiento est = new Estacionamiento(10);

        est.estacionar(new Automovil("AABB11"), 5);
        
        est.imprimirPlazas();
        
//        boolean resp= est.estacionar(new Automovil("XXYY99"), 5);
//        
//        if(!resp){
//            System.out.println("Plaza ocupada");
//        }
        
        Thread.sleep(180000);
        double total = est.finalizarServicio(5);
        
        System.out.println("Total es: $"+total);
        //est.imprimirPlazasDisponibles();


            
    }    
    
}
