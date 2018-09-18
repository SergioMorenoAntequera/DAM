/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIO1;

import java.util.ArrayList;

/**
 *
 * @author diurno
 */
public class Coche {
    
    private String matricula;
    private String marca;
    private String modelo;
    private String tipoCombustible;
    private int km;
    
    public Coche(){
        
        this.matricula = null;
        this.marca = null;
        this.modelo = null;
        this.tipoCombustible = null;
        this.km = 0;
        
    }
    
    public Coche(String matricula, String marca, String modelo, String tipoCombustible, int km){
        
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
        this.km = km;
                
    }
    
    public String detalles(int coche){
        String mensaje = 
        ("Coche nº" + coche) +
        ("\n**************") +
        ("\nMatricula: " + getMatricula()) +
        ("\nMarca: " + getMarca())+
        ("\nModelo: " + getModelo())+
        ("\nCombustible: " + getTipoCombustible())+
        ("\nKm: " + getKm());
        coche++;
        System.out.println(mensaje);
        return mensaje;        
    }
    
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public int getKm() {
        return km;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public void setKm(int km) {
        this.km = km;
    }
    
    //1. Informacion todos los coches
    public void info(){
        System.out.println("**************");
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Combustible: " + this.tipoCombustible);
        System.out.println("Km: " + this.km);
    }
    
    public void infoParcial(){
        System.out.println("**************");
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
    }
    
    
    //Apartado 2
    public boolean buscarMarca(String buscarMarca){
        boolean encontrado = false;
        if(this.marca.contains(buscarMarca)){
            encontrado = true;
        }
        return encontrado;
    }
    
    //Apartado 3
    public boolean menosKm(int km){
        boolean encontrado = false;
        if(this.km < km){
            encontrado = true;
        }
        return encontrado;
    }
    
    //Apartado 4
    public boolean masKm(int km){
        boolean encontrado = false;
        if(this.km > km){
            encontrado = true;
        }
        return encontrado;
    }
    
    // Apartado 5
    public boolean buscarCombustible(String buscarCombustible){
        boolean encontrado = false;
        if(this.marca.contains(buscarCombustible)){
            encontrado = true;
        }
        return encontrado;
    }
    public static void ordenarPorBurbuja(int [] prueba) {
    
    }
    //FAlta el metodo del apartado de ordenar un arraylist de menos kilómetros a más
    
}
