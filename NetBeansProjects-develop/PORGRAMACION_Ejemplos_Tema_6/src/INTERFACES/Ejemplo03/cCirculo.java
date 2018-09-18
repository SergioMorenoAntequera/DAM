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
public class cCirculo implements Figura{
    
    private double radio;
    
    @Override
    public double area(){
        return 3.14*Math.pow(radio, 2);
    }
    
    @Override
    public double perimetro(){
        return 2*3.14*radio;
    }
    
}
