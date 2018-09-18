package ejercicio05;
import java.io.*; 

@SuppressWarnings("unused")
public abstract class Mueble implements Serializable {  
	
	private static final long serialVersionUID = 1L;
	public String nombre;  
	public int numero; 

	public Mueble(String nombre){   
		this.nombre = nombre;   
 		this.numero = 0;  
 	}
 } 