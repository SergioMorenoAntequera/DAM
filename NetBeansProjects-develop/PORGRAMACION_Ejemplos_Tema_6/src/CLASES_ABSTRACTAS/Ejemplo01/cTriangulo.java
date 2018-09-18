/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES_ABSTRACTAS.Ejemplo01;

/**
 *
 * @author diurno
 */
public class cTriangulo extends Figura {
    
    private double lado;
    
    public double area(){
        return (lado*2)/ 2;
    }
    
    public double perimetro(){
        return lado*4;
    }
    
}
