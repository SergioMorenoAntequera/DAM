package objeto.file;
import java.io.File;
import java.util.Scanner;

public class FiltroComienzo {
	
	/*++++++++++++++++ESTA HECHO PERO SIN APLICAR LA CLASE FILTRO+++++++++++++++++++++++*/
	//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FiltroComienzo.listado();
		} catch (Exception e) {
			System.err.println(e);
		}
		
	}
	
	//metodos
	public static void listado() throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe el nombre del directorio");
		String ruta = sc.next();
		File directorio = new File(ruta);
		if(directorio.isDirectory()) {
			System.out.println("Escribe la letra");
			String letra = sc.next();
			if(letra.length() > 1) {
				throw new Exception();
			}
			letra = letra.substring(0, 1);
			
			File[] archivos = directorio.listFiles();
			for(int i = 0; i < archivos.length; i++) {
				if(archivos[i].getName().substring(0, 1).compareToIgnoreCase(letra) == 0) {
					System.out.println(archivos[i].getName());
				}
			}
		} else {
			System.out.println("Tienes que elegir un directorio");
		}
		sc.close();
	}
}

