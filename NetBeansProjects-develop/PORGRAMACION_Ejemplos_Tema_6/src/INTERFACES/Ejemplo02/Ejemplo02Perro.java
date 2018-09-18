/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFACES.Ejemplo02;

/**
 *
 * @author diurno
 */
public class Ejemplo02Perro implements Ejemplo02{
    private int peso;
    private String nombre;
    
    public void desplazamiento(){
        System.out.println("A pata");
    }
    
    public String sonido(){
        return ("Guau guau");
    }
    
    public String comida(){
        return ("Ultima cookies");
    }
    
    public int getPeso(){
        return peso;
    }
    public String getnombre(){
        return nombre;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
}