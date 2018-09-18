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
public class Ejercicio05 {
    public static void main (String [ ] args) {
        //Aquí las instrucciones del método
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        
        for(int i = 0; i<numeros.length; i++){
            System.out.println("Introduce el numero " + (i+1));
            numeros[i] = sc.nextInt();
        }
        
        System.out.println("Tu array es:");
        for(int i = 0; i<numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        int positivos = 0;
            int negativos = 0;
            int ceros = 0;        
        for(int i = 0; i<numeros.length; i++){
            
            if(numeros[i]<0)
                negativos++;
            
            if(numeros[i]>0)
                positivos++;
            
            if(numeros[i]==0)
                ceros++;
        }
       
        System.out.println(negativos + " numeros son negativos");
        System.out.println(positivos + " numeros son positivos");
        System.out.println(positivos + " numeros son cero");
    }
}
