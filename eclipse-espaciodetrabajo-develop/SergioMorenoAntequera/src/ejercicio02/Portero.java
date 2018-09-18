package ejercicio02;

public class Portero extends Jugador{
	
	private int golesRecibidos;
	private int penaltisParados;
	
	public Portero() {
		super();
		this.golesRecibidos = 0;
		this.penaltisParados = 0;
	}
	
	public Portero(String nombre, String demarcacion, int partidosJugados, int golesMarcados, int tarjetasAmarillas, int tarjetasRojas,  int golesRecibidos, int penaltisParados) {
		super(nombre, demarcacion, partidosJugados, golesMarcados, tarjetasAmarillas, tarjetasRojas);
		this.golesRecibidos = golesRecibidos;
		this.penaltisParados = penaltisParados;
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Goles recibidos: " + this.golesRecibidos);
		System.out.println("Penaltis Parados: " + this.penaltisParados);
	}
	
}
