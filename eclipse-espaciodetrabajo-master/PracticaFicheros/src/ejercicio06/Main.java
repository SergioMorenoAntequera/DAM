package ejercicio06;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {
	
	static RandomAccessFile archivo;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		
		try {
			archivo = new RandomAccessFile("E:/Repositorios/eclipse-espaciodetrabajo/Archivos/random", "rw");
		} catch (FileNotFoundException e1) {
			System.out.println("Error");
		}
		
		int respuesta = 0;
		boolean valido = false;
		while(!valido) {
			try {
				respuesta = menu();
				valido = true;
			} catch (Exception e) {
				System.out.println("Error al introducir datos");
			}
		}
		switch(respuesta) {
			case 1: {
				try {
					aniadir();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			break;
			case 2: {
				
			}
			break;
			case 3: {
				
			}
			break;
			case 4: {
				
			}
			break;
			case 5: {
				
			}
			break;
			case 6: {
				
			}
			break;
		}
		
		
	}

	private static int menu() throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("MENU");
		System.out.println("**************");
		System.out.println("1. Crear Fichero(Crea el fichero con los 15 grupos)");
		System.out.println("2. A�adir cursos");
		System.out.println("3. Consulta");
		System.out.println("4. Borrado de registros");
		System.out.println("5. Compactar fichero");
		System.out.println("6. Salir del Programa");
		int respuesta = sc.nextInt();
		sc.close();
		return respuesta;
	}

	
	private static void aniadir() throws IOException{
		Scanner sc = new Scanner(System.in);
		String nombre;
		int valor;
		
		for(int i = 0; i < 15; i++) {
			System.out.println("CURSO " + (i+1));
			archivo.writeInt(i+1);
			System.out.println("Introduce nombre del curso");
			System.out.println("Dejo este error porque no se que pasa");
			System.out.println("Por qu� no va el Scanner???");
			nombre = sc.next();
			archivo.writeUTF(nombre);
			System.out.println("Introduce valor del curso");
			valor = sc.nextInt();
			archivo.writeInt(valor);
		}
		sc.close();
	}
	
}
