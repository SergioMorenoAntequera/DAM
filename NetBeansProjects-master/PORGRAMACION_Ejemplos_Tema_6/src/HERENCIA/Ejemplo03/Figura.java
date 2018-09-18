/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HERENCIA.Ejemplo03;

/**
 *
 * @author diurno
 */
public class Figura {
    
    public double px;
    public double py;
    
    public Figura(){
        this.px = 0;
        this.py = 0;
    }
    
    public Figura(double a, double b){
        this.px = a;
        this.py = b;
    }
    
    public void imprimirCentro(){
        
    }

    public double getPx() {
        return px;
    }

    public double getPy() {
        return py;
    }

    public void setPx(double px) {
        this.px = px;
    }

    public void setPy(double py) {
        this.py = py;
    }
    
    
    
}
