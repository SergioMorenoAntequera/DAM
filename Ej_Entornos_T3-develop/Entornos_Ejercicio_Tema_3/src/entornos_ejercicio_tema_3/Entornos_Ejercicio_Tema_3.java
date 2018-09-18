/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos_ejercicio_tema_3;

/**
 *
 * @author diurno
 */
public class Entornos_Ejercicio_Tema_3 {

    /**
     * Método para hacer una division de enteros
     * @param numerador
     * @param denominador
     * @return 
     */
    public static int division(int numerador, int denominador){
        int resultado = 0;
        try {
            resultado = (numerador/denominador);
        } catch (Exception e){
            System.out.println("Se ha producido un error " + e.getMessage());
        }
        return resultado;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Resultado de la operacion: " + division(6, 0));
        
    }
    
}
