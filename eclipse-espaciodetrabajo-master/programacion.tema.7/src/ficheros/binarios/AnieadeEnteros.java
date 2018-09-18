package ficheros.binarios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class AnieadeEnteros {
	public static void main(String[] args) throws IOException {
		
		String ruta = "/home/diurno/Documentos/FicherosProgramacion";
		File original = new File(ruta +"/50PrimerosEnteros");
		try {
			FileOutputStream destino = new FileOutputStream(original, true);
			PrintWriter pw = new PrintWriter(destino);
			for(int i = 0; i<51; i++){
				pw.write(i);
			}
			pw.close();
			System.out.println("Fichero creado con exito");
		} catch (FileNotFoundException e) {
			System.out.println("Ha ocurrido un error");
		}
	}
		
		/* *************AÑADIENDO COSAS DESDE TECLADO(no terminado)****************
		 * 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elige la direción del archivo al que añadir");	
		String ruta = sc.next();
		System.out.println("Elige el nombre del archivo al que añadir");	
		String nombre = sc.next();
		File archivo = new File(ruta +"/"+ nombre);
		if(archivo.createNewFile()) {
			System.out.println("El archivo no existia, hemos creado uno nuevo");
			System.out.println("Escribe que quieres añadir");
		} else {
			System.out.println("Escribe que quieres añadir");
		}
		try(FileOutputStream salida = new FileOutputStream(archivo, true)) {
			int numero
		} catch (InputMismatchException e) {
			System.out.println("Ha ocurrido un error");
		}
		sc.close();
	}*/
}
