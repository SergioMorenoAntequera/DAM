/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIO2;

import java.util.Scanner;

/**
 *
 * @author diurno
 */
public class metodos {
    
    //Apartado 1
    public static String[] meterCadena(String[] arr){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe cadena para introducir");
        String cadena = sc.next();
        boolean metido = false;
        int i = 0;
        while(!metido){
            if(arr[i] == null){
                arr[i] = cadena;
                metido = true;
            }
            if(i==arr.length-1){
                return arr;
            }
            i++;
        }
        return arr;
    }
    
    //Apartado 2
    public static String[] sacarCadena(String[] arr) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Indica el indice de la cadena que quieras sacar");
        int inx = sc.nextInt();
        arr[inx] = null;
        for (int i=inx; i<arr.length-1; i++) {
            String aux = arr[i];
            arr[i] = arr[i+1];
            
        }
        arr[arr.length-1] = null;
        return arr;
    }
}
