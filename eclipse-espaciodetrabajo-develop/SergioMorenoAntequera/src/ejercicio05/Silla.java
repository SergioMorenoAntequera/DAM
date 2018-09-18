package ejercicio05;

import java.io.*;

public class Silla extends Mueble implements Numerable {
	
	private static final long serialVersionUID = 1L;

	//Apartado 1
	public Silla(String nombre) {
		super(nombre);
	}
	//Apartado 2
	public Silla(String nombre, int numero) {
		super(nombre);
		super.numero = numero;
	}

	
	@Override
	public int establecerNumero(int numero) {
		return 0;
	}
	@Override
	public int devolverNumero() {
		return 0;
	}
	@Override
	public void incrementarNumero() {
		
	}

	public static void main(String[] args) {
		
		Silla silla1 = new Silla("Silla1");
		Silla silla2 = new Silla("Silla2", 2);
		
		try {
			
		    FileOutputStream archivo = new FileOutputStream("ficheros.ser");
		    ObjectOutputStream objetos = new ObjectOutputStream(archivo);
		    
		    objetos.writeObject(silla1);
		    objetos.writeObject(silla2);
		    
		    objetos.close();
		  }catch(FileNotFoundException e){
			  System.out.println("Error");
		  }catch(IOException e){
			  System.out.println("Error");
		  }
	}
}
