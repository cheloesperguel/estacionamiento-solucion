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
public class Registro {
    
    private Plaza plaza;
    private LocalDateTime horaInicio;
    private LocalDateTime horaTermino;

    public Registro(Plaza plaza) {
        this.plaza = plaza;
        horaInicio = LocalDateTime.now();
    }
    
    public void finalizarRegistro(){
        horaTermino = LocalDateTime.now();     
     
    }

    public LocalDateTime getHoraTermino() {
        return horaTermino;
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public Plaza getPlaza() {
        return plaza;
    }

    
}
