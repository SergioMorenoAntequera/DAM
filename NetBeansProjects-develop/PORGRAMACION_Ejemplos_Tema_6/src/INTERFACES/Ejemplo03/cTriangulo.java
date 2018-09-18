/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFACES.Ejemplo03;

/**
 *
 * @author diurno
 */
public class cTriangulo implements Figura {
    
    private double lado;
    
    @Override
    public double area(){
        return (lado*2)/ 2;
    }
    
    @Override
    public double perimetro(){
        return lado*4;
    }
    
}
