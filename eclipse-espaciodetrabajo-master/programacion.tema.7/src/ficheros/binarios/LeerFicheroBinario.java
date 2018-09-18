package ficheros.binarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LeerFicheroBinario {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la ruta del archivo que quieres copiar");
		String ruta = sc.nextLine();
		System.out.println("Introduce el nombre del archivo");
		String nombre = sc.nextLine();
		File original = new File(ruta +"/"+ nombre);
		try {
			FileInputStream entrada = new FileInputStream(original);
			boolean fin = false;
			int unByte = 0;
			while(!fin) {
				unByte = entrada.read();
				if(unByte != -1) {
					System.out.print((char)unByte);
				} else {
					fin = true;
				}
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontardo");
		}
		sc.close();
	}
}
