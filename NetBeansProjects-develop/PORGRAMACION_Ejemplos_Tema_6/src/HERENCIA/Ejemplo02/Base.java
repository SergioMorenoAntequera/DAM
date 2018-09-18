/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HERENCIA.Ejemplo02;

/**
 *
 * @author diurno
 */
public class Base {
    
    //Sobrecarga métodos de la clase derivada
    //Definir el mismo metodo con listinto tipo de comando y devolviendo lo mismo
    
    public void escribe(int k){
        System.out.println("Metodo clase Base, argumento entero");
        System.out.println(k);
    }
    
    public void escribe(String a){
        System.out.println("Metodo clase Basem argmento String");
        System.out.println(a);
    }
    //Aquí escribir() está sobrecargado
    
    //Reescribir es lo mismo pero exactamente iguales y se sustituye uno
    //por el otro Ej: toString
}
