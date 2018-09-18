/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIO_3_2;

import EJERCICIO_3_2.Fraccion;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;
import org.junit.runner.RunWith;

/**
 *
 * @author diurno
 */
public class FraccionTest {
    
    private static Fraccion frac1;
    private static Fraccion frac2;
    private static Fraccion frac3;
    
    
    
    /*Fraccion frac1 = new Fraccion();          // 0/1
    Fraccion frac2 = new Fraccion(5);           // 5/1
    Fraccion frac3 = new Fraccion(4, 2);        // 4/2*/
    
    public FraccionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        frac1 = new Fraccion();
        frac2 = new Fraccion(5);
        frac3 = new Fraccion(4, 2);
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of datos method, of class Fraccion. //NO SE PUEDE YA QUE PIDE DATOS POR TECLADO
     */
   

    /**
     * Test of sumar method, of class Fraccion.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        Fraccion expResult = new Fraccion(0, 1);
        Fraccion result = Fraccion.sumar(frac1, frac1);
        assertEquals(expResult.aString(), result.aString());
        
        System.out.println("sumar");
        Fraccion expResult2 = new Fraccion(5, 1);
        Fraccion result2 = Fraccion.sumar(frac1, frac2);
        assertEquals(expResult2.aString(), result2.aString());
        
        System.out.println("sumar");
        Fraccion expResult3 = new Fraccion(2);
        Fraccion result3 = Fraccion.sumar(frac1, frac3);
        assertEquals(expResult3.aString(), result3.aString());
        
        System.out.println("sumar");
        Fraccion expResult4 = new Fraccion(10, 1);
        Fraccion result4 = Fraccion.sumar(frac2, frac2);
        assertEquals(expResult4.aString(), result4.aString());
        
        System.out.println("sumar");
        Fraccion expResult5 = new Fraccion(7);
        Fraccion result5 = Fraccion.sumar(frac2, frac3);
        assertEquals(expResult5.aString(), result5.aString());
        
        System.out.println("sumar");
        Fraccion expResult6 = new Fraccion(4);
        Fraccion result6 = Fraccion.sumar(frac3, frac3);
        assertEquals(expResult6.aString(), result6.aString());
    }

    /**
     * Test of restar method, of class Fraccion.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        Fraccion expResult = new Fraccion();
        Fraccion result = Fraccion.restar(frac1, frac1);
        assertEquals(expResult.aString(), result.aString());
        
        System.out.println("restar");
        Fraccion expResult2 = new Fraccion(-5, 1);
        Fraccion result2 = Fraccion.restar(frac1, frac2);
        assertEquals(expResult2.aString(), result2.aString());
        
        System.out.println("restar");
        Fraccion expResult3 = new Fraccion(-2, 1);
        Fraccion result3 = Fraccion.restar(frac1, frac3);
        assertEquals(expResult3.aString(), result3.aString());
        
        System.out.println("restar");
        Fraccion expResult4 = new Fraccion(0, 1);
        Fraccion result4 = Fraccion.restar(frac2, frac2);
        assertEquals(expResult4.aString(), result4.aString());
        
        System.out.println("restar");
        Fraccion expResult5 = new Fraccion(3, 1);
        Fraccion result5 = Fraccion.restar(frac2, frac3);
        assertEquals(expResult5.aString(), result5.aString());
        
        System.out.println("restar");
        Fraccion expResult6 = new Fraccion(0);
        Fraccion result6 = Fraccion.restar(frac3, frac3);
        assertEquals(expResult6.aString(), result6.aString());
        
    }

    /**
     * Test of multiplicar method, of class Fraccion.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        Fraccion expResult = new Fraccion();
        Fraccion result = Fraccion.multiplicar(frac1, frac1);
        assertEquals(expResult.aString(), result.aString());
        
        System.out.println("multiplicar");
        Fraccion expResult2 = new Fraccion();
        Fraccion result2 = Fraccion.multiplicar(frac1, frac2);
        assertEquals(expResult2.aString(), result2.aString());
        
        System.out.println("multiplicar");
        Fraccion expResult3 = new Fraccion();
        Fraccion result3 = Fraccion.multiplicar(frac1, frac3);
        assertEquals(expResult3.aString(), result3.aString());
        
        System.out.println("multiplicar");
        Fraccion expResult4 = new Fraccion(25);
        Fraccion result4 = Fraccion.multiplicar(frac2, frac2);
        assertEquals(expResult4.aString(), result4.aString());
        
        System.out.println("multiplicar");
        Fraccion expResult5 = new Fraccion(10);
        Fraccion result5 = Fraccion.multiplicar(frac2, frac3);
        assertEquals(expResult5.aString(), result5.aString());
        
        System.out.println("multiplicar");
        Fraccion expResult6 = new Fraccion(4);
        Fraccion result6 = Fraccion.multiplicar(frac3, frac3);
        assertEquals(expResult6.aString(), result6.aString());
        
    }

    /**
     * Test of inversa method, of class Fraccion.
     */
    @Test
    public void testInversa() {
        System.out.println("inversa");
        Fraccion expResult = new Fraccion(1, 0);
        Fraccion result = Fraccion.inversa(frac1);
        assertEquals(expResult.aString(), result.aString());
        
        System.out.println("inversa");
        Fraccion expResult2 = new Fraccion(1, 5);
        Fraccion result2 = Fraccion.inversa(frac2);
        assertEquals(expResult2.aString(), result2.aString());
        
        System.out.println("inversa");
        Fraccion expResult3 = new Fraccion(1, 2);
        Fraccion result3 = Fraccion.inversa(frac3);
        assertEquals(expResult3.aString(), result3.aString());
        
    }

    /**
     * Test of dividir method, of class Fraccion.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        Fraccion expResult = new Fraccion(0, 0);
        Fraccion result = Fraccion.dividir(frac1, frac1);
        assertEquals(expResult.aString(), result.aString());
        
        System.out.println("dividir");
        Fraccion expResult2 = new Fraccion(0, 5);
        Fraccion result2 = Fraccion.dividir(frac1, frac2);
        assertEquals(expResult2.aString(), result2.aString());
        
        System.out.println("dividir");
        Fraccion expResult3 = new Fraccion(0, 2);
        Fraccion result3 = Fraccion.dividir(frac1, frac3);
        assertEquals(expResult3.aString(), result3.aString());
        
        System.out.println("dividir");
        Fraccion expResult4 = new Fraccion(5, 5);
        Fraccion result4 = Fraccion.dividir(frac2, frac2);
        assertEquals(expResult4.aString(), result4.aString());
        
        System.out.println("dividir");
        Fraccion expResult5 = new Fraccion(5, 2);
        Fraccion result5 = Fraccion.dividir(frac2, frac3);
        assertEquals(expResult5.aString(), result5.aString());
        
        System.out.println("dividir");
        Fraccion expResult6 = new Fraccion(2, 2);
        Fraccion result6 = Fraccion.dividir(frac3, frac3);
        assertEquals(expResult6.aString(), result6.aString());
        
    }

    /**
     * Test of potencia method, of class Fraccion. //NO SE PUEDE YA QUE PIDE DATOS POR TECLADO
     */

    /**
     * Test of aString method, of class Fraccion.
     */
    @Test
    public void testAString() {
        System.out.println("aString");          
        String expResult = " 0";               
        String result = frac1.aString();      //Usamos frac1(0/1)
        assertEquals(expResult, result);
        
        System.out.println("aString");          
        String expResult2 = " 5";               
        String result2 = frac2.aString();      //Usamos frac2(5/1)
        assertEquals(expResult2, result2);
        
        System.out.println("aString");          
        String expResult3 = "4/2";               
        String result3 = frac3.aString();      //Usamos frac3(4/2)
        assertEquals(expResult3, result3);
    }

    /**
     * Test of simplificar method, of class Fraccion.
     */
    @Test
    public void testSimplificar() {
        System.out.println("simplificar");
        Fraccion expResult = new Fraccion(0, 1);
        Fraccion result = frac1.simplificar();
        assertEquals(expResult.aString(), result.aString());

        System.out.println("simplificar");
        Fraccion expResult2 = new Fraccion(5, 1);
        Fraccion result2 = frac2.simplificar();
        assertEquals(expResult2.aString(), result2.aString());
        
        System.out.println("simplificar");
        Fraccion expResult3 = new Fraccion(2, 1);
        Fraccion result3 = frac3.simplificar();
        assertEquals(expResult3.aString(), result3.aString());
        
    }
    
    /*
    //Como la unica exceopcion que puede habes es que surja una division
    //entre cero lo que se hace es coger el metodo simplificar
    //en el cual hay una division por el denominador y aquí
    //se captura el error 
    @Test(expected = java.lang.ArithmeticException.class)
    public void testExcepciones(){
        System.out.println("Cambiar excepcion");
        Fraccion frac = new Fraccion(0, 0);
        try {
            frac.simplificar();
        } catch (Exception e){
            System.out.println("ERROR: Division entre cero");
        }
    }*/

    
    
}
