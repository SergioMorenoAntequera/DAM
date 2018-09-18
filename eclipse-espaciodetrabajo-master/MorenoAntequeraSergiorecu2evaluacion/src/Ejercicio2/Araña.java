package Ejercicio2;

public class Araña extends Animal{
	
	public String comida;
	
	public Araña() {
		super(8);
		this.comida = "Insectos";
	}
	
	public String Caminar() {
		return "Este animal se desplaza usando " + super.numeroDePatas + " numero de patas";
	}
	
	public void Comer() {
		
	}

	
}
