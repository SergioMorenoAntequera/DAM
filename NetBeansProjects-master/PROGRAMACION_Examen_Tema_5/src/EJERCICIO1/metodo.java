/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIO1;

/**
 *
 * @author diurno
 */
public class metodo {
    
    public static /*int[]*/ void ordenar(int[] enteros1, int[] enteros2){
	int[] ordenado = new int[enteros1.length + enteros2.length];
        
        //Ordenar el primero
        for(int i=0; i<enteros1.length-1; i++) {
            for(int j=i+1; j<enteros1.length; j++) {
		if(enteros1[i]>enteros1[j]) {
                    int aux=enteros1[i];
                    enteros1[i]=enteros1[j];
                    enteros1[j]=aux;
		}
            }
	}
        
        //Ordenar el segundo
        for(int i=0; i<enteros2.length-1; i++) {
            for(int j=i+1; j<enteros2.length; j++) {
		if(enteros2[i]>enteros2[j]) {
                    int aux=enteros2[i];
                    enteros2[i]=enteros2[j];
                    enteros2[j]=aux;
		}
            }
	}
        
        //Colocar los array
        if(enteros1[0]>enteros2[enteros2.length-1]){
            int[] aux = new int[enteros1.length];
            aux = enteros1;
            enteros1 = enteros2;
            enteros2 = aux;
        }
        
        //Meterlos en uno
        int j = 0;
        for(int i = 0; i < ordenado.length; i++){
            if(i<enteros1.length){
                ordenado[i] = enteros1[i];
            } else {
                ordenado[i] = enteros2[j];
                j++;
            }
            System.out.println(ordenado[i]);
        }
    }
}
