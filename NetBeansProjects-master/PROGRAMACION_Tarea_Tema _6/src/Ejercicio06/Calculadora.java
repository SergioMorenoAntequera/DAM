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
public class Calculadora {
    
    public static void main(String[] args){
        
        boolean correcto = false;
        int respuesta = 0;
        do {
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una opcion:");
        System.out.println("1.- Operaciones básicas");
        System.out.println("2.- Operaciones complejas");
        System.out.println("3.- Salir\n");
        System.out.println("Elige una opcion:");
        respuesta = sc.nextInt();
        switch(respuesta){
            case 1: {
                System.out.println("a) Suma");
                System.out.println("b) Resta");
                System.out.println("c) Multiplicacion");
                System.out.println("d) Division");
                String cadena = sc.next();
                if(cadena.length()==1){
                char respuesta2 = cadena.charAt(0);
                switch(respuesta2) {
                    case 'a': {
                        try {
                            System.out.println(Metodos.suma());
                        }  catch (Exception e) {
                            System.out.println("Error al introducir los datos");
                        }
                        correcto = true;
                    }
                    break;
                    case 'b': {
                        try {
                            System.out.println(Metodos.resta());
                        }  catch (Exception e) {
                            System.out.println("Error al introducir los datos");
                        }
                        correcto = true;
                    }
                    break;
                    case 'c': {
                        try {
                            System.out.println(Metodos.multi());
                        }  catch (Exception e) {
                            System.out.println("Error al introducir los datos");
                        }
                        correcto = true;
                    }
                    break;
                    case 'd': {
                        try {
                            System.out.println(Metodos.div());
                        } catch (ExceptionA e) {
                            System.out.println("No puedes dividir entre 0");
                        } catch (Exception e) {
                           System.out.println("Error al introducir los datos");
                        }
                        correcto = true;
                    }
                    break;
                    default:{
                        System.out.println("Respuesta no valida");
                    }
                    break;
                }
                }
            }
            break;
            case 2: {
                System.out.println("a) Potencia");
                System.out.println("b) Raiz cuadrada");
                String cadena = sc.next();
                if(cadena.length()==1){
                char respuesta2 = cadena.charAt(0);
                switch(respuesta2) {
                    case 'a': {
                        try {
                            System.out.println(Metodos.potencia());
                        }  catch (Exception e) {
                            System.out.println("Error al introducir los datos");
                        }
                        correcto = true;
                    }
                    break;
                    case 'b': {
                        try {
                            System.out.println(Metodos.raiz());
                        }  catch (Exception e) {
                            System.out.println("Error al introducir los datos");
                        }
                        correcto = true;
                    }
                    break;
                    default: {
                        System.out.println("Respuesta no valida");
                    }
                    break;
                }
                } else {
                    System.out.println("Respuesta no valida");
                }
                break;
            }
            case 3: {
                System.out.println("Hasta otra!");
                correcto = true;
            }
            break;
            default: {
                System.out.println("Respuesta no valida\n");
            }
            
        }
        } catch (Exception e) {
            System.out.println("Temga cuidado al elegir las opciones\n");
        }
        } while (!correcto && respuesta != 3);
        
        
    }
    
}
