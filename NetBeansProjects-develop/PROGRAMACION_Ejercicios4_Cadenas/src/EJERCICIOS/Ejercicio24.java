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
 * @author Sergio
 */
public class Ejercicio24 {
    
    public static void main(String[] args){
        
        System.out.println(Ejercicio24.Ejercicio24());
        Ejercicio24.Ejercicio24();
    }
    
    public static int Ejercicio24(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el texto");
        String cadena = sc.nextLine();
        String[] palabras = cadena.split(" ");
        int letras = 0;
        if(cadena.contains("a")){
            letras++;
        }
        if(cadena.contains("e")){
            letras++;
        }
        if(cadena.contains("i")){
            letras++;
        }
        if(cadena.contains("o")){
            letras++;
        }
        if(cadena.contains("u")){
            letras++;
        }
        if(letras >= 4){
            return palabras.length;
        }
        return 0;
    }
}
