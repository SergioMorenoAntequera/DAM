package ejercicio05;

public class Libros extends Publicaciones {

	private static final long serialVersionUID = 1L;
	private String isbn;
	private String autor;
	
	//Constructores
	public Libros() {
		super();
		this.isbn = null;
		this.autor = null;
	}
	public Libros(String isbn, String autor) {
		super();
		this.isbn = isbn;
		this.autor = autor;
	}
	
	//GEtter and setter
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	//To string
	@Override
	public String toString() {
		String msg  = super.toString() + " " + isbn + " " + autor;
		return msg;
	}
	
	
	
}
