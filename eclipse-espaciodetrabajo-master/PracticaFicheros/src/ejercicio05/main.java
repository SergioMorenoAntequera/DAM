package ejercicio05;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MostrarMenu();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void MostrarMenu() throws IOException {
		System.out.println("***MENU***");
		System.out.println("1. Crear  fichero  (debe  contener  libros  y  revistas)");
		System.out.println("2. Añadir  publicaciones  (del  tipo  libros  y  revistas)");
		System.out.println("3. Mostrar  datos.");
		System.out.println("4. Salir  del  programa");
		
		FileOutputStream bn = new FileOutputStream(new File("E:\\Repositorios\\eclipse-espaciodetrabajo\\Archivos/hola"));
		ObjectOutputStream fobj = new ObjectOutputStream(bn);
		fobj.writeObject(new Libros());
		
		fobj.close();
	}

}
