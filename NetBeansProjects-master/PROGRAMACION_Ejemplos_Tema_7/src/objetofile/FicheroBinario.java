package objetofile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FicheroBinario {
 
    public static void main(String[] args) {
 
        try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("/home/diurno/Documentos/Ficheros_Program/fichero", true))){
            //Escribimos un numero
            dos.writeInt(23);
 
            //Escribimos una cadena
            dos.writeUTF("Fernando");
 
            //Escribimos un numero
            dos.writeInt(1990);
 
        }catch(IOException e){
            System.out.println("Error E/S");
        }
        try(DataInputStream dis=new DataInputStream(new FileInputStream("/home/diurno/Documentos/Ficheros_Program/fichero"));){
        	 
            //Escribimos un numero
            System.out.println(dis.readInt());
 
            //Escribimos una cadena
            
            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());
 
        }catch(IOException e){
            System.out.println("Error E/S 2");
        }
    }
}