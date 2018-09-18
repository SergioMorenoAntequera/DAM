package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Animal> lista = new ArrayList<Animal>();
		int respuesta = 0;
		boolean terminado = false;
		do {
		System.out.println("MENU");
		System.out.println("1. Agregar animal");
		System.out.println("2. Borrar animal");
		System.out.println("3. Modificar animal");
		System.out.println("4. Mostrar tipo animal");
		System.out.println("5. Salir");
		
		try {
			respuesta = sc.nextInt();
			if(respuesta > 5 || respuesta < 1) {
				terminado = true;
				throw new Exception();
			}
		} catch (Exception e){
			System.out.println("Error al introducir los datos");
		}
		
		switch (respuesta) {
			case 1:{
				try {
					lista.add(agregarAnimal());
				} catch (Exception e) {
					System.out.println("Error al introducir los datos");
				}
			}
			break;
			case 2:{
				try {
					borrarAnimal(lista);
				} catch (Exception e) {
					System.out.println("Error al introducir los datos");
				}
			}
			case 3:{
				try {
					modificarAnimal(lista);
				} catch (Exception e) {
					System.out.println("Error al introducir los datos");
				}
			}
		}
		
		
		} while (respuesta != 5 && !terminado);
	}
	
	//**************************METODOS**********************************
	public static Animal agregarAnimal() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Que tipo de animal quieres añadir?");
		System.out.println("1. Araña");
		System.out.println("2. Gato");
		System.out.println("3. Pez");
		int respuesta = 0;
		respuesta = sc.nextInt();
		if(respuesta > 3 && respuesta < 1) {
			throw new Exception();
		}
		if(respuesta == 1) {
			return new Araña();
		}
		if(respuesta == 2) {
			System.out.println("Elige un nombre");
			String nombre = sc.next();
			return new Gato(nombre);
		}
		if(respuesta == 3) {
			System.out.println("Elige un nombre");
			String nombre = sc.next();
			return new Pez(nombre);
		}
		return null;
	}
	
	public static ArrayList<Animal> borrarAnimal(ArrayList<Animal> lista) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica el indice del animal a borrar");
		int i = sc.nextInt();
		lista.remove(i);
		return lista;
	}
	
	public static ArrayList<Animal> modificarAnimal(ArrayList<Animal> lista) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica el indice del animal a modificar");
		//int i = sc.nextInt();
		System.out.println(lista.get(0).getClass());
		
		return null;
	}
	
	
}

