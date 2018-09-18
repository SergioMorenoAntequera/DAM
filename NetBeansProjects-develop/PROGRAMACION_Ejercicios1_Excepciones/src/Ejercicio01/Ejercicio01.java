/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01;
import java.util.Scanner;

/**
 *
 * @author diurno
 */
public class Ejercicio01 {
    
    public static void main(String[] args){
        
        try{
            System.out.println(Ejercicio01.division());
        } catch (AA_ConstructorException a) {
            System.out.println("¿Como vas a dividir entre 0?");
        } catch (Exception e){
            System.out.println("He dicho enteros");
        }
    }
    
    public static int division() throws AA_ConstructorException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int i = sc.nextInt();
        System.out.println("Introduce el otro");
        int j = sc.nextInt();
        if(j==0){
            throw new AA_ConstructorException();
        }
        return i/j;
    }
    
}
