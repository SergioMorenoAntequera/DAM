/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio06;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Metodos {
    
    
    public static int suma() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1 = sc.nextInt();
        System.out.println("El otro");
        int num2 = sc.nextInt();
        return num1 + num2;
    } 
    
    public static int resta() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1 = sc.nextInt();
        System.out.println("El otro");
        int num2 = sc.nextInt();
        return num1 - num2;
    } 
    
    public static int multi() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1 = sc.nextInt();
        System.out.println("El otro");
        int num2 = sc.nextInt();
        return num1 * num2;
    } 
    
    public static int div() throws Exception, ExceptionA{
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1 = sc.nextInt();
        System.out.println("El otro");
        int num2 = sc.nextInt();
        if(num2 == 0){
            throw new ExceptionA();
        }
        return num1 / num2;
    } 
    
    public static double potencia() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        double num1 = sc.nextDouble();
        System.out.println("El otro");
        double num2 = sc.nextDouble();
        return Math.pow(num1, num2);
    }
    
    public static double raiz() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        double num1 = sc.nextDouble();
        return Math.sqrt(num1);
    }
    
}
