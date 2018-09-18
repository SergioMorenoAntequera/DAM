package ficheros.binarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class LeerBinario{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la ruta del archivo a leer");
		String ruta = sc.nextLine();
		System.out.println("Introduce el nombre del archivo a leer");
		String nombre = sc.nextLine();
		File archivo = new File(ruta + "/" + nombre);
		if(archivo.exists()) {
		try(FileInputStream entrada = new FileInputStream(archivo)){
				boolean fin = false;
				while(!fin) {
					int numero = entrada.read();
					if(numero != -1) {
						System.out.print(numero + " ");
					} else {
						fin = true;
					}
				}
			} catch (IOException e) {
			System.out.println("Ha ocurrido un error");
			}
		}
		sc.close();
	}
}

