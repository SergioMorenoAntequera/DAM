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
public class Ejercicio09 {
    public static void main (String [ ] args) {
        //Aquí las instrucciones del método
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el numero de valores");
        int valores = sc.nextInt();
        double[] numeros = new double[valores];
        double menor = 0, mayor = 0, media = 0;
        
        for(int i = 0; i<numeros.length; i++){
            System.out.println("Introdude el numero en la posicion " + (i+1));
            double numero = sc.nextDouble();
            numeros[i] = numero;
            if(i==0){
                menor = numeros[i];
                mayor = numeros[i];
            } else {
                if(numeros[i] > mayor)
                    mayor = numeros[i];
                
                if(numeros[i]< menor)
                    menor = numeros[i];
            }
            media += numero;
        }
        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
        System.out.println("La media es: " + media/valores);
    }
    
}
