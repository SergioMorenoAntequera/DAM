/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIO3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diurno
 */
public class main {
    
    public static void main(String[] args){
        
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Quieres introducir un numero de alumnos previo? (si/Cualquier cosa)");
        String respuesta = sc.next();
        
        if(respuesta.equals("si")){
            System.out.println("¿Cuantos alumnos desea introducir?");
        int numAlumnos = sc.nextInt();
        for(int i = 0; i<numAlumnos; i++){
            boolean cursoValido = false;
            boolean correoValido = false;
            boolean dniValido = false;
            System.out.println("ALUMNO " + (i+1));
            System.out.println("Introduce nombre");
            String nombre = sc.next();
            System.out.println("Introduce apellidos");
            String apellidos = sc.next();
            System.out.println("Introduce DNI");
            String dni = sc.next();
            while(!dniValido){
                //Sin tildes por si acaso
                if(dni.length() == 9 ){
                    cursoValido = true;
                } else {
                    System.out.println("DNI no válido, pon otro");
                    dni = sc.next();
                }
            }
            System.out.println("Introduce curso");
            String curso = sc.next();
            while(!cursoValido){
                //Sin tildes por si acaso
                if(curso.equals("ingles") || curso.equals("ingles") || curso.equals("matematicas") || curso.equals("fisica") || curso.equals("dibujo tecnico")|| curso.equals("quimica")){
                    cursoValido = true;
                } else {
                    System.out.println("Curso no válido, pon otro");
                    curso = sc.next();
                }
            }
            System.out.println("Introduce correo (...@gmail.com)");
            String correo = sc.next();
            while(!cursoValido){
                if(correo.contains("@gmail.com")){
                    cursoValido = true;
                } else {
                    System.out.println("correo no válido, pon otro");
                    correo = sc.next();
                }
            }
            Alumno alumno = new Alumno(nombre, apellidos, dni, curso, correo);
            alumnos.add(alumno); 
        }
        }
        int interruptor = 1;
        while (interruptor != 7 || interruptor < 0 || interruptor > 7){
            System.out.println("MENU");
            System.out.println("1. Añadir alumno");
            System.out.println("2. Borrar alumno");
            System.out.println("3. A. Buscar por curso");
            System.out.println("4. B. Decir curso mediante nombre");
            System.out.println("5. C. Ordena y muestra según nombre y apellidos");
            System.out.println("Otro. Salir");
            interruptor = sc.nextInt();
            switch(interruptor){
                case 1:{
                    alumnos.add(Alumno.añadirAlumno());
                }
                break;
                case 2:{
                    Alumno.borrarAlumno(alumnos);
                }
                break;
                case 3:{
                    Alumno.buscarPorCurso(alumnos);
                }
                break;
                case 4:{
                    Alumno.cursoPorNombre(alumnos);
                }
                break;
                case 5:{
                    Alumno.ordenarNombreApellidos(alumnos);
                }
                break;
            }
        }
    }
}

