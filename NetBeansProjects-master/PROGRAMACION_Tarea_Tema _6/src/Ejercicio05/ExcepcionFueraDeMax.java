/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio05;

/**
 *
 * @author diurno
 */
public class ExcepcionFueraDeMax extends Exception {
    
    public ExcepcionFueraDeMax(){
        super("Soy un constructor por defecto");
    }
    
    public ExcepcionFueraDeMax(String msg) {
        super(msg);
    }
    
}
