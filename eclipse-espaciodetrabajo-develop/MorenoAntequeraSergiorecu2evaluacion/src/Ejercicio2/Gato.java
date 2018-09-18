package Ejercicio2;
import java.util.Scanner;

public class Gato extends Animal implements Mascota{
	Scanner sc = new Scanner(System.in);
	
	public String nombre;
	public String comida;

	
	public Gato(String nombre) {
		super(4);
		this.comida = null;
		this.nombre = nombre;
	}
	
	public String Caminar() {
		return "Este animal se desplaza usando " + super.numeroDePatas + " numero de patas";
	}
	
	public void Comer() {
		System.out.println("Que come el gato?");
		this.comida = sc.next();
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void jugar() {
		
	}
	
	
}
