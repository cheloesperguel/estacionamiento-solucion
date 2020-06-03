/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.estacionamiento;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Marcelo
 */
public class Estacionamiento {
    
    private Plaza[] plazas;
    private ArrayList<Registro> registros;
    
    public Estacionamiento(int capacidad){
        
        plazas = new Plaza[capacidad];
        registros = new ArrayList<>();
                
        for(int i=0;i<capacidad;i++){
            plazas[i]=new Plaza(i);
        }
    }
    
    public boolean estacionar(Automovil autoCliente, 
                              int numeroPlaza){
        
        if(plazas[numeroPlaza].isOcupado()){   
            //System.out.println("La plaza seleccionada está ocupada");
            return false;
        }else{
            plazas[numeroPlaza].setAutoEstacionado(autoCliente);
            
            Registro r = new Registro(plazas[numeroPlaza]);
            registros.add(r);
            
            return true;
        }      
    }
    
    public double finalizarServicio(int numeroPlaza){
        double totalAPagar=0;
        CalculadoraCosto cal = new CalculadoraCosto(35);
        for(int i=0;i<registros.size();i++){
            Registro r = registros.get(i);
            if(r.getPlaza().getNumero() == numeroPlaza){
               
                r.finalizarRegistro();
                totalAPagar = cal.calcularTotalTotal(r.getHoraInicio(), r.getHoraTermino());
                plazas[numeroPlaza].setOcupado(false); 
                
            }
        }
        
        return totalAPagar;
    }
    
    public void imprimirPlazas(){
        
        for(int i=0; i<plazas.length;i++){
            // [0] : 
            System.out.print("["+i+"] : ");

            if(plazas[i].isOcupado()){
                System.out.println("OCUPADO");
                //System.out.println(plazas[i].)
            }else{
                System.out.println("DESOCUPADO");
            }
            
        }
        
        
    }
    
    
    public void imprimirPlazasDisponibles(){
        for(int i=0; i<plazas.length;i++){
            // [0] : 
            

            if(!plazas[i].isOcupado()){
                System.out.println("["+i+"] : DESOCUPADO");
            }
            
        }
        
    }
}
