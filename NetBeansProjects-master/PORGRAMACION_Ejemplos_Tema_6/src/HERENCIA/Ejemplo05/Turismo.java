/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HERENCIA.Ejemplo05;

/**
 *
 * @author diurno
 */
public class Turismo extends Vehiculos{
    //En vehiculos
    //El alquiler se fracciona por km
    //Debe tener variables estaticas que indican el numero de objetos creados
    //como si quieres hacer una variable que se llame objetos creados yo que se
    
    private double precioKm;
    private int kmInicio;
    private int kmFin;
    private static int numTurismo;
    private static int numTurAlquilados;
    
    /******CONSTRUCTORES********/
    public Turismo(String matricula, double precioKm, int kmInicio, int kmFin){
        super.setMatricula(matricula);
        this.precioKm = precioKm;
        this.kmInicio = kmInicio;
        this.kmFin = kmFin;
    }
    
    /******GETTER***********/
    public double getPrecioKm(){
        return precioKm;
    }

    public int getKmInicio() {
        return kmInicio;
    }

    public int getKmFin() {
        return kmFin;
    }

    public static int getNumTurismo() {
        return numTurismo;
    }

    public static int getNumTurAlquilados() {
        return numTurAlquilados;
    }

    /******SETTER***********/
    
    public void setPrecioKm(double precioKm) {
        this.precioKm = precioKm;
    }

    public void setKmInicio(int kmInicio) {
        this.kmInicio = kmInicio;
    }

    public void setKmFin(int kmFin) {
        this.kmFin = kmFin;
    }

    public static void setNumTurismo(int numTurismo) {
        Turismo.numTurismo = numTurismo;
    }

    public static void setNumTurAlquilados(int numTurAlquilados) {
        Turismo.numTurAlquilados = numTurAlquilados;
    }

    /*********METODOS HEREDADOS**********/
    @Override
    public void alquilar() {
        numTurAlquilados++;
    }
    @Override
    public void devolver(){
        if(numTurAlquilados > 0)
            numTurAlquilados--;
        else
            System.out.println("No hay coches para devolver");
    }
    @Override
    public void showInfo(){
        System.out.println("El precio por km es: " + precioKm + "\n");
    }
}
