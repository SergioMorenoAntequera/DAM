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
public class Ejercicio06 {
    public static void main (String [ ] args) {
        //Aquí las instrucciones del método
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el numero de multiplos");
        int elementos = sc.nextInt();
        int[] pares = new int[elementos];
        System.out.println("Introduce el multiplo");
        int multiplo = sc.nextInt();
        int save = multiplo;
        for(int i = 0; i<pares.length; i++){
            pares[i] = save;
            save = save + multiplo;
            System.out.print(pares[i] + " ");
        }
        
    }
}
