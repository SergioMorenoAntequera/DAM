package ejercicio05;
import java.io.File;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ruta = null;
		File archivo = null;
		boolean valido = false;
		int contadorNum = 0, contadorLet = 0, sumaNum = 0;
		PrintWriter pw = null;
		
		//comprobación de datos del fichero
		while(!valido) {
			try {
				System.out.println("Introduce la ruta");
				ruta = sc.nextLine();
				if(ruta.endsWith("/") || ruta.endsWith("\\")) {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("Error al introducir datos");
			}
			
			try {
				archivo = new File(ruta + "/numeros.txt");
				if(!archivo.createNewFile()) {
					System.out.println("Existia un archivo ahí antes, ya lo hemos re-escrito");
					archivo.delete();
					archivo.createNewFile();
				} else {
					System.out.println("Archivo vacio creado con exito");
				}
				valido = true;
			} catch (Exception e) {
				System.out.println("Error al crear el archivo");
			}
		}
		
		//Rellenar el archivo con 10 filas aleatorias de numeros o letras
		try {
			
			pw = new PrintWriter(archivo);
			
			//Rellenar el array con caracteres
			char[] caracteres = new char[27];
			caracteres[0] = 'a';
			for(int i=1; i<caracteres.length; i++) {
				caracteres[i] = (char)(caracteres[i]+1);
			}
			Random random2 = new Random();
			
			for(int i=0; i<=random2.nextInt(51); i++) {
				double random = Math.random()*10+1;
				if(random>5) {
					contadorNum++;
					int numero = (int)(Math.random()*10+1);
					sumaNum += numero;
					System.out.println(numero);
					pw.println(numero); 				//Numeros aleatorios
				} else {
					contadorLet++;
					char letra = caracteres[(random2.nextInt(27))];
					System.out.println(letra);
					pw.println(letra); 				//Caracteres aleatorios
				}
			}
		} catch (Exception e) {
			System.out.println("Error al introducir los datos");
		}
		System.out.println("Archivo rellenado con exito");
		
		
		//Mostrar resumen
		System.out.println("Numero de lineas del fichero: " + (contadorNum + contadorLet));
		pw.println("Numero de lineas del fichero: " + (contadorNum + contadorLet));
		System.out.println("Numero de caracteres: " + contadorLet);
		pw.println("Numero de cadenas: " + contadorLet);
		System.out.println("Numero de numeros: " + contadorNum);
		pw.println("Numero de numeros: " + contadorNum);
		System.out.println("Suma de los numeros: " + sumaNum);
		pw.println("Suma de los numeros: " + sumaNum);
		System.out.println("FIN");
		pw.println("FIN");

		//Lo muestro por pantalla y lo meto en elarchivo
		
		sc.close();
	}
}
