/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DESARROLLO_CLASEARRAYLIST;

import java.util.*;

/**
 *
 * @author Sergio
 */
public class EjercicioInventado {
    
    public static void main(String[] args){
        
        //Crea un arrayList y llenalo hasta 15 de numeros aleatorios
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        for(int i = 0; i<15; i++){
            lista.add((int)(Math.random()*10+1));
        }
        
        System.out.println(lista.size());
        
        //Aumenta su capacidad maxima hasta 20 pero no los rellenes (no cambios)
        lista.ensureCapacity(20);
        
        System.out.println(lista.size());
        
        //Elimina los huecos vacios los 20 volviendolos 15(no cambios)
        lista.trimToSize();
        
        System.out.println(lista.size());
        
        //Compruea que haya elementos (Falso no lo está)
        System.out.println(lista.isEmpty()); 
        
        //Añade 5 numeros aleatorios mas
        for(int i = 0; i<5; i++){
            lista.add((int)(Math.random()*10+1));
        }
        System.out.println(lista.size());
        
        //añade en la posicion 0 un 1 y en la 1 un 2
        lista.add(0, 1);
        lista.add(1, 2);
        
        //Crea una coleccion de 5 numeros aleatorios y metela al final
        ArrayList<Integer> coleccion = new ArrayList<Integer>();
        for(int i = 0; i<5; i++){
            coleccion.add((int)(Math.random()*10+1));
        }
        lista.addAll(coleccion);
        
        //Pon ahora la coleccion al principio
        for(int i = 0; i<5; i++){
            coleccion.add((int)(Math.random()*10+1));
        }
        lista.addAll(0, coleccion);
        
        //Muestra el primer valor
        System.out.println(lista.get(0));
        
        //Muestra la posicion del primer 1 o -1 si no hay
        System.out.println(lista.indexOf(1));
        
        //Muestra la posicion del ultimo 1 o -1 si no hay
        System.out.println(lista.lastIndexOf(1));
        
        //Quita el numero en primera posicion
        lista.remove(0);
        
        //Elimina el primer cero
        lista.remove(0);
        
        //Elimina de la lista los que aparezcan en la otra lista
        lista.removeAll(coleccion);
        
        //Elimina de la lista todos los numeros entre 0 y 5
        //Remove Range está protegido Ej:lista.removeRange(0, 5);
        
        //Elimina todos los numeros menos los que están en la seleccion
        lista.retainAll(coleccion);
        
         //Vacia la lista
         lista.clear();
         
        //Llena de nuevo la lista con numeros aleatorios hasta 10
        for(int i = 0; i<10; i++){
            lista.add((int)(Math.random()*10+1));
        }
        
        //Haz una copia de la lista
        lista.clone();
        
        //Comprobar si la lista tiene el numero 5
        System.out.println(lista.contains(5));
        
        //Crea un iterator con la lista
        lista.iterator();
        
        //Crea una lista de iterator con la lista
        lista.listIterator();
        
        //Crea una lista de iterator con la lista desde el puesto 5
        lista.listIterator(5);
        
        //Cambia lo que haya en la posicion 0 por un 1
        lista.set(0, 1);
        
        //Crea una sublista entre la posicion 0 y 5
        lista.subList(0, 5);
        
        //pasa esta lista a un array
        lista.toArray();
        
    }
    
}
