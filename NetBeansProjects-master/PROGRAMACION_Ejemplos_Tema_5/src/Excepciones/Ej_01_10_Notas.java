/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author diurno
 */
public class Ej_01_10_Notas {
    
    //Programa que lea 10 notas validas usando Scanner y bufferedReader Controle
    //excepciones valide notas y saque la media
    
    public static void main(String[] args){
        //Esto es como declarar el Scanner
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //ó BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        /*//BufferedReader
        int notaInt=0, c=0, suma = 0;
        while(c < 10 && notaInt >= 0 && notaInt <= 10) {
            
            System.out.println("Introduce la nota " + (c+1) + "/10");
            try{
                String nota = br.readLine();
                notaInt = Integer.parseInt(nota);
                
            } catch (Exception e) {
                System.out.println("La has liao");
            }
            suma += notaInt;
            c++; 
        }
        System.out.println("La media es: " + suma/10);*/
    
        //Scanner
        Scanner sc = new Scanner(System.in);
        
        int nota2=0, c2=0, suma2 = 0;
        while(c2 < 10 && nota2 >= 0 && nota2 <= 10) {
            
            System.out.println("Introduce la nota " + (c2+1) + "/10");
            try{
                nota2 = sc.nextInt();
                
            } catch (Exception e) {
                System.out.println("La has liao");
            }
            suma2 += nota2;
            c2++; 
        }
        System.out.println("La media es: " + suma2/10);
    }
}
