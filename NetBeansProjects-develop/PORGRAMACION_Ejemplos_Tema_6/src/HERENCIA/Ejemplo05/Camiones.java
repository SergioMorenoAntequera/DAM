/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HERENCIA.Ejemplo05;
import java.util.Scanner;

/**
 *
 * @author diurno
 */
public class Camiones extends Vehiculos {
    //El aquiler se fraciona por dias
    
    private double precioPorDia;
    /*private int diaAlquiler;
    private int diaDevolucion;*/
    private static int numCamiones;
    private static int numCAlquilados;
    private Fecha fechaDevolucion;
    private Fecha fechaAlquiler;
    Scanner sc = new Scanner(System.in);
    
    public Camiones(String matricula, double precioPorDia, Fecha fechaDevolucion, Fecha dechaAlquiler){
        super.setMatricula(matricula);
        this.precioPorDia = precioPorDia;
        this.fechaDevolucion = fechaDevolucion;
        this.fechaAlquiler = fechaAlquiler;
    }
    
    /*GETTERS*/
    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public static int getNumCamiones() {
        return numCamiones;
    }

    public static int getNumCAlquilados() {
        return numCAlquilados;
    }

    /*SETTERS*/
    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public static void setNumCamiones(int numCamiones) {
        Camiones.numCamiones = numCamiones;
    }

    public static void setNumCAlquilados(int numCAlquilados) {
        Camiones.numCAlquilados = numCAlquilados;
    }
    
    
    /*METODOS ABSTRACTOS DE VEHICULOS*/
    @Override
    public void alquilar(){
        numCAlquilados++;
    }
    @Override
    public void devolver(){
        if(numCAlquilados > 0)
            numCAlquilados--;
    }
    @Override
    public void showInfo(){
        System.out.println("El precio por dia es: " + precioPorDia + "€"
        + "El total es: " + Fecha.distancia(fechaAlquiler, fechaDevolucion) + "€");
    }
}
