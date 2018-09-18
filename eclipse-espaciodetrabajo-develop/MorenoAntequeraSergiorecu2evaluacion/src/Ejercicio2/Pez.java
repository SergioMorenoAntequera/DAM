package Ejercicio2;

public class Pez extends Animal implements Mascota{
	
	public String nombre;
	public String comida;

	
	public Pez(String nombre) {
		super(0);
		this.comida = "Comida de pez";
		this.nombre = nombre;
	}
	
	public String Caminar() {
		return "Este animal se desplaza usando " + super.numeroDePatas + " numero de patas";
	}
	
	public void Comer() {
		
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
