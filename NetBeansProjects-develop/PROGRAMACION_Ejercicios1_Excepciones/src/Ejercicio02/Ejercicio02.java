/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02;
import java.util.Scanner;

/**
 *
 * @author diurno
 */
public class Ejercicio02 {
    
    public static void main(String[] args){
        
        try {
        System.out.println(Ejercicio02.factorial());
        } catch (AA_ConstructorException a){
            System.out.println("He dicho positivo");
        } catch (Exception e) {
            System.out.println("Te has pasao");
        }
    }
    
    public static int factorial() throws AA_ConstructorException {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero positivo");
        int num = sc.nextInt();
        if(num < 0){
            throw new AA_ConstructorException();
        }
        int numSave = num;
        for(int j=1; j<numSave; j++){
            num = num*j;
        }
        return num;
    }
}
