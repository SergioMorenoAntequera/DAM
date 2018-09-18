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
public class Ejercicio07 {
    public static void main (String [ ] args) {
        //Aquí las instrucciones del método
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de nombres a introducir");
        int cantidad = sc.nextInt();
        String[] nombres = new String[cantidad];
        int[] letras = new int[cantidad];
        
        for(int i = 0; i<cantidad; i++){
            System.out.println("Introdude el nombre numero " + (i+1));
            String nombre = sc.next();
            nombres[i] = nombre;
            letras[i] = nombre.length();
        }
        
        for(int i = 0; i<cantidad; i++){
            System.out.println("El nombre " + nombres[i] + " tiene " + letras[i] +" caracteres");
        }
        
    }
}
