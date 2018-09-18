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
public class Ejercicio02 {
    public static void main (String [ ] args) {
        //Aquí las instrucciones del método
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        
        System.out.println("Introduce 5 numeros para llenar el array");
        for(int i = 0; i<numeros.length; i++){
            numeros[i] = sc.nextInt();
        }
        System.out.println("Tus numeros son: ");
        for(int i = 0; i<numeros.length; i++){
        System.out.print(numeros[i]+" ");
        }
        System.out.println();
    }
    
}