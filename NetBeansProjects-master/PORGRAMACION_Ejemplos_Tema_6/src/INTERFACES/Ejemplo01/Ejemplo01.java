/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFACES.Ejemplo01;

/**
 *
 * @author diurno
 */
public interface Ejemplo01 {
    int MINIMO = 1;             //Al ser una interfaz todos las variables son constantes
    int MAXIMO = 10;            //No haria falta declararlo como tal
    int sumar(int arg, int arg2);
    int restar(int arg, int arg2);
}