/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIO1;
import java.util.Scanner;

/**
 *
 * @author diurno
 */
public class Ejercicio {
    public static void main (String [ ] args) {
        //Aquí las instrucciones del método
        Scanner sc = new Scanner(System.in);
        int[][] ventas = new int[3][6];     //i = caseta  //j = titulo
        int[] sumas = new int[3];
        
        for(int i = 0; i<3; i++){
            for(int j = 0; j<6; j++){
                System.out.println("Introduce las ventas del titulo " + (j+1) + " en la caseta nº " + (i+1));
                ventas[i][j] = sc.nextInt();
                sumas[i] += ventas[i][j];
            }
        }
        
        System.out.println();
        System.out.println("RESULTADOS");
        System.out.println("*******************");
        
        //Apartado b RSULTADO se suma dentro del for
        for(int i = 0; i<3; i++){
            System.out.println("Las suma de la caseta " + (i+1) + " son: " + sumas[i]+ "\n");
        }
        
        
        //Apartado c
        int mayor = 0;
        int mayorPos = 0;
        for(int i = 0; i<3; i++){
            if(i==0){
                mayor = sumas[i];
                mayorPos = 0;
            }
            if(sumas[i] > mayor){
                mayor = sumas[i];
                mayorPos = i;
            }
        }

        System.out.println("La caseta que mas ha vendido es la nº" + (mayorPos+1) +  " con " + mayor + " libros");
        
        //Apartado d
        int menor = 0;
        int menorPos = 0;
        for(int i = 0; i<3; i++){
            if(i==0){
                menor = ventas[i][5];
                menorPos = i;
            }
            if(ventas[i][5] < menor){
                menor = ventas[i][5];
                menorPos = i;
            }
        }
        System.out.println();
        System.out.println("La caseta que ha vendido menos ”El Juego Del Ángel” es la nº" + (menorPos+1) + " con " + menor + " ejemplares ");
    }
}
