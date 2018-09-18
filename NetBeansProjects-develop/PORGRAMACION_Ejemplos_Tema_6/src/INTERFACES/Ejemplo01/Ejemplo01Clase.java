/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFACES.Ejemplo01;

/**
 *
 * @author diurno
 */
public class Ejemplo01Clase implements Ejemplo01{
    
    public int sumar(int arg, int arg2){    //Si tu pones en la clase que va a
        return arg + arg2;                  //implementar un interfac hay que 
    }                                       //llamar a TODOS los metodos o poner
                                            //la clase como abstracta "public abstract class"
    public int restar(int arg, int arg2){
        return arg - arg2;
    }
    
}
