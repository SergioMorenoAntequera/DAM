/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HERENCIA.Ejemplo05;
import java.util.Calendar;

/**
 *
 * @author diurno
 */
public class Fecha {
    
    private int dia;
    private int mes;
    private int anio;

     
    /*CONSTRUCTORES*/
    public Fecha(){
        this.dia = 0;
        this.mes = 0;
        this.anio = 0;
    }
    
    public Fecha(int dia, int mes, int anio){   //Construcor muy simple que no tiene
        if(dia<=31 && dia > 0)                  //en cuenta las variaciones en el año  
            this.dia = dia;
        else
            System.out.println("Dia no valido");
        if(mes <= 12 && mes > 0)
            this.mes = mes;
        else
            System.out.println("Mes no valido");
        if(anio <= 1900 && anio > 2100)
            this.anio = anio;
        else
            System.out.println("Año incorrecto");
    }

    public static long distancia(Fecha fechaAlquiler, Fecha fechaDevolucion){
        
        Calendar Alquilado = Calendar.getInstance();
        Alquilado.set(fechaAlquiler.getAnio(), fechaAlquiler.getMes(), fechaAlquiler.getDia());
        
        Calendar Devuelto = Calendar.getInstance();
        Devuelto.set(fechaDevolucion.getAnio(), fechaDevolucion.getMes(), fechaDevolucion.getDia());
        
        long ms = Alquilado.getTime().getTime() - Devuelto.getTime().getTime();
        
    return ms;
    }
    
    /*GETTER*/
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    /*SETTER*/
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    @Override
    public String toString(){
        String mensaje = this.dia + "/" + this.mes + "/" + this.anio;
        return mensaje;
    }
    
}
