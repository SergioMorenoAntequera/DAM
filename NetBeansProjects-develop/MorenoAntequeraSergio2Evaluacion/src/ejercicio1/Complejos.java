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
public abstract class Complejos implements Operable{
    
    private int parteReal;
    private int parteimaginaria;
    
    /*CONSTRUCTORES*/
    public Complejos(){
        this.parteReal = 0;
        this.parteimaginaria = 0;
    }
    
    public Complejos(int a, int b){
        this.parteReal = a;
        this.parteimaginaria = b;
        
    }
    
    /*SETTER Y GETTER*/

    public void setParteReal(int parteReal) {
        this.parteReal = parteReal;
    }

    public void setParteimaginaria(int parteimaginaria) {
        this.parteimaginaria = parteimaginaria;
    }

    public int getParteReal() {
        return parteReal;
    }

    public int getParteimaginaria() {
        return parteimaginaria;
    }
    
    /*METODOS*/
    @Override
    public String toString(){
        return (this.parteReal + "+"+ this.parteimaginaria + "*" + i);
    }
    
    /*AL NO INCLUIR TODOS LOS METODOS DE LA INTERFAZ(RESTO) ES NECESARIO HACER QUE
    LA CLASE SEA ABSTRACTA,  POR LO TANTO NO SE PUEDEN CREAR OBJETOS DE ESTA MISMA CLASE
    DENTRO DE ELLA(USAR NEW EN LA CLASE) por lo tanto no se puede devolver un objeto
    del tipo Complejo como indica en las instrucciones del método invertir() en el ejercicio
    
    SI SE PODRÍA INCLUIR EL METODO INVERTIR SOLO HABRÍA QUE INCLUIR TAMBIÉN EL METODO RESTO()
    /*public Complejos invertir(){
        Complejos aux = new Complejos(this.parteimaginaria, this.parteReal);
        return(aux);
    }*/
    
    @Override
    public int suma(){
        return this.parteReal + this.parteimaginaria;
    }
    
    @Override
    public int resta(){
        if(this.parteReal > this.parteimaginaria){
            return this.parteimaginaria - this.parteReal;
        } else {
            return this.parteReal - this.parteimaginaria;
        }
    }
    
    @Override
    public int multiplica(){
        return this.parteReal * this.parteimaginaria * constante;
    }
}
