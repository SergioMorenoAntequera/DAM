package ficheros.binarios;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FicheroBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la ruta del archivo a leer");
		String ruta = sc.nextLine();
		System.out.println("Introduce el nombre del archivo a leer");
		String nombre = sc.nextLine();
		File archivo = new File(ruta + "/" + nombre);
		try (FileOutputStream entrada = new FileOutputStream(archivo) ){
			
		} catch (Exception e) {
			
		}
	}

}
