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
public class Lavadora extends Electrodomesticos{
    
    private int carga = 5;
    
    /**********CONSTRUCTORES********************/
    public Lavadora(){
        super();
    }
    
    public Lavadora(int precioBase, double peso){
        super(precioBase, peso);
    }
    
    public Lavadora(int carga){
        this.carga = carga;
        precioBase = super.precioBase;
        color = super.color;
        consumoEnergetico = super.consumoEnergetico;
        peso = super.peso;
    }
    
    /***********GETTER Y SETTER*************/
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    /*************METODOS*****************/
    public int precioFinal(){
        if(carga > 30){
            super.precioBase += 50;
        }
        this.precioBase += super.precioFinal();
        return this.precioBase;
    }
}
