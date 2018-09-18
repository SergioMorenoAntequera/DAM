package ejercicio07;
import java.io.*;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Crear los objetos
		try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("clientes.sec"))) {
			
			salida.writeObject(new Clientes(12345, "Pedro", 'h', 658956326, "C/ Lopan", 47));
			salida.writeObject(new Clientes(54678, "Maria", 'm', 458123548, "C/ Alabama", 0));
			salida.writeObject(new Clientes(23469, "Lucia", 'm', 456985215, "C/ Cruz", 10));
			
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error");
			e.printStackTrace();
		}
		
		int opcion = 0;
		while(opcion != 6) {
			System.out.println("MENU");
			System.out.println("1.- Listar Clientes");
			System.out.println("2.- Buscar Clientes");
			System.out.println("3.- Borrar Cliente");
			System.out.println("4.- Borrar fichero de clientes al completo");
			System.out.println("5.- Tratamiento de datos");
			System.out.println("6.- Salir de la aplicación");
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:{
				try(ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("clientes.sec"))) {
					
	

				} catch (IOException e) {
					System.out.println("Ha ocurrido un error");
				} 
			}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			default:
					System.out.println("Opcion no valida");
				break;
				
			}
		}
		
		sc.close();
	}

}
