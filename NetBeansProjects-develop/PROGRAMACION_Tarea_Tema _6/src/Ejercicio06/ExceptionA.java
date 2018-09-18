/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio06;

/**
 *
 * @author Sergio
 */
public class ExceptionA extends Exception {
    
    public ExceptionA(){
        super("Soy un constructor por defecto");
    }
    
    public ExceptionA(String msg) {
        super(msg);
    }
}
