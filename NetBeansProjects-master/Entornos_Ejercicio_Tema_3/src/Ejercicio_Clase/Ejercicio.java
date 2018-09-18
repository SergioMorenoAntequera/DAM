/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Clase;
import java.util.Scanner;

/**
 *
 * @author diurno
 */
public class Ejercicio {
   
    public static void main (String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int empleado, departamento;
        String oficio;
        boolean valido = false;
        
        while (valido = false){
        System.out.println("Introduce el numero de empleado(3 dígitos)");
            empleado = sc.nextInt();
            if(empleado > 100 && empleado < 999){
                valido = true;
            }
        }   
        
        valido = false;
        while (valido = false){
        System.out.println("Introduce el numero de departamento(2 dígitos)");
            empleado = sc.nextInt();
            if(empleado > 10 && empleado < 99){
                valido = true;
            }
        }  
        
        valido = false;
        while (valido = false){
        System.out.println("Introduce el oficio");
            empleado = sc.nextInt();
            if(empleado > 10 && empleado < 99){
                valido = true;
            }
        } 
    }
}
