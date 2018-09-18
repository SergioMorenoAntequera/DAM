/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;
import javax.swing.*;

/*Crear un metodo que permita validar si el 
valor ingresado en un JOptionPane es un caracter*/

/**
 *
 * @author diurno
 */
public class Ej_03_ValidarCaracter {
    
    public static void main(String[] args){
        
        try{
            Ej_03_ValidarCaracter.validar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "He dicho un caracter");
        }
    }
    
    //*********************************** NO FUNCIONA ******************
    public static void validar() throws Exception {
            String entrada = JOptionPane.showInputDialog("Introduce un caracter");
            char[] charr = new char[1];
            charr = entrada.toCharArray();
            if(entrada.length() > 1){
               throw new Exception();
            }
            JOptionPane.showMessageDialog(null, charr[0] + ", buen caracter");
    }
}
