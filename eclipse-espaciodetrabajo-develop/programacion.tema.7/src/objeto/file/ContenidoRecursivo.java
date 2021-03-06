package objeto.file;

import java.io.File;
import java.util.Scanner;

public class ContenidoRecursivo {

	//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContenidoRecursivo.yoquese();
	}
	
	//metodos
	public static void yoquese() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe el nombre del directorio");
		String ruta = sc.next();
		File directorio = new File(ruta);
		if(directorio.isDirectory()) {
			File[] archivos = directorio.listFiles();
			for(int i = 0; i<archivos.length; i++) {
				if(archivos[i].isFile()) {
					System.out.println("+ " + archivos[i].getName() + " es un archivo");
				} else {
					System.out.println("+" + archivos[i].getName() + ": ");
					String ruta2 = ruta + "/" + archivos[i].getName();
					File directorio2 = new File(ruta2);
					File[] archivos2 = directorio2.listFiles();
					for(int j = 0; j<archivos2.length; j++) {
						System.out.println("   -" + archivos2[j].getName());
					}
				}
			}
		} else {
			System.out.println("Tienes que elegir un directorio");
		}
		sc.close();

	}

}
