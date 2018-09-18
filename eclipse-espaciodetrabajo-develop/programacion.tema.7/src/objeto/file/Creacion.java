package objeto.file;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Creacion {
	
	//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Creacion.crear();
		} catch (IOException e) {
			System.out.println("Error");
		}
	}
	
	//Metodo
	public static void crear() throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el directorio donde quieras crear un archivo seguido de su nombre");
		String ruta = sc.nextLine();
		File archivo = new File(ruta);
		if(archivo.createNewFile()) {
			System.out.println("Archivo creado con exito");
		} else {
			System.out.println("Ya hay un archivo/directorio con ese nombre");
		}
		sc.close();
	}

}
