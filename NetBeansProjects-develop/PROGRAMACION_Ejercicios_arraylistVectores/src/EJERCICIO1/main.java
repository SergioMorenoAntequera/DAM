/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIO1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diurno
 */
public class main {
    public static void main(String args[]) {
        ArrayList<Coche> Coches = new ArrayList<Coche>();
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantos coches desea introducir?");
        int numCoches = sc.nextInt();
        for(int i = 0; i<numCoches; i++){
            System.out.println("COCHE " + (i+1));
            System.out.println("Introduce matricula");
            String matricula = sc.next();
            System.out.println("Introduce marca");
            String marca = sc.next();
            System.out.println("Introduce modelo");
            String modelo = sc.next();
            System.out.println("Introduce tipo de combustible");
            String tipoCombustible = sc.next();
            System.out.println("Introduce km");
            int km = sc.nextInt();
            Coche coche = new Coche(matricula, marca, modelo, tipoCombustible, km);
            Coches.add(coche); 
        //Coches introducidos
        }
        int interruptor = 1;
        while (interruptor != 7 || interruptor < 0 || interruptor > 7){
            System.out.println("MENU");
            System.out.println("1. Informacion todos los coches");
            System.out.println("2. Informacion por marca");
            System.out.println("3. Informacion por menos km");
            System.out.println("4. Informacion por mas km");
            System.out.println("5. Informacion por cumbustible");
            System.out.println("6. Coches odenado de menos a más kilometros");
            System.out.println("Otro. Salir");
            interruptor = sc.nextInt();
            switch (interruptor){
                case 1:{
                    for(int i = 0; i<Coches.size(); i++){
                        System.out.println("Coche nº" + (i+1));
                        Coches.get(i).info();
                    }
                }
                break;
                
                case 2:{
                    System.out.println("Introduce una marca para buscar");
                    String buscarMarca = sc.next();
                    int c=0;
                    for(int i = 0; i<Coches.size(); i++){
                        if (Coches.get(i).buscarMarca(buscarMarca)){
                            c++;
                            System.out.println("Coche nº" + (i+1));
                            Coches.get(i).info();
                        }
                    }
                    System.out.println("Hemos encontrado esa marca en " + c + " coches");
                }
                break;
                
                case 3:{
                    System.out.println("Introduce un numero de kilometros");
                    int buscarKm = sc.nextInt(), c=0;
                    for(int i = 0; i<numCoches; i++){
                        if(Coches.get(i).menosKm(buscarKm)){
                            c++;
                            System.out.println("Coche nº" + (i+1));
                            Coches.get(i).info(); 
                        }
                    }
                    System.out.println("Hemos encontrado menos de esos km en: " + c + " coches");
                }
                break;
                
                case 4:{
                    System.out.println("Introduce un numero de kilometros");
                    int buscarKm = sc.nextInt();
                    for(int i = 0; i<numCoches; i++){
                        if(Coches.get(i).masKm(buscarKm)){
                            System.out.println("Coche nº" + (i+1));
                            Coches.get(i).infoParcial();
                        }
                    }
                }
                break;

                case 5: {
                    System.out.println("Introduce un tipo de combustible");
                    String buscarCombustible = sc.next();
                    int c=0;
                    for(int i = 0; i<numCoches; i++){
                        if(Coches.get(i).buscarCombustible(buscarCombustible)){
                            System.out.println("Coche nº" + (i+1));
                            Coches.get(i).info();
                            c++;
                        }
                    }
                    System.out.println("Hemos encontrado menos de esos km en: " + c + " coches");
                }
                break;
                
                case 6: {
                    System.out.println("Los coches ordenado son los: ");
                    for(int i=0; i<numCoches-1; i++) {
                        for(int j=i+1; j<numCoches; j++) {
                            if(Coches.get(j).getKm()<Coches.get(i).getKm()){
                                Coche aux = new Coche(); 
                                aux = Coches.get(i);
                                Coches.set(i, Coches.get(j));
                                Coches.set(j, aux);
                            }
                        }  
                    }
                    for(int i = 0; i<numCoches; i++){
                        Coches.get(i).info();
                    }
                    
                }
            }
        }
    }
}
