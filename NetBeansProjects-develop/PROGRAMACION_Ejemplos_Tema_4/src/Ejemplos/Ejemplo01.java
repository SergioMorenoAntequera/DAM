/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author diurno
 */
public class Ejemplo01 {
    
    public static void main(String[] args){
        
        Pattern p = Pattern.compile("ab");
        Matcher m = p.matcher("abababababab");
        System.out.println(m);
        System.out.println(p);
        
        
    }
}
