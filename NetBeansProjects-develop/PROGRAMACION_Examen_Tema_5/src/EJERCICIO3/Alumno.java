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
public class Alumno {
    
    private String nombre; 
    private String apellidos;
    private String DNI;
    private String curso;
    private String correo;
    
    
    public Alumno(){
        
        nombre = null;
        apellidos = null;
        DNI = null;
        curso = null;
        correo = null;
        
    }
    
    public Alumno(String nombre, String apellido, String DNI, String curso, String correo){
        
        this.nombre = nombre;
        this.apellidos = apellido;
        this.DNI = DNI;
        this.curso = curso;
        this.correo = correo;
    
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public String getCurso() {
        return curso;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String detalles(int i){
        String mensaje = 
        ("\n**************") +
        ("\nAlumno nº" + (i+1)) +
        ("\n**************") +
        ("\nNombre: " + getNombre()) +
        ("\nApellidos: " + getApellidos())+
        ("\nDNI: " + getDNI())+
        ("\nCurso: " + getCurso())+
        ("\nCorreo: " + getCorreo());
        System.out.println(mensaje);
        return mensaje;   
    }
    
    public static Alumno añadirAlumno() {
        
        Scanner sc = new Scanner(System.in);
        boolean cursoValido = false;
        boolean correoValido = false;
        System.out.println("NUEVO ALUMNO");
        System.out.println("Introduce nombre");
        String nombre = sc.next();
        System.out.println("Introduce apellidos");
        String apellidos = sc.next();
        System.out.println("Introduce DNI");
        String dni = sc.next();
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
                System.out.println("Curso no válido, pon otro");
                correo = sc.next();
            }
        }
        Alumno alumno = new Alumno(nombre, apellidos, dni, curso, correo);
        return alumno;
    }
    
    public static ArrayList borrarAlumno(ArrayList lista){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el índice(numero) del que quieras borrar");
        int borrar = sc.nextInt();
        lista.remove(borrar);
        return lista;
    }
    
    public static void buscarPorCurso(ArrayList alumnos){
        ArrayList<Alumno> alumnos2 = new ArrayList<Alumno>();
        alumnos2 = alumnos;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Que asignatura quieres buscar?");
        String buscar = sc.next();
        for(int i = 0; i<alumnos.size(); i++){
            if(alumnos2.get(i).getCurso().equals(buscar)){
                alumnos2.get(i).detalles(i);
            }
        }
    }
    
    public static void cursoPorNombre(ArrayList alumnos){
        ArrayList<Alumno> alumnos2 = new ArrayList<Alumno>();
        alumnos2 = alumnos;
        Scanner sc = new Scanner(System.in);
        boolean encontrado = false;
        
        System.out.println("Introduce nombre");
        String buscar = sc.next();
        for(int i = 0; i<alumnos.size(); i++){
            if(alumnos2.get(i).getNombre().equals(buscar)){
                encontrado = true;
                System.out.println(alumnos2.get(i).getCurso());
            }
        }
        if(!encontrado){
            System.out.println("Alumno no encontrado");
        }
    }
    
    public static ArrayList ordenarNombreApellidos(ArrayList alumnos){
        ArrayList<Alumno> alumnos2 = new ArrayList<Alumno>();
        alumnos2 = alumnos;
        
        for(int i=0; i < alumnos.size()-1; i++) {
            for(int j=i+1; j < alumnos.size(); j++) {
                if(alumnos2.get(j).getNombre().compareTo(alumnos2.get(i).getNombre()) == -1){
                    Alumno aux = new Alumno(); 
                    aux = alumnos2.get(i);
                    alumnos2.set(i, alumnos2.get(j));
                    alumnos2.set(j, aux);
                } else if (alumnos2.get(j).getApellidos().compareTo(alumnos2.get(i).getApellidos()) == -1){
                    Alumno aux = new Alumno(); 
                    aux = alumnos2.get(i);
                    alumnos2.set(i, alumnos2.get(j));
                    alumnos2.set(j, aux);
                }
            }  
        }
        return alumnos2;
    }
}
