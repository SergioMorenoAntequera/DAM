package videotutorial;
import java.io.*;

public class prueba01 {

	public static void main(String[] args) {
		
		File archivo = new File("C:/Users/seran/OneDrive/Documentos", "Archivo.txt");
		/*
		//Te crea el archivo .txt
		if(!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				
			}
		} else {
			archivo.delete();
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				System.out.println("Error al crear el archivo");
			}
		}
		*/
		
		/*//Escibe sobre el fichero .txt
		try {
			FileWriter fw = new FileWriter(archivo);
			fw.write("WAw willirex");
			fw.write("Y si hago esto?");
			fw.close();
			
		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo");
		}*/
		
		//Lectura del fichero .txt con BufferedReader
		try {
			FileReader almacen = new FileReader(archivo);
			BufferedReader lector = new BufferedReader(almacen);
			
			String leido = lector.readLine();
			for(;leido != null; ) {
				System.out.println(leido);
				leido = lector.readLine();
			}
			
			lector.close();
			
		} catch (IOException e) {
			System.out.println("Error al leer en el archivo");
		}
		
		//Lectura del fichero .txt pasando de binario a char
		try {
			FileReader fr = new FileReader(archivo);
			
			int c = fr.read();
			while (c!=-1) {
				char letra = (char)c;
				System.out.print(letra);
				c = fr.read();
			}
			
			fr.close();
		
		} catch (IOException e) {
			
		}
		
		
		
	}

}
