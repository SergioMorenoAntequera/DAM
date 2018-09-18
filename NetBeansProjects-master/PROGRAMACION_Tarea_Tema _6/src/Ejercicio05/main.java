/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio05;
import java.util.Scanner;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diurno
 */
public class main {
    
    public static void main(String[] args){
        
        Silo silo1 = new Silo();
        Scanner sc = new Scanner(System.in);
        
        //Como en el constrctor con un parametro el tope MAL_NIVEL es 10 y
        //13 se pasa nos salta error directamente y hay que poner un try
        Silo silo2 = new Silo(13);
        
        
        //En este caso la excepción no saltará ya que definimos también el maximo
        //y este es mayor a lo que llenamos.
        Silo silo3 = new Silo(54, 100);
        
        System.out.println("Hasta aquí se han creado dos objetos Silo(silo1 y silo3)");
        System.out.println("*******************************************************\n");
        
        //Vamos a inventar una situación que vaciamos el silo y lo llenamoscon lo que se introduzca
        //para poder probar el set
        System.out.println("Vamos a vaciar el silo1 y selecionarle una cantidad(tenia un máximo de 10)");
        boolean acierto = false;
        int rellenar = 0;
        while (!acierto){
            try {
            rellenar = sc.nextInt();
            if(rellenar >= 0){
                acierto = true;
            } else {
                System.out.println("Ya hemos vaciado el silo entero");
            }
            } catch(Exception e) {
                System.out.println("Se necesita un numero entero");
            }
        }
        
        try {
        silo1.setNivel(rellenar);
        System.out.println("El silo1 ahora tiene " + rellenar + " litros\n");
        } catch (ExcepcionFueraDeMax e){
            System.out.println("El silo ha desbordado\n");
        }
        
        
        //Ahora vamos a añadirle al silo3 una cantidad, recuerda que lo hemos iniciado a 54
        //Cuidado con no pasarte(el limite es 100)
        
        System.out.println("Seleccione una unidad para añadir al silo3, actualmente 54/100");
        try {
            double llenar = sc.nextDouble();
            silo3.llenaSilo(llenar);
            System.out.println("El silo ahora tiene " + silo3.getNivel() + " litros\n");
        } catch (ExcepcionFueraDeMax e) {
            System.out.println("Cantidad no válida\n");
        } catch (Exception e){
            System.out.println("La cantidad ha de ser un numero\n");
        }
        
        System.out.println("Seleccione una unidad para retirar al silo3, actualmente " + silo3.getNivel() + "/100");
        try {
            double vaciar = sc.nextDouble();
            silo3.vaciarSilo(vaciar);
            System.out.println("El silo ahora tiene " + silo3.getNivel() + " litros\n");
        } catch (ExcepcionFueraDeMax e) {
            System.out.println("Cantidad no válida");
        } catch (Exception e){
            System.out.println("La cantidad ha de ser un numero");
        }
    }
}
