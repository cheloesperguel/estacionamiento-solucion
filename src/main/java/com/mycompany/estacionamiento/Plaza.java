/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.estacionamiento;

/**
 *
 * @author Marcelo
 */
public class Plaza {
    
    
    private int numero;
    private boolean ocupado;
    private Automovil autoEstacionado;
    
    public Plaza(int numero){
        this.numero=numero;
        ocupado=false;
        autoEstacionado=null;
    }
    
    public void setAutoEstacionado(Automovil automovil){
        this.autoEstacionado = automovil;
        this.ocupado=true;
    }

    public int getNumero() {
        return numero;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isOcupado() {
        return ocupado;
    }
    
    
    
}
