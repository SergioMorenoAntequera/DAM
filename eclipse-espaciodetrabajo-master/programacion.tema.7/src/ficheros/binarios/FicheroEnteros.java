package ficheros.binarios;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FicheroEnteros {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donde quieres crear el archivo?");
		String ruta = sc.next();
		System.out.println("Que nombre quieres darle?");
		String nombre = sc.next();
		File archivo = new File(ruta + "/" + nombre);
		if(archivo.createNewFile()) {
			System.out.println("Archivo creado con exito");
			try(PrintWriter pw = new PrintWriter(new FileOutputStream(archivo))) {
				System.out.println("Escribe el numero entero positivo que quieras");
				int num = sc.nextInt();
				while (num > 0) {
					pw.write(num);
					System.out.println("Escribe el numero entero positivo que quieras");
					num = sc.nextInt();
				}
			} catch (Exception e){
				System.out.println("El programa ha terminado");
			}
		} else {
			System.out.println("Ya hay un archivo con ese nombre");
		}
		sc.close();
	}
}
