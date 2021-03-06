package ejercicio04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Texto07 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica la ruta del archivo donde buscar");
		String ruta1 = sc.next();
		System.out.println("Indica el nombre del archivo donde buscar");
		String nombre1 = sc.next();
		File original = new File(ruta1 + "/" + nombre1);
		
		System.out.println("Indica la palabra a buscar");
		String palabra = sc.next();
		try {
			FileReader fr = new FileReader(original);
			BufferedReader br = new BufferedReader(fr);
			
			String linea;
			while((linea = br.readLine()) != null) {
				if(linea.contains(palabra)) {
					System.out.println(linea);
				}
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ese archivo no existe");
		}
		sc.close();
	}
}
