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
public class Television extends Electrodomesticos{
    
    private int resolucion = 20;
    private boolean tdt = false;
    
    
    /***********CONSTRUCTORES***************/
    public Television(){
        super();
    }
    
    public Television(int precioBase, double peso){
        super(precioBase, peso);
    }
    
    public Television(int precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean tdt){
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    
    /************GETTER Y SETTER*************/
    public int getResolucion() {
        return resolucion;
    }

    public boolean getTdt() {
        return tdt;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
    
    
    
    
}
 