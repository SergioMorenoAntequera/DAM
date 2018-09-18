package ejercicio03;

public class Primitiva {

	private final int maxValor = 49, minValor = 1;  
	 @SuppressWarnings("unused")
	private String dia; 												//día del sorteo (jueves o sábado)   
	 private double recaudacion; 								// recaudacion de la jornada  
	 @SuppressWarnings("unused")
	private int [] numeros = new int [7]; 					//números premiados 
	 @SuppressWarnings("unused")
	private int [] acertantes = new int [5]; 				// acertantes de cada 
	 								//una de las categorías 3,4,5,5+complementario y 6 aciertos. 
	 
	 //Pongo @SuppressWarnings("unused") porque me pone nervioso el aviso
	 
	 //Apartado C
	 public Primitiva(String dia, double recaudaciones, int[] numeros, int[] acertantes) {
		 	this.dia = dia;
		 	ponerResultado(recaudacion, numeros, acertantes);
	 }
	 
	 //Apartado A
	 public boolean comprubaNumeros(int[] numeros) {

		if(numeros.length == 7) {
			for(int i = 0; i<numeros.length; i++) {
				if( i < this.maxValor && i > this.minValor) {
					//Numero valido
				} else {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}
	 
	 //Apartado B
	 public void ponerResultado(double recaudacion, int[] numeros, int[] acertantes) {
		 if(!comprubaNumeros(numeros)) {
			 System.out.println("Numeros no válidos");
		 } else {
			 this.numeros = numeros;
		 }
		 this.recaudacion = recaudacion;
		 this.acertantes = acertantes;
		 
	 }
	 
	 public static void main(String[] args) {
			
	}

}
