package ejercicio05;
import java.io.Serializable;
import java.util.GregorianCalendar;

public class Publicaciones implements Serializable{

	private static final long serialVersionUID = 1L;
	private String titulo;
	private String editor;
	private GregorianCalendar fecha;
	
	//CONSTRUCTORES
	public Publicaciones() {
		super();
		this.titulo = null;
		this.editor = null;
		this.fecha = null;
	}
	
	public Publicaciones(String titulo, String editor, GregorianCalendar fecha) {
		super();
		this.titulo = titulo;
		this.editor = editor;
		this.fecha = fecha;
	}
	
	//GETTER AND SETTER
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}	

	//To String
	@Override
	public String toString() {
		String msg = this.titulo + " " + this.editor + " " + fecha.toString();
		return msg;
	}
}
