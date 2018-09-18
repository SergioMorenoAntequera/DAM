/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03;
import java.util.Scanner;

/**
 *
 * @author diurno
 */
public class Ejercicio03 {
    
    public static void main(String[] args){
        
        try{
            Ejercicio03.fecha();
        } catch (DiaValidoException d){
            System.out.println("Día no válido");
        } catch (MesValidoException m){
            System.out.println("Mes no válido");
        } catch (AnioValidoException a){
            System.out.println("Año no válido");
        } catch (Exception e){
            System.out.println("Fecha no valida");
        }
    }
    
    public static void fecha() throws DiaValidoException, MesValidoException, AnioValidoException, Exception{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una fecha (DDMMAAAA)");
        String fecha = sc.next();
        if(fecha.length()>8){
            throw new Exception();
        }
        //Comprabar Dia
        int dia = Integer.parseInt(fecha.substring(0, 2));
        if(dia<0 || dia>31){
            throw new DiaValidoException();
        }
        //Comprobar Mes
        int mes = Integer.parseInt(fecha.substring(2, 4));
        if(mes<0 || mes>12){
            throw new MesValidoException();
        }
        //Comprobar año
        int anio = Integer.parseInt(fecha.substring(4, 8));
        if(anio<0 || anio>9999){
            throw new AnioValidoException();
        }
        
        //Dias de cada mes        |||                                   Bisiestos
        if((mes==2 && dia > 28) || (mes == 2 && ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) && dia > 29)){
            throw new DiaValidoException();
        }
        if (mes==4 || mes==6 || mes==9 || mes==11 && dia >30){
            throw new DiaValidoException();
        }
    }
}
