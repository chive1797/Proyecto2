/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Rolo
 */
public class Administracion {
    //Atributos
    
    public int TotalClientesEntrega;
    public int TotalClientesVentanillas;
    public int TotalClientesSeguridad;
    public int TotalAdultoMayor;
    public int TotalDiscapacitados;
    public int TotalEmbarazadas;
    public int TotalRegular;
    public int TotalPerecedero;
    public int TotalNoPerecedero;
       
    //Constructor
    
    public Administracion(){
        this.TotalClientesEntrega = 0;
        this.TotalClientesSeguridad = 0;
        this.TotalClientesVentanillas = 0;
        this.TotalPerecedero = 0;
        this.TotalNoPerecedero = 0;
    }
    
    
    // Métodos
    
    public int GetTotalClientesCheckin(){
        return this.TotalClientesEntrega;    
    }
    
    public int GetTotalClientesVentanillas89(){
        return this.TotalClientesVentanillas;
    }
    
    public int GetTotalClientesSeguridad(){
        return this.TotalClientesSeguridad;
    }
    
    public int GetTotalEconomico(){
       return this.TotalPerecedero;
    }
    
    public int GetTotalEjecutivo(){
        return this.TotalNoPerecedero;
    }
    
    
    public void SumaCheckin(){
        this.TotalClientesEntrega++;     
    }
    
    public void SumaVentanillas(){
        this.TotalClientesVentanillas++;
    }
    
    public void SumaSeguridad(){
        this.TotalClientesSeguridad++;
    }
    
    public void SumaEconomico(){
        this.TotalClientesSeguridad++;
    }
    
    public void SumaEjecutivo(){
        this.TotalNoPerecedero++;
    }

}

