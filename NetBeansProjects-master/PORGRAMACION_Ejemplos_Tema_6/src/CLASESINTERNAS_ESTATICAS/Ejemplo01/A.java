/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASESINTERNAS_ESTATICAS.Ejemplo01;

/**
 *
 * @author diurno
 */
public class A {
    int a = 10;
    static int b = 5;
    
    static class B{
        B(){
            A s = new A();
            System.out.println(s.a);
            System.out.println(b);
        }
    }
    public static void main(String[] args){
        A.B ab = new A.B();
    }
}
