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
public class cCirculo extends Figura{
    
    //Parametros de la clase
    private double radio;
    
    public double area(){
        return 3.14*Math.pow(radio, 2);
    }
    
    public double perimetro(){
        return 2*3.14*radio;
    }
    
}
