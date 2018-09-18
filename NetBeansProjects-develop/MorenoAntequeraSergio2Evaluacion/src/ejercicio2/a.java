/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author diurno
 */
public class a {
    private static int metodo(){
        int valor = 0;
        System.out. println(valor);
        try{
            valor += 1;
            valor = valor + Integer . parseInt( "W" );
            valor += 1;
            System.out. println("valor en try: " + valor);
            throws new IOException();
        } catch (NumberFormatException e){
            valor = valor + Integer . parseInt("42");
            System.out. println("valor en catch: " + valor);
        } finally {
            valor = valor + 1;
            System.out. println("valor en finally: " + valor);
        }
        valor += 1;
        System.out. println("valor al final: " + valor);
        return valor;
    }
    
    public static void main(String [ ] args){
        try{
            System.out.println(a.metodo());
        } catch (Exception e){
            System.err. println("Excepcion en metodo()");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
