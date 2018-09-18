/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIO2;
import java.util.ArrayList;

/**
 *
 * @author diurno
 */
public class Alumno {
    
    private String nombre;
    private String apellido;
    private String DNI;
    private String sexo;        //Hombre / Mujer
    private String condicion;   //Presencial / Semipresencial
    private double notaFinal;
    
    Alumno(){
        
        nombre = null;
        apellido = null;
        DNI = null;
        sexo = null;
        condicion = null;
        notaFinal = 0;
    
    }
    
    Alumno(String nombre, String apellido, String DNI, String sexo, String condicion, int notaFinal){
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.sexo = sexo;
        this.condicion = condicion;
        this.notaFinal = notaFinal;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCondicion() {
        return condicion;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellidos) {
        this.apellido = apellidos;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    //Apartado 1
    public String detalles(int i){
        String mensaje = 
        ("\n**************") +
        ("\nAlumno nº" + (i+1)) +
        ("\n**************") +
        ("\nNombre: " + getNombre()) +
        ("\nApellido: " + getApellido())+
        ("\nDNI: " + getDNI())+
        ("\nSexo: " + getSexo())+
        ("\nCondicion: " + getCondicion()) +
        ("\nNota Final: " + getNotaFinal());
        System.out.println(mensaje);
        return mensaje;   
    }

    //Apartado 2
    public boolean semipresencial(){
        boolean semipresencial = false;
        if(this.condicion.contains("semipresencial")){
            semipresencial = true;
        }
        return semipresencial;
    }
    
    //QApartado 3
    public static ArrayList ordenarHorasMasAMenos(ArrayList alumnos, int numAlumnos){
        ArrayList<Alumno> alumnos2 = new ArrayList<Alumno>();
        alumnos2 = alumnos;
        for(int i=0; i<numAlumnos-1; i++) {
            for(int j=i+1; j<numAlumnos; j++) {
                if(alumnos2.get(j).getNotaFinal() > alumnos2.get(i).notaFinal){
                    Alumno aux = new Alumno(); 
                    aux = alumnos2.get(i);
                    alumnos2.set(i, alumnos2.get(j));
                    alumnos2.set(j, aux);
                }
            }  
        }
        return alumnos2;
    }
    
    //Apartado 4
    public static ArrayList ordenarHorasMenosAMas(ArrayList alumnos, int numAlumnos){
        ArrayList<Alumno> alumnos2 = new ArrayList<Alumno>();
        alumnos2 = alumnos;
        for(int i=0; i<numAlumnos-1; i++) {
            for(int j=i+1; j<numAlumnos; j++) {
                if(alumnos2.get(j).getNotaFinal() < alumnos2.get(i).notaFinal){
                    Alumno aux = new Alumno(); 
                    aux = alumnos2.get(i);
                    alumnos2.set(i, alumnos2.get(j));
                    alumnos2.set(j, aux);
                }
            }  
        }
        return alumnos2;
    }
    
    public static ArrayList ordenarNombreApellidos(ArrayList alumnos, int numAlumnos){
        ArrayList<Alumno> alumnos2 = new ArrayList<Alumno>();
        alumnos2 = alumnos;
        for(int i=0; i < numAlumnos-1; i++) {
            for(int j=i+1; j < numAlumnos; j++) {
                if(alumnos2.get(j).getNombre().compareTo(alumnos2.get(i).getNombre()) == -1){
                    Alumno aux = new Alumno(); 
                    aux = alumnos2.get(i);
                    alumnos2.set(i, alumnos2.get(j));
                    alumnos2.set(j, aux);
                } else if (alumnos2.get(j).getApellido().compareTo(alumnos2.get(i).getApellido()) == -1){
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
