/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIO2;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author diurno
 */
public class Main {
    public static void main(String args[]) {
        ArrayList<Alumno> Alumnos = new ArrayList<Alumno>();
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("¿Cuantos alumnos desea introducir?");
        int numAlumnos = sc.nextInt();
        for(int i = 0; i<numAlumnos; i++){
            System.out.println("ALUMNO " + (i+1));
            System.out.println("Introduce nombre");
            String nombre = sc.next();
            System.out.println("Introduce apellido");
            String apellido = sc.next();
            System.out.println("Introduce DNI");
            String dni = sc.next();
            System.out.println("Introduce sexo");
            String sexo = sc.next();
            System.out.println("Introduce condicion (presencial/semipresencial)");
            String condicion = sc.next();
            System.out.println("Introduce nota final");
            int notaFinal = sc.nextInt();
            Alumno alumno = new Alumno(nombre, apellido, dni, sexo, condicion, notaFinal);
            Alumnos.add(alumno); 
        //Alumnos introducidos
        }
        int interruptor = 1;
        while (interruptor != 7 || interruptor < 0 || interruptor > 7){
            System.out.println("MENU");
            System.out.println("1. Mostrar todos los alumnos");
            System.out.println("2. Mostrar en semipresencial y cantidad");
            System.out.println("3. Ordenar por notas mayor/menor");
            System.out.println("4. Ordenar por notas menor/mayor");
            System.out.println("5. Ordenar por nombre y apellido");
            System.out.println("Otro. Salir");
            interruptor = sc.nextInt();
            switch(interruptor){
                //Apartado 1
                case 1: {
                    for(int i = 0; i<Alumnos.size(); i++){
                        Alumnos.get(i).detalles(i);
                    }
                }
                break;
                
                //Apartado 2
                case 2: {
                    int c = 0;
                    for(int i = 0; i<Alumnos.size(); i++){
                        if(Alumnos.get(i).semipresencial()){
                            Alumnos.get(i).detalles(i);
                            c++;
                        }
                    }
                    System.out.println("Hay "+c+" alumnos en semipresencial");
                }
                break;
                
                //Apartado 3
                case 3: {
                    ArrayList<Alumno> ordenada = new ArrayList<Alumno>();
                    ordenada = Alumno.ordenarHorasMasAMenos(Alumnos, numAlumnos);
                    for(int i = 0; i < Alumnos.size(); i++){
                        ordenada.get(i).detalles(i);
                    }
                }
                break;
                
                //Apartado 4
                case 4: {
                    ArrayList<Alumno> ordenada = new ArrayList<Alumno>();
                    ordenada = Alumno.ordenarHorasMenosAMas(Alumnos, numAlumnos);
                    for(int i = 0; i < Alumnos.size(); i++){
                        ordenada.get(i).detalles(i);
                    }
                }
                
                //Apartado 5
                case 5: {
                    ArrayList<Alumno> alumnoss = new ArrayList<Alumno>();
                    alumnoss = Alumno.ordenarNombreApellidos(Alumnos, numAlumnos);
                    for(int i = 0; i<alumnoss.size(); i++){
                        alumnoss.get(i).detalles(i);
                    }
                }
            }
        }
    }
}