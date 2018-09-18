/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIO_3_2;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author diurno
 */
@RunWith(Parameterized.class)
public class FraccionTest3Multiplicacion {
    
    private Fraccion frac1;
    private Fraccion frac2;
    private Fraccion frac3;

    public FraccionTest3Multiplicacion(int num1, int den1, int num2, int den2, int num3, int den3) {
        
        this.frac1 = new Fraccion(num1, den1);
        this.frac2 = new Fraccion(num2, den2);
        this.frac3 = new Fraccion(num3, den3);
        
    }
    
    @Parameters
    public static Collection<Object[]> numeros() {
        return Arrays.asList(new Object[][] {
            {5, 12, 2, 6, 10, 72},
            {2, 1, 3, 2, 6, 2}
        });
        
    }
 @Test
    public void testSuma() {
        System.out.println("multiplicar");
        Fraccion resultado = Fraccion.multiplicar(frac1, frac2);
        assertEquals(frac3.aString(), resultado.aString());
    }
}
