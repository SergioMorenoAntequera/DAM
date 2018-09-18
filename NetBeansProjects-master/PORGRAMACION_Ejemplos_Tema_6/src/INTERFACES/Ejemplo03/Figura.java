/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFACES.Ejemplo03;

/**
 *
 * @author diurno
 */

/*
Implementar la interfaz Figura con los metodos
-calculo Area()
-Calculo perimetro()
Definir las clases rectangulo, circulo y triangulo que implementen la interface figura

considerese una jerarquia de barcos, todos tienen como comportamiento comun msgeSocorro() y alarma(); las clases barcoPasaje,
PortaAvion y Pesquero lo implementan
Barco pasajertos: atributos, eslora y numero de camas 
Porta Aviones: numero aviones y tripulacion
Pesquero: eslora, potencia, pescadores y nombre.
*/

public interface Figura {
    
    //Constantes
    
    
    //Metodos Abstractos
    double area();
    double perimetro();
    
}
