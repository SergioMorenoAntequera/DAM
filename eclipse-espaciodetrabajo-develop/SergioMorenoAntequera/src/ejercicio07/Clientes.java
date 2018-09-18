package ejercicio07;

public class Clientes {
	
	private int nif;
	private String nombre;
	private char sexo;
	private int telefono;
	private String direccion;
	private int deuda;
	
	public Clientes(int nif, String nombre, char sexo, int telefono, String direccion, int deuda) {
		this.nif = nif;
		this.nombre = nombre;
		this.sexo = sexo;
		this.telefono = telefono;
		this.direccion = direccion;
		this.deuda = deuda;
	}

	public Clientes() {
		this.nif = 0;
		this.nombre = null;
		this.sexo = 0;
		this.telefono = 0;
		this.direccion = null;
		this.deuda = 0;
	}

	public String toString() {
		
		return ("NIF: " + this.nif + 
				"\nNombre: " + this.nombre +
				"\nSexo: " + this.sexo +
				"\nTelefono: " + this.telefono +
				"\nDireccion: " + this.direccion +
				"\nDeuda: " + this.deuda);
	}
	
	public int getNif() {
		return nif;
	}

	public void setNif(int nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getDeuda() {
		return deuda;
	}

	public void setDeuda(int deuda) {
		this.deuda = deuda;
	}

}
