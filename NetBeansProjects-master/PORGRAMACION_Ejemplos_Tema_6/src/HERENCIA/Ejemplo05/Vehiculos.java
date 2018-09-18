/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HERENCIA.Ejemplo05;

/**
 *
 * @author diurno
 */
public abstract class Vehiculos {
    
    private String matricula;
    private boolean alquilado;
    
     /*******METODOS ABSTRACTOS*********/
    abstract public void alquilar();
    abstract public void devolver();
    abstract public void showInfo();
    
    /*********CONSTRUCTORES********/   
    public Vehiculos(){
        this.matricula = null;
        this.alquilado = false;
    }
    
    public Vehiculos(String matricula, boolean Alquilado){
        this.matricula = matricula;
        this.alquilado = alquilado;
    }
    
    
    /*********SETTER**********/
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    
    /*********GETTER**********/
    public String getMatricula(){
        return matricula;
        
    }
    
    public boolean isAlquilado() {
        return alquilado;
    }

}
