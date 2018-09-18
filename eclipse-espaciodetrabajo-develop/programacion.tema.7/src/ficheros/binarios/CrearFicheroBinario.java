package ficheros.binarios;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class CrearFicheroBinario {

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
			FileOutputStream salida = new FileOutputStream(new File(ruta + "/" + nombre + "-copia"));
			boolean siguiente = true;
			while(siguiente){
				int unByte = entrada.read();
				if(unByte != -1) {
					salida.write(unByte);
				} else {
					siguiente = false;
				}
			}
			entrada.close();
			salida.close();
			System.out.println("Fichero copiado con exito");
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		}
		sc.close();
	}
}
