/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS;

/**
 *
 * @author diurno
 */
public class Ejercicio01 {
    

    //Ejercicio 1
    //Ordenacion de cadenas
    public static void ordenarPorComprobacion(String[] prueba) {
        for(int i=0; i<prueba.length-1; i++) {
            int min=i;
            for(int j=i+1; j<prueba.length; j++) {
                if((prueba[j].compareTo(prueba[min]) == (-1))) {
                    min=j;
                }
            }
            if(i!=min) {
                String aux = prueba[i];
                prueba[i]= prueba[min];
                prueba[min]= aux;
            }
        }
	System.out.println();
	System.out.println("\nArray ordenado");
	for (int i=0; i<prueba.length; i++) {
            System.out.print(prueba[i]+" ");
	}
        System.out.println("\n");
    }
    

    public static void ordenarPorCambio(String[] prueba) {
        for (int i=0; i<prueba.length-1; i++) {
            for(int j=i+1; j<prueba.length; j++) {
		if(prueba[i].compareTo(prueba[j]) == 1) {
                    String aux=prueba[j];
                    prueba[j]=prueba[i];
                    prueba[i]=aux;
		}
            }
	}
    }

   
    public static void ordenarPorBurbuja(String[] prueba) {
	for(int i=0; i<prueba.length-1; i++) {
            for(int j=i+1; j<prueba.length; j++) {
		if(prueba[i].compareTo(prueba[j])==1) {
                    String aux=prueba[i];
                    prueba[i]=prueba[j];
                    prueba[j]=aux;
		}
            }
	}
    }
    
    
    public static String ordenarCaracteresDeMenorAMayor(String a, String b) {
	String menor;
	int cont=0;
	if(a.length()>b.length()) {
            menor=b;
	} else {
            menor=a;
	}
	while(cont<menor.length()) {
            a.compareTo(b);
            cont++;
	}
	return "No errores";
    }

    
    //Buscar en cadenas
    public static String buscarEnElArray(String[] prueba, String cadenaABuscar) {
	int cont=0;
	boolean encontrado=false;
	while(cont<prueba.length&&encontrado==false) {
            if(prueba[cont].compareTo(cadenaABuscar) == 0) {
		encontrado=true;
            }
            cont++;
	}
        if(encontrado==false) {
            return "No se ha encontrado la cadena "+cadenaABuscar+" en el array";
        } else {
            return "Se ha encontrado la cadena "+cadenaABuscar+" en el hueco "+cont+" del array";
        }
    }

    
    public static String buscarEnElArrayLineal(String[] a, String valor) {
	boolean encontrado=false;
	int num=0;
	for(int i=0; i<a.length&&encontrado==false; i++) {
            if(a[i].compareTo(valor) == 0) {
		encontrado=true;
		num=i;
            }
	}
	if(encontrado==false) {
		return "El numero no se ha encontrado";
	} else {
            return "El numero se ha encontrado en la posicion "+num+" del array";
	}
    }

    
    public static String buscarEnElArrayLinealOrdenado(String[] a, String valor) {
	boolean encontrado=false;
	int num=0;
	for(int i=0; i<a.length&&a[i].compareTo(valor) == 0 || i<a.length&&a[i].compareTo(valor) == -1 && encontrado==false; i++) {
            if(a[i].compareTo(valor) == 0) {
                encontrado=true;
                num=i;
            }
        }
	if(encontrado==false) {
            return "El numero no se ha encontrado";
	} else {
            return "El numero se ha encontrado en la posicion "+num+" del array";
        }
    }

    
    public static String busquedaDiatomicaArray(String[] a, String valor) {
	int primero=0, ultimo=a.length-1, centro=0, num=-1;
	boolean encontrado=false;
	while(primero<=ultimo&&encontrado==false) {
            centro=(int)((primero+ultimo)/2);
            if(valor.compareTo(a[centro]) == -1) {
		ultimo=centro-1;
            } else 
                if(valor.compareTo(a[centro]) == 1) {
                    primero=centro+1;
		} else {
                    num=centro;
                    encontrado=true;
		}
	}
	if(num!=-1) {
            return "El valor buscado se encuentra en la posicion "+num+" del array";
        } else {
            return "No se ha encontrado el valor";
	}
    }
    
    
    public static String CharToString(char[] cadena){
        String mensaje = "";
        for(int i = 0; i<cadena.length; i++){
            mensaje += cadena[i];
        }
        return mensaje;
    }
    
    //Ejercicio 2
    public static int contarVocales(String a){
        int cVocales = 0;
        for(int i = 0; i<a.length(); i++){
            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u'){
                cVocales++;
            }
        }
        return cVocales;
    }
    
    //Ejercicio 3
    public static int contarConsonantes(String a){ //Contarán como consonantes !/"/·/$/%/&/...
        int cConsonantes = 0;
        for(int i = 0; i<a.length(); i++){  
           if(a.charAt(i) != 'a' && a.charAt(i) != 'e' && a.charAt(i) != 'i' && a.charAt(i) != 'o' && a.charAt(i) != 'u' && a.charAt(i) != ' ' ){
               cConsonantes++;
           }
        }
        return cConsonantes;
    }
    
    //Ejercicio 4
    public static String invertir(String a){
        int j = a.length()-1;
        char[] inv = new char[a.length()];
        for(int i = 0; i<a.length(); i++){
           inv[j] = a.charAt(i);
           j--;
        }
        
        String invertida = Ejercicio01.CharToString(inv);
        return invertida;
    }
    
    //Ejercicio 5
    public static int cCadInSubCad(String a, String sub){
        int c = 0;
        for(int i = 0; i<=(a.length()-sub.length()); i++){
            //if(sub.compareTo(a.substring(i, a.length())) == 0){    //Y hay suficiente espacio
            if((a.substring(i, i+sub.length()).compareTo(sub)) == 0 ){
                c++;
                i += ((sub.length()));
            }
        }
        return c;
    }
    
    //Ejercicio 6                   Ej: 2w4r5f --> wwrrrrfffff
    public static String numYLetr(String a){
        String result = "";
        for(int i = 0; i<a.length(); i+=2){
            int c = 0;
            int j = Integer.parseInt("" + a.charAt(i)); 
            while(c < j){
                result += (a.charAt(i+1));
                c++;
            }
        }
        return result;
    }
  
    //Ejercicio 7
    public static int contarPalabras(String a){
        int palabras=1;
        for(int i = 0; i<a.length(); i++){
            if(a.charAt(i) == ' '){
                palabras++;
            }
        }
        return palabras;
    }
                    //COMPROBADOS HASTA AQUÍ
    
    //Ejercicio 8
    public static void mayorPalabra(String a){
        int palabras=1;
        for(int i = 0; i<a.length(); i++){
            if(a.charAt(i) == ' '){
                palabras++;
            }
        }
        String[] arr = new String[palabras];
        arr = a.split(" ");
        String mayor = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i].length() > mayor.length()){
                mayor = arr[i];
            }
        }
        System.out.println("");
    }
}

