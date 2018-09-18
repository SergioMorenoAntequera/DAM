package ejercicio05;

public class Revistas extends Libros{

	private static final long serialVersionUID = 1L;
	private int numeorsPorAnyo;
	private long circulacion;
	
	//Constructores
	public Revistas() {
		super();
		this.numeorsPorAnyo = 0;
		this.circulacion = 0;
	}

	public Revistas(int numeorsPorAnyo, long circulacion) {
		super();
		this.numeorsPorAnyo = numeorsPorAnyo;
		this.circulacion = circulacion;
	}

	
	//Getter y setter
	public int getNumeorsPorAnyo() {
		return numeorsPorAnyo;
	}

	public void setNumeorsPorAnyo(int numeorsPorAnyo) {
		this.numeorsPorAnyo = numeorsPorAnyo;
	}

	public long getCirculacion() {
		return circulacion;
	}

	public void setCirculacion(long circulacion) {
		this.circulacion = circulacion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	//To string
	 @Override
	public String toString() {
		 String msg = super.toString() + " " + this.numeorsPorAnyo + " " + this.circulacion;
		 return msg;
	}
	
	
	
}
