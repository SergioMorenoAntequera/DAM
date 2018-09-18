/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;
import javax.swing.JOptionPane;

/*Crear un metodo que permita validar si el 
valor ingresado en un JOptionPane esta en un rango
entre 0 y 100*/

/**
 *
 * @author diurno
 */
public class Ej_04_ValidarRango {
    
    public static void main(String[] args){
        
        try {
            Ej_04_ValidarRango.validar();
        } catch (AA_ConstructorException a){
            JOptionPane.showMessageDialog(null, "Numero entero no válido");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "He dicho un entero");
        }
        
    }
    
    public static int validar() throws AA_ConstructorException, Exception {
        String entrada = JOptionPane.showInputDialog("Introduce un numero entero entre 0 y 100");
        int i = Integer.parseInt(entrada);
        if (i > 100 || i < 0) {
            throw new AA_ConstructorException();
        }
        JOptionPane.showMessageDialog(null, i + ", buen numero");
        return i;
    }
}
