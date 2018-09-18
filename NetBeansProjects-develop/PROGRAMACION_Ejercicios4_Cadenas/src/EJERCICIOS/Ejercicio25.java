/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS;
import java.util.*;

/**
 *
 * @author Sergio
 */
public class Ejercicio25 {
    
    public static void main(String[] args){
        
        Ejercicio25.Ejercicio25();
        
    }
    
    public static void Ejercicio25(){
        
        Scanner sc = new Scanner(System.in);
        int letraA = 0, letraE = 0, letraI = 0, letraO = 0, letraU = 0;
        
        System.out.println("Introduce el texto");
        String cadena = sc.nextLine();
        
        for(int i =0; i<cadena.length(); i++){
            if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A')
                letraA++;
            
            if(cadena.charAt(i) == 'e' || cadena.charAt(i) == 'E')
                letraE++;
            
            if(cadena.charAt(i) == 'i' || cadena.charAt(i) == 'I')
                letraI++;
            
            if(cadena.charAt(i) == 'o' || cadena.charAt(i) == 'O')
                letraO++;
            
            if(cadena.charAt(i) == 'u' || cadena.charAt(i) == 'U')
                letraU++;
        }
        
        System.out.print("a " + letraA + "  ");
        for(int i = 0; i<letraA; i++){
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("b " + letraE + "  ");
        for(int i = 0; i<letraE; i++){
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("i " + letraI + "  ");
        for(int i = 0; i<letraI; i++){
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("o " + letraO + "  ");
        for(int i = 0; i<letraO; i++){
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("u " + letraU + "  ");
        for(int i = 0; i<letraU; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
