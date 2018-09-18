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
public class Ejercicio12 {
    public static void main (String [ ] args) {
        //Aquí las instrucciones del método
        Scanner sc = new Scanner(System.in);
        
        //Crear tamaño Array
        System.out.println("Introduce el numero de valores");
        int valores = sc.nextInt();
        int[] numeros = new int[valores];
        for(int i = 0; i<numeros.length; i++){
            numeros[i] = (int)(Math.random()*10+1);
        }
        
        System.out.println("Array");
        System.out.println("****************");
        for(int i = 0; i<numeros.length; i++){
            if(i == numeros.length-2){
                System.out.print(numeros[i] +" y ");
            } else {
                if(i == numeros.length-1){
                    System.out.print(numeros[i]);
                } else {
                    System.out.print(numeros[i] +", ");
                }
            }
        }
        System.out.println();
        
    }
}
