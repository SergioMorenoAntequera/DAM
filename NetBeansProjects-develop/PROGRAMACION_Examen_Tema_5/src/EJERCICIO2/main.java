/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIO2;

/**
 *
 * @author diurno
 */
public class main {
    
    public static void main(String[] args){
        String[] cadena = new String[3];
        
        System.out.println("Mete 3 cadenas");
        metodos.meterCadena(cadena);
        metodos.meterCadena(cadena);
        metodos.meterCadena(cadena);
        
        System.out.println("Saca una");
        metodos.sacarCadena(cadena);
        
        for(int i = 0; i<cadena.length; i++){
            System.out.println(cadena[i]);
        }
    }
    
    
}
