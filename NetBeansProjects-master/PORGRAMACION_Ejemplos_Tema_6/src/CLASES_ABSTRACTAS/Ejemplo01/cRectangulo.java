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
public class cRectangulo extends Figura{
    
    private int lado;
    private int base;
    
    public double area(){
        return base*lado;
    }
    
    public double perimetro(){
        return base*2 + lado*2;
    }
    
}
