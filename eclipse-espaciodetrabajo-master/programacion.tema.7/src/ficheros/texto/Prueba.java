package ficheros.texto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Prueba {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		File archivo = new File("/home/diurno/Repositorios/eclipse-espaciodetrabajo/Archivos/hola");
		FileReader entradaFr = new FileReader(archivo);
		BufferedReader entradaBr = new BufferedReader(entradaFr);
		PrintWriter pw = new PrintWriter("/home/diurno/Repositorios/eclipse-espaciodetrabajo/Archivos/waw");
		
		String salida;
		while ((salida = entradaBr.readLine()) != null) {
			pw.println(salida);
		}
		
		pw.close();
		entradaBr.close();
	}

}
