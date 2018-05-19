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
public class Ventanillas {
    
    public String nombreVentanilla;
    public String tipo;
    public String Prioridad;
    public String Estado;
    public String Atendiendo;
    public int clientes;

    public Ventanillas() {
        this.nombreVentanilla = null;
        this.tipo=null;
        this.Atendiendo = null;
        this.Estado = null;
        this.Prioridad= null;
        
    }
    
    public  Ventanillas(String nombre, String tipo){
        this.nombreVentanilla = nombre;
        if (("Cola").equals(tipo)){
            this.tipo = "Cola";
        }
        else{
            this.tipo = "Heap";
        }
        
    }
    public  Ventanillas(String nombre){
        this.nombreVentanilla = nombre;
        this.Estado = "Cerrado";
        this.Atendiendo ="";
        if (("Cola").equals(tipo)){
            this.tipo = "Cola";
        }
        this.clientes= 0;
    }
     
    
    public String verVentanas(){

        return (this.nombreVentanilla +" "+ this.Atendiendo + " " + this.Estado);
        
    }
    public String verName(){

        return (this.nombreVentanilla);
        
    }
    public void ClientesPlus(){
        this.clientes ++;
    }
    public int ShowClientes(){
        return this.clientes;
    }
    public String verEstado(){

        return (this.Estado);
        
    }
    public String verAtendiendo(){

        return (this.Atendiendo);
        
    }
    
    
    
    public String GetEstado(){
        return "Cerrado";
    }
    
    public void SetEstado(String Abierto){
        String Abierta = "Abierta";
        this.Estado = Abierta;
    }
    public void SetAtendiendo(String ficha){
        this.Atendiendo = ficha;
    }
    public String GetAtendiendo(){
        return this.Atendiendo;
    }
    public void SetCerrar(String ficha){
        this.Estado = ficha;
        this.Atendiendo="";
    }
    
   
    

}
