package ficheros.datos.mediante.ficheros.binarios;
//FicheroEnteros.java
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FicheroEnteros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DataOutputStream salida = null;
		FileOutputStream fw = null; //flujo básico binarioDataOutputStream salida = null;//flujo de datos
		int n;
		try{
			fw = new
			FileOutputStream("C:\\Pruebas_Ficheros\\BinarioDatos\\numeros.dat");
			salida = new DataOutputStream(fw);
			System.out.print("Introduce número entero positivos,cualquier otro para fin.");
			n = sc.nextInt();
			while (n>0) {
				salida.writeInt(n); //se escribe el número entero en el fichero
				System.out.print("Introduce número entero positivos,cualquier otro para fin. ");
				n = sc.nextInt();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} /*finally {
			try {
				if (fw != null) {
					fw.close();
				}
				if (salida != null) {
					salida.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}*/
		sc.close();
	}
}
