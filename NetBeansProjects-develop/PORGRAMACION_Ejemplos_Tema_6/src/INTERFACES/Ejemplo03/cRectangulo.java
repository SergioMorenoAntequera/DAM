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
public class cRectangulo implements Figura {
    
    private int base;
    private int lado;
    
    @Override
    public double area(){
        return base*lado;
    }
    
    @Override
    public double perimetro(){
        return base*2 + lado*2;
    }
}
