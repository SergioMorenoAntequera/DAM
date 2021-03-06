package objeto.file;
import java.io.File;
import java.util.Scanner;

public class Permisos {

	//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permisos.comprobar();
		
	}
	
	//Metodos
	public static void comprobar() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce archivo o directorio");
		String ruta = sc.nextLine();
		File archivo = new File(ruta);
		
		if(archivo.exists()) {
			if(archivo.isDirectory()) {
				System.out.println("Es un directorio");
				System.out.println("Se puede ejecutar: " + Permisos.VF(archivo.canExecute()));   
				System.out.println("Se puede abrir: " + Permisos.VF(archivo.canRead()));
				System.out.println("Se puede modificar: " + Permisos.VF(archivo.canWrite()));
			} else {
				if(archivo.isFile()) {
					System.out.println("Es un archivo");
					System.out.println("Se puede ejecutar: " + Permisos.VF(archivo.canExecute()));
					System.out.println("Se puede abrir: " + Permisos.VF(archivo.canRead()));
					System.out.println("Se puede modificar: " + Permisos.VF(archivo.canWrite()));
				} else { 
					System.out.println("Ruta no valida");
				}
			}
		} else {
			System.out.println("No existe");
		}
		sc.close();
		
	}

	public static String VF(boolean eso) {
		if (eso == false) {
			return "No";
		} else {
			return "Si";
		}
	}
}
