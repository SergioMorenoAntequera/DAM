/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package documentacion;

    /*
    * <h2>Clase Empleado, se utiliza para crear y leer empleados de una BD</h2>
    *
    * Busca información en <a href="http://www.google.com">Google</a>
    * @see <a href="http://www.google.com">Google</a>
    * @version 1-2004
    * @author Profesor
    * @since 1-1-2015
    */
    public class Empleado {
    /**
    * Atributo nombre empleado
    */
    private String nombre;
    /**
    * Atributo apellido del empleado
    */
    private String apellido;
    /**
    * Salario del empleado
    */
    private double salario;
	
    /**
    * Constructor con 3 parámetros
    * Crea objetos empleado, con nombre, apellido y salario
    * @param nombre Nombre del Empleado
    * @param apellido Apellido del Empleado
    * @param salario Salario del Empleado
    */
    public Empleado(String nombre, String apellido, double salario){
	this.nombre = nombre;
	this.apellido = apellido;
	this.salario = salario;
    }
	
    //Métodos públicos
    /**
    * Sube el salario al empleado
    * @see Empleado
    * @param subida Cantidad a subir el salario
    */
    public void subidasalario(double subida){
    	salario = salario + subida;
    }
	
    //Métodos privados
    /**
    * Comprueba que el nombre no esté vacío
    * @return <ul>
    *	<li>true: el nombre es una cadena vacía </li>
    * 	<li>false: el nombre no es una cadena vacía</li>
    *                  </ul>
    */
    private boolean comprobar(){
        if(nombre.equals("")){
            return false;
        }
            return true;
        }
}
