/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIO_3_2_2;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


/**
 *
 * @author diurno
 */
public class TablaEnterosTest {
    
    private Integer[] arr;
    
    public TablaEnterosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        Integer[] arr = new Integer[3];
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
     * Test of sumaTabla method, of class TablaEnteros.
     */
    @Test
    public void testSumaTabla() {
        System.out.println("sumaTabla");
        
        for(int i = 0; i<arr.length; i++){
            arr[i] = i;
        }
        
        TablaEnteros instance = new TablaEnteros(arr);
        int expResult = 3;
        int result = instance.sumaTabla();
        assertEquals(expResult, result);
    }

    /**
     * Test of mayorTabla method, of class TablaEnteros.
     */
    @Test
    public void testMayorTabla() {
        System.out.println("mayorTabla");
        
        for(int i = 0; i<arr.length; i++){
            arr[i] = i;
        }
        
        TablaEnteros instance = new TablaEnteros(arr);
        int expResult = 2;
        int result = instance.mayorTabla();
        assertEquals(expResult, result);
    }

    /**
     * Test of posicionTabla method, of class TablaEnteros.
     */
    @Test
    public void testPosicionTabla(int n) {
        System.out.println("posicionTabla");
        for(int i = 0; i<arr.length; i++){
            arr[i] = i;
        }
        n = 2;
        TablaEnteros instance = new TablaEnteros(arr);
        int expResult = 1;
        int result = instance.posicionTabla(n);
        assertEquals(expResult, result);
    }
    
}
