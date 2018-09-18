/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS;
import java.util.Scanner;

/**
 *
 * @author diurno
 */
public class Ejercicio17 {

    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	double num;
	System.out.println("Introduce un numero para pasar a romano");
        num = sc.nextInt();
	while (num==5000) {
            System.out.println("|V|");
            num = num-5000;
	}
	while (num==4000) {
            System.out.println("M|V");
            num = num-4000;
	}
	while (num>=1000) {
            System.out.println("M");
            num = num-1000;
	}
	while (num>=900) {
            System.out.println("CM");
            num = num-900;
	}
	while (num>=800) {
            System.out.println("DCCC");
            num = num-800;
	}
	while (num>=700) {
            System.out.println("DCC");
            num = num-700;
	}
	while (num>=600) {
            System.out.println("DC");
            num = num-600;
	}
	while (num>=500) {
            System.out.println("D");
            num = num-500;
	}
	while (num>=400) {
            System.out.println("CD");
            num = num-400;
	}
	while (num>=300) {
            System.out.println("CCC");
            num = num-300;
	}
	while (num>=200) {
            System.out.println("CC");
            num = num-200;
	}
	while (num>=100) {
            System.out.println("C");
            num = num-100;
	}
	while (num>=90) {
            System.out.println("XC");
            num = num-90;
	}
	while (num>=80) {
            System.out.println("LXXX");
            num = num-80;
	}
	while (num>=70) {
            System.out.println("LXX");
            num = num-70;
	}
	while (num>=60) {
            System.out.println("LX");
            num = num-60;
	}
	while (num>=50) {
            System.out.println("L");
            num = num-50;
	}
	while (num>=40) {
            System.out.println("XL");
            num = num-40;
        }
	while (num>=10) {
            System.out.println("X");
            num = num-10;
	}
	while (num>=9) {
            System.out.println("IX");
            num = num-9;
	}
	while (num>=8) {
            System.out.println("VIII");
            num = num-8;
	}
	while (num>=7) {
            System.out.println("VII");
            num = num-7;
	}
	while (num>=6) {
            System.out.println("VI");
            num = num-6;
	}
	while (num>=5) {
            System.out.println("V");
            num = num-5;
	}
	while (num>=4) {
            System.out.println("IV");
            num = num-4;
        }
        while (num>=1) {
            System.out.println("I");
            num = num-1;
	}
    }
}

