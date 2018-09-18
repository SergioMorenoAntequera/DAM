/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.Scanner;

/**
 *
 * @author diurno
 */
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //Hacer los array
        System.out.println("De cuantos racionales quieres el Array?");
        int c = sc.nextInt();
        Racional[] arr = new Racional[c];
        for(int i = 0; i < c; i++){
            System.out.println("Racional numero: " + (i+1));
            System.out.print("Numerador: ");
            int num = sc.nextInt();
            System.out.print("Denominador: ");
            int den = sc.nextInt();
            arr[i] = new Racional(num, den);
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Racional y resultado de sus operaciones: ");
        for(int i = 0; i<c; i++){
            System.out.println("toString: "+arr[i].toString());
            System.out.println("Suma: "+arr[i].suma());
            System.out.println("Resta: "+arr[i].resta());
            System.out.println("Multiplicar: "+arr[i].multiplica());
            System.out.println("Resto: "+arr[i].resto());
            System.out.println("");
        }
        
        
        //AL SER COMPLEJOS UNA CLASE ABSTRACTA NO SE PUEDEN CREAR OBJETOS DE ESE TIPO
        //Y POR LO TANTO NO SE PUEDE ACCEDER NI COMPROBAR LOS METODOS
    }
}
