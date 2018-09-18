/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio05;

/**
 *
 * @author diurno
 */
public class Silo {
    
    //Atributos
    private double nivel;
    private final double MAX_NIVEL;
    
    //Constructores
    public Silo(){
        
        this.nivel = 0;
        this.MAX_NIVEL = 10;
        
    }
    
    public Silo(double nivel) {
        this.MAX_NIVEL = 10;
        if(nivel < 0 || nivel > MAX_NIVEL){
            System.out.println("Numero no válido, no se ha creado el objeto");
        } else {
            this.nivel = nivel;
        }
    }
    
    public Silo(double nivel, double MAX_NIVEL) {
        this.MAX_NIVEL = MAX_NIVEL;
        if(nivel < 0 || nivel > MAX_NIVEL){
            System.out.println("Numero no válido, no se ha creado el objeto");
        } else {
            this.nivel = nivel;
        }
    }
    
    //Setter y getter
    public void setNivel(double nivel) throws ExcepcionFueraDeMax {
        if(nivel > MAX_NIVEL){
            throw new ExcepcionFueraDeMax();
        } else {
            this.nivel = nivel;
        }
    }

    public double getNivel() {
        return nivel;
    }

    public double getMAX_NIVEL() {
        return MAX_NIVEL;
    }
    
    //Metodos
    @Override
    public String toString(){
        String mensaje = ("Actualmente tiene: " + this.nivel + "/" + this.MAX_NIVEL);
        return mensaje;
    }
    
    public void llenaSilo(double cantidad) throws ExcepcionFueraDeMax{
        double comprobar = this.nivel + cantidad;
        if(comprobar > MAX_NIVEL || comprobar < 0){
            throw new ExcepcionFueraDeMax();
        } else {
            this.nivel += cantidad;
        }
    } 
    
    public void vaciarSilo(double cantidad) throws ExcepcionFueraDeMax {
        double comprobar = this.nivel - cantidad;
        if(comprobar < 0){
            throw new ExcepcionFueraDeMax();
        } else {
            this.nivel -= cantidad;
        }
    }
}
