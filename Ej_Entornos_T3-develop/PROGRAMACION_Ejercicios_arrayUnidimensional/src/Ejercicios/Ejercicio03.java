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
public class Ejercicio03 {
    public static void main (String [ ] args) {
        //Aquí las instrucciones del método
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el número de alumnos");
        int cantidad = sc.nextInt();
        double[] notas = new double[cantidad];
        double nota=-1;
        for (int i = 0; i<notas.length; i++){
            //boolean valida = false;
            while(nota<0 || nota>10){
                System.out.println("Introduce las notas del alumno: " + (i+1));
                nota=sc.nextInt();
            }
            notas[i] = nota;
            nota=-1; 
        }
        
        //Sacar nota media
        double media = 0;
        for(int i = 0; i<notas.length; i++){
            media = media + notas[i];
        }
        media = media/cantidad;
        System.out.println("La nota media es: " + media);
        
        //Notas por encima de la media
        for(int i = 0; i<notas.length; i++){
            if(notas[i] > media){
                System.out.println("Las notas del alumno " + (i+1)+"("+notas[i] + ")"+ "es superior a la media");
            }
        }
        
    }
}

