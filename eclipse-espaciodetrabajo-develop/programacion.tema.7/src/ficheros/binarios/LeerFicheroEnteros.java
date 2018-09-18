package ficheros.binarios;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class LeerFicheroEnteros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Especifica la ruta para leer");
		String ruta = sc.next();
		System.out.println("Introduce el nombre del archivo");
		String nombre = sc.next();
		File archivo = new File(ruta + "/" + nombre);
		if(!archivo.exists()) {
			System.out.println("El archivo no existe");
		} else {
			try(FileInputStream salida = new FileInputStream(archivo)){
				int leido = salida.read();
				while(leido != -1) {
					System.out.print(leido);
					leido = salida.read();
				}
					
			} catch(Exception e) {
				
			}
		}
		
	}

}
