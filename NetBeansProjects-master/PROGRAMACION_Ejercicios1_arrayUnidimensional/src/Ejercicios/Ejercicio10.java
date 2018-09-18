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
public class Ejercicio10 {
    public static void main (String [ ] args) {
        //Aquí las instrucciones del método
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el numero de valores");
        int valores = sc.nextInt();
        int[] numeros = new int[valores];
        
        for(int i = 0; i<numeros.length; i++){
            System.out.println("Introdude el numero en la posicion " + (i+1));
            int numero = sc.nextInt();
            numeros[i] = numero;
        }
        
        System.out.println("Array");
        System.out.println("****************");
        for(int i = 0; i<numeros.length; i++){
            System.out.print(numeros[i] +" ");
        }
        System.out.println();
        
        int[] numeros2 = new int[valores];
        for(int i = 0; i<numeros.length; i++){
            numeros2[i] = numeros[(valores-i)-1];
        }
        
        System.out.println("Array inverso");
        System.out.println("****************");
        for(int i = 0; i<numeros2.length; i++){
            System.out.print(numeros2[i] +" ");
        }
        System.out.println();
    }
}
