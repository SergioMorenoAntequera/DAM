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
public class Metodos {

    
    //Leer valores de matriz
    public static int[][] Crear(int filas, int columnas){
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[filas][columnas];
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                System.out.println("Introdue un valor para la posicion " + i + "," + j);
                int numero = sc.nextInt();
                matriz[i][j] = numero;
                }
        }
        
        return matriz;
    }
    
    //Imprimir matriz
    public static void Imprimir(int[][] matriz){
        System.out.println("TU MATRIZ ES: ");
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
    }
    
    //Valor maximo
    public static int ValorMaximo(int[][] matriz){
        int mayor = 0;
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                if(i==0 && j==0){
                    mayor = matriz[i][j];
                }
                if(matriz[i][j]>mayor){
                    mayor = matriz[i][j];
                }
            }
        }
        return mayor;
    }
    
    //Valor minimo
    public static int ValorMinimo(int[][] matriz){
        int menor = 0;
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                if(i==0 && j==0){
                    menor = matriz[i][j];
                }
                if(matriz[i][j]<menor){
                    menor = matriz[i][j];
                }
            }
        }
        return menor;
    }
    
    //suma matrices
    public static int[][] Suma(int[][] s1, int[][] s2){
        int[][] resultado = s1;
        if(s2.length != s1.length || s2[0].length != s1[0].length){
            int[][] cero = {{0}};
            System.out.println("ERROR AL INTRODUCIR DATOS");
            return cero;
        } else {
            for(int i = 0; i<s1.length; i++){
               for(int j = 0; j<s1[i].length; j++){
                    resultado[i][j] += s2[i][j];
                }
          }
        return resultado;
        }
    }
    
    //resta matrices
    public static int[][] Resta(int[][] s1, int[][] s2){
        int[][] resultado = s1;
        if(s2.length != s1.length || s2[0].length != s1[0].length){
            int[][] cero = {{0}};
            System.out.println("ERROR AL INTRODUCIR DATOS");
            return cero;
        } else {
            for(int i = 0; i<s1.length; i++){
               for(int j = 0; j<s1[i].length; j++){
                    resultado[i][j] -= s2[i][j];
                }
          }
        return resultado;
        }
    }
    
    //Matriz por escalar
    public static int[][] MatrizPorEscalar(int[][] s1, int num){
        int[][] resultado = s1;
        for(int i = 0; i<s1.length; i++){
            for(int j = 0; j<s1[i].length; j++){
                    resultado[i][j] *= num; 
            }
          }
        return resultado;
    }
    
    //Matriz por matriz
    public static int[][] MatrizPorMatriz(int[][] s1, int[][]s2){
        int[][] resultado = new int[s1.length][s2[0].length];
        if(s1[0].length != s2.length){
            int[][] cero = {{0}};
            System.out.println("ERROR AL INTRODUCIR DATOS");
            return cero;
        } else {
            for(int i = 0; i<resultado.length; i++){
                for(int j = 0; j<resultado[0].length; j++){
                    for(int k = 0; k<s1[0].length; k++){
                        resultado[i][j] += s1[i][j] * s2[i][j];
                    }
                }
            }  
        }
        return resultado;
    }

    //Transpuesta de una matriz
    public static int[][] Transpuesta(int[][] s1){
        int[][] transpuesta = new int[s1[0].length][s1.length];
        for(int i = 0; i< s1[0].length; i++){
            for(int j = 0; j<s1.length; j++){
                transpuesta[i][j]= s1[j][i];
            }
            
        }
        return transpuesta;
    }
    
}


