package ejercicio01;

public class Problema2 {

	public static void main(String[] args) {
		procesaNumeros("14");
	}
	
	public static void procesaNumeros(String maximo) {
			int maximo2 = Integer.parseInt(maximo);
			int mitad = maximo2/2;
			
			for(int i = 1; i<=mitad ; i++) {
				if(i % 7 == 0) {
					System.out.println(mitad*2);
				} else {
					System.out.println(mitad);
				}
			}
	}

}
