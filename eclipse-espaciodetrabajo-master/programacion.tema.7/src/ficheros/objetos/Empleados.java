package ficheros.objetos;
import java.io.Serializable;

public class Empleados implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String direccion;
	private String nif;
	private char categoria;
	
	//CONSTRUCTORES
	public Empleados() {
		
	}
	
	public Empleados(String nombre, String direccion, String nif, char categoria) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.nif = nif;
		this.categoria = categoria;
	}

	
	//GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public char getCategoria() {
		return categoria;
	}

	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	//TO STRING
	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", direccion=" + direccion + ", nif=" + nif + ", categoria=" + categoria
				+ "]";
	}
	
	
	
	
}
