package ficheros.datos.mediante.ficheros.binarios;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class LeerFicheroEnteros {
	public static void main(String[] args) {
		FileInputStream fi = null;// flujo básico binario
		DataInputStream entrada = null;//flujo de datos
		try {
			fi= new FileInputStream("C:\\Pruebas_Ficheros\\BinarioDatos\\numeros.dat");
			entrada = new DataInputStream(fi);
		}catch(IOException ioe) {
			System.out.println("ERROR AL ABRI EL ARCHIVO");
		}
		//ESCRIBIMOS LOS VALORES
		//COMO NO TENEMOS MARCA DE FIN DE FICHERO CREAMOS UN BUCLE INFINITO
		//QUE TERMINARA CUANDO SALTE EXCEPCION EOFException
		try {
			while(true) {
				System.out.println(entrada.readInt());
			}
		}catch(EOFException eof) {
			System.out.println("SE HA PROCESADO TODO EL ARCHIVO");
		}catch(IOException ioe) {
			System.out.println("ERROR EN LA LECTURA");
		}
	}
}
