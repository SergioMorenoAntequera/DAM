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
public class Familiares extends Turismo{
    
    private static final String tipo = "Utilitario";
    
    public Familiares(String matricula, double precioKm, int kmInicio, int kmFin){
        super(matricula, precioKm, kmInicio, kmFin);
    }
    
    public static String getTipo(){
        return tipo;
    }
    
    public void alquilar(int num) {
        super.setAlquilado(true);
        for(int i = 0; i<=num; i++){
            super.alquilar();
        }
    }
    
    public void devolver(int num) {
        for(int i = 0; i<=num; i++){
            super.alquilar();
        }
        if(Turismo.getNumTurAlquilados() == 0){
            super.setAlquilado(false);
        }
    }
    
    @Override
    public void showInfo() {
        System.out.println("Matrícula: " + super.getMatricula() + "\n"
            + "Precio Km: " + super.getPrecioKm() + "\n"
            + "Km Inicio: " + super.getKmInicio() + "\n"
            + "Km Fin: " + super.getKmFin() + "\n"
            + "PRECIO FINAL: " + (super.getKmFin() - super.getKmInicio()) * super.getPrecioKm() + "€");
    }
    
}
