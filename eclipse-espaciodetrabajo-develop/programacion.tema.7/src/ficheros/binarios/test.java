package ficheros.binarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		File archivo = new File("C:\\Users\\seran\\OneDrive\\Documentos\\Holi");
		System.out.println(archivo.exists());
		try {
			System.out.println(archivo.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream ruta2 = new FileInputStream(archivo);
			FileOutputStream ruta1 = new FileOutputStream(archivo);
			DataOutputStream rutaa = new DataOutputStream(ruta1);
			DataInputStream rutaa2 = new DataInputStream(ruta2);
			
			for(int i = 0; i<=5; i++) {
				rutaa.writeInt(23);
			}
			for(int i = 0; i<=5; i++) {
				System.out.println(rutaa2.readInt());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
