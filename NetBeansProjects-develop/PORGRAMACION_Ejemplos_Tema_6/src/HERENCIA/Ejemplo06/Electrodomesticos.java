/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HERENCIA.Ejemplo06;

/**
 *
 * @author diurno
 */
public class Electrodomesticos {
    
    protected int precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    
    /****************CONSTRUCTORES*******************/
    public Electrodomesticos(){
        precioBase = 100;
        color = "blanco";
        consumoEnergetico = 'F';
        peso = 5;
    }
    
    public Electrodomesticos(int precioBase, double peso){
        this.precioBase = precioBase;
        color = "blanco";
        consumoEnergetico = 'F';
        this.peso = peso;
    }
    
    public Electrodomesticos(int precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = Electrodomesticos.comprobarColor(color);
        this.consumoEnergetico = Electrodomesticos.comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    
    /***************SETTER Y GETTER*****************/
    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }
    
    /********************METODOS**********************/
    public static char comprobarConsumoEnergetico(char letra){
        
        if(letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F'){
            return letra;
        } else {
            return 'F';
        }
    }   
    
    public static String comprobarColor(String color){
        if(color.equals("blanco") || color.equals("negro") || color.equals("gris") || color.equals("azul") || color.equals("rojo"))
            return color;
        else
            return "blanco";
    }
    
    public int precioFinal(){
        int precio = 0;
        switch(this.consumoEnergetico){
            case 'A': {
                precio += 100;
            }
            break;
            case 'B': {
                precio += 80;
            }
            break;
            case 'C': {
                precio += 60;
            }
            break;
            case 'D': {
                precio += 50;
            }
            break;
            case 'E': {
                precio += 30;
            }
            break;
            case 'F': {
                precio += 10;
            }
            break;
        }
        
        if(this.peso >= 0 && this.peso <= 19){
            precio += 10;
        } else {
            if(this.peso >= 20 && this.peso <= 49){
                precio += 50;
            } else {
                if(this.peso >= 50 && this.peso <=79){
                    precio += 80;
                } else {
                    if(this.peso >= 80)
                       precio += 100;
                } 
            }
        }
        this.precioBase += precio;
        return this.precioBase;
    }
}
