package objeto.file;
import java.io.File;
import java.util.Scanner;

public class Analiza {
	
	//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Analiza.Analizar();
	}
	
	//metodos
	public static void Analizar() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una ruta para ver si es archivo o directorio");
		String ruta = sc.nextLine();
		File archivo = new File(ruta);
		
		if(archivo.exists()) {
			if(archivo.isDirectory()) {
				System.out.println("Es un directorio");
			} else {
				if(archivo.isFile()) {
					System.out.println("Es un archivo");
				} else { 
					System.out.println("Ruta no valida");
				}
			}
		} else {
			System.out.println("No existe");
		}
		sc.close();
	}
}
