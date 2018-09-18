/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIO_3_2_2;

/**
 *
 * @author franmatias
 */
public class TablaEnteros {

    private Integer[] tabla;

    //****************CONSTRUCTOR*********************
    public TablaEnteros(Integer[] tabla) {
        if(tabla == null || tabla.length == 0)
            throw new IllegalArgumentException("No hay elementos");
        this.tabla = tabla;
    }
    
    //*****************METODOS**************************
    //Devuelve la suma de los elementos de la tabla
    public int sumaTabla() {
        int suma = 0;
        for (int i = 0; i < tabla.length; i++) 
            suma += tabla[i];
        return suma;
    }
    
    //Devuelve el mayor elemento de la tabla
    public int mayorTabla() {
        int max = -999;
        for (int i = 0; i < tabla.length; i++) 
            if (tabla[i] > max)
                max = tabla[i];
        return max;
    }
    
    //Devuelve la posición de un elemento cuyo valor se pasa
    public int posicionTabla(int n) {
        for (int i = 0; i < tabla.length; i++) 
            if (tabla[i] == n)
                return i;
        throw new java.util.NoSuchElementException("No existe: " + n);
    }   
    
}
