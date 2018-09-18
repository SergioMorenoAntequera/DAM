/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author diurno
 */
public class Ejercicio04 {
    public static void main (String [ ] args) {
        //Aquí las instrucciones del método
        int[] pares = new int[20];
        int save = 2;
        for(int i = 0; i<pares.length; i++){
            pares[i] = save;
            save = save + 2;
            System.out.print(pares[i] + " ");
        }
        
    }
}
