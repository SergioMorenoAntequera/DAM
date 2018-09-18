/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03;

/**
 *
 * @author diurno
 */
public class AnioValidoException extends Exception {
    
    //Constructor por defecto
    public AnioValidoException(){
        super("Soy un constructor por defecto");
    }

//Construcot con parametros (String error)
    public AnioValidoException(String error){
        super(error);
    }
}
