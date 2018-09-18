/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIO_3_1;

import java.util.Scanner;
        
public class Fraccion {
 /* Los atributos de la clase Fraccion son el numerador y el denominador
    que por definicion son numeros enteros */
    private int num;
    private int den;

 //Metodos Constructores     
  
 //Constructor simple     
    public Fraccion() {
        num=0;
        den=1;
    }

  //Constructor para fracciones enteras     
    public Fraccion(int num) {     
        this.num = num;
        den = 1;
    }
  
  //Constructor general
    public Fraccion(int x, int y) {
        num=x;
        den=y;
    }

  /*Funcion para entrada de datos por teclado */
    public static Fraccion datos(){
        Scanner teclado = new Scanner(System.in);
        String numc ="";
        String denomc ="";
        
        Fraccion f=new Fraccion();
        System.out.println("\nIntroduce una fraccion: ");
        String fraccionDato = teclado.next();
        
 /* Buscamos el lugar que ocupa en la cadena el simbolo "/"  */
        
        int pos = fraccionDato.indexOf('/');
        
 /* Si es un numero entero no se encuentra "/" y asigna a "pos" un -1 */
    
        if(pos==-1) {
            int num1 = 
                   Integer.valueOf(fraccionDato.trim()).intValue();
           f= new Fraccion(num1);
        }
        else {
            for(int i=0;i<pos;i++)
                numc+=fraccionDato.charAt(i);
        
 /* El denominador esta entre (pos+1) y la longitud de la cadena */
        
            for(int i=(pos+1);i<fraccionDato.length();i++)
                denomc+=fraccionDato.charAt(i);
        
    /* Convertimos las dos cadenas en los enteros num y denom */
        
            int num = Integer.valueOf(numc.trim()).intValue();
            int denom = Integer.valueOf(denomc.trim()).intValue();
            f = new Fraccion(num,denom);
        }
        return f;
  }
  
  /* Se devuelve una fraccion y los argumentos son fracciones */
  /* Se inicializa primero la fraccion que va a contener el resultado */
    public static Fraccion sumar(Fraccion a, Fraccion b){
        Fraccion c=new Fraccion();
        c.num=a.num*b.den+b.num*a.den;
        c.den=a.den*b.den;
        return c;
    }
    
    public static Fraccion restar(Fraccion a, Fraccion b){
        Fraccion c=new Fraccion();
        c.num=a.num*b.den-b.num*a.den;
        c.den=a.den*b.den;
        return c;
    }

    public static Fraccion multiplicar(Fraccion a, Fraccion b){
        return new Fraccion(a.num*b.num, a.den*b.den);
    }
  /* Para obtener la inversa basta con cambiar numerador por denominador */
     public static Fraccion inversa(Fraccion a){
       return new Fraccion(a.den, a.num);
    }

  /* Para calcular el cociente se obtiene la fraccion producto de la primera
     fraccion,  por la inversa de la segunda fraccion */
    public static Fraccion dividir(Fraccion a, Fraccion b){
      return multiplicar(a, inversa(b));
    }

    public static Fraccion potencia(Fraccion a) {
        Fraccion c = new Fraccion();
        Scanner teclado = new Scanner(System.in);
         
        Fraccion f=new Fraccion();
        System.out.println("\nExponente al que se eleva: ");
        double exponente = teclado.nextDouble();
         
        c.num = (int) Math.pow((double)a.num,Math.abs(exponente));
         
        c.den = (int) Math.pow((double)a.den,Math.abs(exponente));
         
        if(exponente<0) c=Fraccion.inversa(c);
         
        return c;
    }
     
    public String aString(){
     
  /* Se devuelve una cadena con el numerador y denominador y en medio
     el signo "/" de division */ 
         
        if(den==1) return " "+num;
         
        else return num+"/"+den;
    }

    private int mcd(){
        int u=Math.abs(num);
        int v=Math.abs(den);
        if(v==0){
            return u;
        }
        int r;
        while(v!=0){
             r=u%v;
             u=v;
             v=r;
        }
        return u;
    }

    public Fraccion simplificar(){
        int dividir=mcd();
        num/=dividir;
        den/=dividir;
        return this;
    }

}
