/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.util.Scanner;

/**
 *
 * @author diurno
 */
public class Ejercicio08 {
    public static void main (String [ ] args) {
        //Aquí las instrucciones del método
        Scanner sc = new Scanner(System.in);
        
        double[] numeros = new double[10];
        int positivos = 0; int negativos = 0;
        double mediaPositivos = 0; double mediaNegativos = 0;
        
        for(int i = 0; i<numeros.length; i++){
        System.out.println("Introdude el numero en la posicion " + (i+1));
            double numero = sc.nextDouble();
            if(numero<0){
                negativos++;
                mediaNegativos += numero; 
            }
            
            if(numero>0){
                positivos++;
                mediaPositivos += numero; 
            }
            
            if(numero==0){
                System.out.println("El cero no cuenta");
            }
            
        }
        mediaNegativos = mediaNegativos/negativos;
        mediaPositivos = mediaPositivos/positivos;
        System.out.println("La media de positivos es: " + mediaPositivos);
        System.out.println("La media de negativos es: " + mediaNegativos);
    }  
}
