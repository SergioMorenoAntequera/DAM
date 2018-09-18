/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;
import javax.swing.*;

/*Crear un metodo que permita validar si el 
valor ingresado en un JOptionPane es numérico*/

/**
 *
 * @author diurno
 */
public class Ej_02_ValidarNumero {
    
    public static void main(String[] args){
        
        try {
            int num = Ej_02_ValidarNumero.validar();
            JOptionPane.showMessageDialog(null, num + " , buen numero"); 
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Numero no válido");
        }
        
    }
    
    public static int validar() {
        String entrada = JOptionPane.showInputDialog("Introduce un numero");
        int i = Integer.parseInt(entrada);
        System.out.println(i);
        return i;
    }
}


