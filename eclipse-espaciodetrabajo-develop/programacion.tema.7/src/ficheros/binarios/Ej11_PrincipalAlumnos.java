package ficheros.binarios;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.DataOutputStream;

public class Ej11_PrincipalAlumnos {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la ruta para guardar el archivo");
		String ruta = sc.next();
		System.out.println("Introduce el nombre del archivo");
		String nombre = sc.next();
		File archivo = new File(ruta + "/" + nombre);
		if(archivo.createNewFile()) {
			System.out.println("Cuantos alumnos deseas añadir?");
			int cantidad = sc.nextInt();
			int[][] alumnos = new int[cantidad][4];
			for(int i = 0; i<alumnos.length; i++) {
				Introducir(archivo, alumnos, i);
			}
			
		} else {
			System.out.println("no se ha podido crear el archivo");
		}
		
		
		sc.close();
	}
		
		public static void Introducir(File archivo, int[][] alumnos, int j) throws IOException {
			Scanner sc = new Scanner(System.in);
			DataOutputStream salida = new DataOutputStream(new FileOutputStream(archivo, true));
			
			for(int i = 0; i<alumnos.length; i++) {
				System.out.println("Introduce el nombre del alumno " + (i+1));
				String dato1 = sc.next();
				System.out.println("Introduce la direccion del alumno " + (i+1));
				String dato2 = sc.next();
				System.out.println("Introduce la edad del alumno " + (i+1) + "(Entre 0 y 60)");
				int dato3 = sc.nextInt();
				if(dato3 < 0 || dato3 > 60) {
					throw new IOException();
				}
				System.out.println("Introduce la nota media del alumno " + (i+1) + "(Entre 0 y 10)");
				int dato4 = sc.nextInt();
				if (dato4 < 0 || dato4 > 10) {
					throw new IOException();
				}
				String[] datos = new String[4];
				salida.writeChars(dato1);
				datos[0] = dato1;
				salida.writeChars(dato2);
				datos[1] = dato2;
				salida.writeInt(dato3);
				datos[2] = ""+dato3;
				salida.writeInt(dato4);
				datos[3] = ""+dato4;
			}
			
			salida.close();
			sc.close();
		}
		
}

