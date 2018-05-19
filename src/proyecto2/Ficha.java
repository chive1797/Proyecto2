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
public class Ficha {
    
    public  String Tipo;
    public  String Cola_Heap;
    public  String Prioridad;
    private  String Numero;
    private  String Cliente;
    public int Telefono;
    private int Codigo;
    
    
    

    public Ficha (String Clase, String prioridad, String numero){
        this.Tipo = Clase;
        this.Prioridad=prioridad;
        this.Numero=numero;
        this.Cola_Heap = "Cola";
        if ("No Perecedero".equals(Clase)){
            int number = 1000;
            if ("Discapacitado".equals(prioridad)){
                number= number+100;
                int x = Integer.parseInt(numero);
                number= number+ x;
                this.Codigo = number;
                
            }
            else if("Adulto Mayor".equals(prioridad)){
                number= number+300;
                int x = Integer.parseInt(numero);
                number= number+ x;
                this.Codigo = number;
                
            }
            else if ("Embarazada".equals(prioridad)){
                number = number+500;
                int x = Integer.parseInt(numero);
                number= number+ x;
                this.Codigo = number;
            }
            else{
                number = number+700;
                int x = Integer.parseInt(numero);
                number= number+ x;
                this.Codigo = number;
            }
        }
        else{
            int number = 2000;
            if ("Discapacitado".equals(prioridad)){
                number= number+100;
                int x = Integer.parseInt(numero);
                number= number+ x;
                this.Codigo = number;
                
            }
            else if("Adulto Mayor".equals(prioridad)){
                number= number+300;
                int x = Integer.parseInt(numero);
                number= number+ x;
                this.Codigo = number;
                
            }
            else if ("Embarazada".equals(prioridad)){
                number = number+500;
                int x = Integer.parseInt(numero);
                number= number+ x;
                this.Codigo = number;
            }
            else{
                number = number+700;
                int x = Integer.parseInt(numero);
                number= number+ x;
                this.Codigo = number;
            }
            
        }
        
       
    }
    

    public String getClase(){
        
        System.out.print(this.Tipo);
        return this.Tipo;
        
    }
    public String getPrioridad(){
        
        System.out.print(this.Prioridad);
        return this.Prioridad;
    }
    
    public String getNumero(){
        System.out.print(this.Numero);
        return this.Numero;
    }
    public int getCodigo(){
        System.out.println(this.Codigo);
        return this.Codigo;
    }
    public String view(){
        System.out.println("FICHA "+ this.Tipo +" PRIORI "+ this. Prioridad+" NUM: "+ this.Numero+ "      Cola o Heap: "+Cola_Heap);
        return (this.Tipo +" "+ this. Prioridad+" "+ this.Numero);
    }
        
    
}
