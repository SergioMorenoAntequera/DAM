/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02;

/**
 *
 * @author diurno
 */
public class AA_ConstructorException extends Exception {
    
    //Constructor por defecto
    public AA_ConstructorException(){
        super("Soy un constructor por defecto");
    }

//Construcot con parametros (String error)
    public AA_ConstructorException(String error){
        super(error);
    }
}
