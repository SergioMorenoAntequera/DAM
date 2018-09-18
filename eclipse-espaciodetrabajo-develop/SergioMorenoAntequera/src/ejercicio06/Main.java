package ejercicio06;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Producto> lista = new ArrayList<Producto>();
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		while(opcion != 7) {
			System.out.println("MENU");
			System.out.println("1.- Añadir nuevo producto");
			System.out.println("2.- Buscar Producto");
			System.out.println("3.- Eliminar producto");
			System.out.println("4.- Ver lista de productos");
			System.out.println("5.- Devolver numero de productos");
			System.out.println("6.- Ordenar producto");
			System.out.println("7.- Salir.");
			
			try {
				opcion = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Opcion no valida");
				opcion = 7;
			}
			switch(opcion) {
			case 1:{
				try {
					añadirProducto(lista, sc);
				} catch (Exception e) {
					System.out.println("Error al introducir los datos");
					opcion = 7;
				}
			}
				break;
			case 2:{
				try{
					buscarProducto(lista, sc);
				} catch (Exception e) {
					System.out.println("Error al buscar el producto");
					opcion = 7;
				}
			}
				break;
			case 3:{
				try {
					borrarProducto(lista, sc);
				} catch (Exception e) {
					System.out.println("Error al borrar el producto");
					opcion = 7;
				}
				
			}
				break;
			case 4:{
				try {
					listarProductos(lista);
				} catch (Exception e) {
					System.out.println("Error al listar productos");	
					opcion = 7;
				}
			}
				break;
			case 5:{
				try {
					numeroDeProductos(lista);
				} catch (Exception e) {
					System.out.println("Error al ver el tamaño");
					opcion = 7;
				}
			}
				break;
			case 6:{
				try {
					ordenarPrecio(lista);
				} catch (Exception e) {
					System.out.println("Ha habido un error");
				}
			}
				break;
			case 7:{
				System.out.println("Fin del programa");
			}
				break;
			default:
				System.out.println("Opción no valida");
				break;
			}
			
		}
	}

	private static void ordenarPrecio(ArrayList<Producto> lista) {
		for(int i = 0; i < (lista.size()-1); i++){
		    for(int j=i+1; j < lista.size(); j++){
		        if(lista.get(i).getPrecio() > (lista.get(j).getPrecio())){
		            
		        	Producto cambiador = lista.get(i);
		        	lista.set(i, lista.get(j));
		        	lista.set(j, cambiador);
		        	
		        }
		    } 
		}
	}
	private static void numeroDeProductos(ArrayList<Producto> lista) {
		System.out.println("Numero de productos: " + lista.size());
	}
	private static void listarProductos(ArrayList<Producto> lista) {
		System.out.println("Lista de productos: ");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("Indice: " + i + "\n"+ lista.get(i).toString());
		}
	}
	private static void borrarProducto(ArrayList<Producto> lista, Scanner sc) {
		System.out.println("Introduce la posicion del producto a borrar");
		int posicion = sc.nextInt();
		lista.remove(posicion);
	}
	private static void buscarProducto(ArrayList<Producto> lista, Scanner sc) {
		boolean encontrado = false;
		System.out.println("Introduce el nombre");
		String nombre = sc.next();
		for(int i = 0; i < lista.size(); i++) {
			//"No se por qué no entra en el if"
			if(lista.get(i).getNombre() == nombre && encontrado == false) {
				System.out.println("Producto encontrado en el indice: " + i);
				encontrado = true;
			} else {
				System.out.println("Producto no encontrado");
			}
		}
	}
	private static void añadirProducto(ArrayList<Producto> lista, Scanner sc) {
		System.out.println("Introduce nombre: ");
		String nombre = sc.next();
		System.out.println("Introduce precio: ");
		double precio = sc.nextDouble();
		Producto nuevo = new Producto(nombre, precio);
		lista.add(nuevo);
	}
	
}
