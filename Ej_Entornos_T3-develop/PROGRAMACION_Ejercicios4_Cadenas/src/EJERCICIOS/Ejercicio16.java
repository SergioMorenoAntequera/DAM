/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author diurno
 */
public class Ejercicio16 {

    public static void main(String[] args){
        
        Ejercicio16.Ejercicio16();
        
    }
    
    public static String Ejercicio16(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica donde buscar");
        String cadena = sc.nextLine();
        System.out.println("Indica el que borrar");
        String subCadena = sc.next();
        
        Character[] arr = new Character[cadena.length()];
        Character[] subArr = new Character[subCadena.length()];
        
        for(int i = 0; i<cadena.length(); i++){
                arr[i] = cadena.charAt(i);
        }
        for(int i = 0; i<subCadena.length(); i++){
                subArr[i] = subCadena.charAt(i);
        }
            
        if(!cadena.contains(subCadena)){
            return "Subcadena no encontrada";
        } else {
            
            for(int i = 0; i<arr.length-1; i++){
                if(cadena.substring(i, (i+subArr.length)).equals(subCadena)){
                    for(int j = i; j<subArr.length+i; j++){
                        arr[j] = ' ';
                    }
                    i += subArr.length-1;
                }
            }
            
        }
        for(int l = 0; l<arr.length; l++){
            System.out.print(arr[l]);
        }
        System.out.println();
        return null;
    }
    
}
