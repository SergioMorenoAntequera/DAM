/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author diurno
 */
public class Racional implements Operable{
    
    private int numerador;
    private int denominador;

    
    /**********CONSTRUCTORES**********/
    public Racional(){
        this.numerador = 0;
        this.denominador = 1;
    }
    
    public Racional(int num, int den){
        if(den == 0){
            System.out.println("denominador no valido, no se ha creado el objeto");
        } else {
        this.numerador = num;
        this.denominador = den;
        }
    }

    /******SETTER Y GETTER*******/
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }
    
    /******METODOS*******/
    @Override
    public String toString(){
        String mensaje = this.numerador +"/"+ this.denominador;
        return mensaje;
    }
    
    public Racional invertir(){
        if(this.numerador == 0){
            System.out.println("No se puede poner el denominador a cero");
            Racional aux = new Racional(this.numerador, this.denominador);
            return aux;
        }
        Racional aux = new Racional(this.denominador, this.numerador); 
        return aux;
    }
    
    @Override
    public int suma(){
        return this.numerador + this.denominador;
    }
    
    @Override
    public int resta(){
        if(this.numerador > this.denominador){
            return this.denominador - this.numerador;
        } else {
            return this.numerador - this.denominador;
        }
    }
    
    @Override
    public int multiplica(){
        return this.numerador * this.denominador * constante;
    }
    
    @Override
    public double resto(){
        return (this.numerador % constante); 
    }
    
}
