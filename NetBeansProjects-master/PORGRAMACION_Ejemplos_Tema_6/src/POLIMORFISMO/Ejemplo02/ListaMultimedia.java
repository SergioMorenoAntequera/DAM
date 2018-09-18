/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POLIMORFISMO.Ejemplo02;
import java.util.Arrays;

/*Escribe una clase ListaMultimedia para almacenar objetos de tipo 
multimedia. La clase debe tener un atributo, que sea un array de objetos 
Multimedia y un entero para contar cuantos objetos hay almacenados. 
Además, tiene un constructor y los siguientes métodos*/

/*El constructor recibe un entero por parámetro indicando el 
número máximo de objetos que va a almacenar.

•int size(): devuelve el número de objetos que hay en la lista.

•boolean add(Multimedia m): añade el objeto al final de la lista, y 
devuelve true, en caso de que la lista esté llena, devuelve false.

•Multimedia get(int position): devuelve el objeto situado en la 
posición especificada.

•String toString(): devuelve la información de los objetos que están 
en la lista.
*/

/**
 *
 * @author diurno
 */
public class ListaMultimedia {
    
    private Multimedia[] almacen;
    private int c;
    
    /*  CONSTRUCTORES*/
    public ListaMultimedia(int c){
        this.c = c;
        this.almacen = new Multimedia[c];
    }
    
    /*METODOS*/
    public int size(){
        return this.almacen.length;
    }
    
    public boolean add(Multimedia m){
        for(int i = 0; (i<almacen.length || this.almacen[i] == null); i++){
            this.almacen[i] = m;
        }
        
        return true;
    }
    
}
