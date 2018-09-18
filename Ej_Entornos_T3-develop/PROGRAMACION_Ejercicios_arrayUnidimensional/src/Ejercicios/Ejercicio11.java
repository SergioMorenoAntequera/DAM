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
public class Ejercicio11 {
    public static void main (String [ ] args) {
        //Aquí las instrucciones del método
        Scanner sc = new Scanner(System.in);
        
        //Crear tamaño Array
        System.out.println("Introduce el numero de valores");
        int valores = sc.nextInt();
        int[] numeros = new int[valores];
        for(int i = 0; i<numeros.length; i++){
            System.out.println("Introdude el numero en la posicion " + (i+1));
            int numero = sc.nextInt();
            numeros[i] = numero;
        }
        
        //Mostrarlo
        System.out.println("Array");
        System.out.println("****************");
        for(int i = 0; i<numeros.length; i++){
            System.out.print(numeros[i] +" ");
        }
        System.out.println();
        
        //Poner numero que buscar
        System.out.println("Introduce un numero para buscar");
        int buscando = sc.nextInt();
        boolean encontrado = false;
        for(int i = 0; i<numeros.length; i++){
            if(numeros[i] == buscando){
                System.out.println("Se encuentra en la posicion " + (i+1));
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("El numero no se ha encontrado");
        }
        
    }
}
