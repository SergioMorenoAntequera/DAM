package ficheros.binarios;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;


public class CreacionEnteros {
	
	public static void main(String[] args) throws IOException {

		String ruta = "/home/diurno/Documentos/Ficheros_Programacion";
		File original = new File(ruta +"/50PrimerosEnteros");
		try {
			FileOutputStream destino = new FileOutputStream(original);
			PrintWriter pw = new PrintWriter(destino);
			for(int i = 0; i<51; i++){
				pw.write(i);
			}
			pw.close();
			System.out.println("Fichero creado con exito");
		} catch (FileNotFoundException e) {
			System.out.println("Ha ocurrido un error");
		}
	}
}
