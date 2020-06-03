/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.estacionamiento;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Marcelo
 */
public class CalculadoraCosto {
    
    private int tarifaMinuto; 

    public CalculadoraCosto(int tarifaMinuto) {
        this.tarifaMinuto = tarifaMinuto;
    }
    
    public double calcularTotalTotal(LocalDateTime inicio, 
                        LocalDateTime termino){
        // termino - inicio = tiempo total ( minutos );
        
        double minutosTotales=inicio.until(termino, ChronoUnit.MINUTES);
        System.out.println("Tiempo total: "+minutosTotales);
        double total= minutosTotales*tarifaMinuto;
        
        return total;
    }

    public int getTarifaMinuto() {
        return tarifaMinuto;
    }

    public void setTarifaMinuto(int tarifaMinuto) {
        this.tarifaMinuto = tarifaMinuto;
    }
    
        
}

