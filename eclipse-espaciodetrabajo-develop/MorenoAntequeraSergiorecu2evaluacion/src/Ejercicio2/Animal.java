package Ejercicio2;

public abstract class Animal {
	
	public int numeroDePatas;
	
	public Animal(int numeroDePatas) {
		this.numeroDePatas = numeroDePatas; 
	}
	
	abstract String Caminar();
	
	abstract public void Comer();
	
}
