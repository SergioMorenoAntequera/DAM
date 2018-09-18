/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIO2;

/**
 *
 * @author diurno
 */
public class main {
    
    public static void main (String [ ] args) {
        //Aquí las instrucciones del método
        //TODOS LOS MÉTODOS SON ESTÁTICOS
        //EL VALOR DE UNA MATRIZ AL TERMINAR UNA 
        //OPERACION NO "SE ARRASTRA" A LA SIGUIENTE
        
        //Creamos las matrices de cualquier tamaño - El valor se da por teclado
        int[][] m1 = Metodos.Crear(2, 2);   //En este caso de 2x2
        int[][] m2 = Metodos.Crear(2, 2);
        
        //Las mostramos
        Metodos.Imprimir(m1);
        Metodos.Imprimir(m2);
        
        //Numero máximo y minimo de m1 - Devuelve un int
        System.out.println(Metodos.ValorMaximo(m1));
        System.out.println(Metodos.ValorMaximo(m1));
        
        //Sumamos y restamos ambas matrices
        Metodos.Imprimir(Metodos.Suma(m1, m2));
        Metodos.Imprimir(Metodos.Resta(m1, m2));
        
        //Multiplicamos m1 x 4
        Metodos.Imprimir(Metodos.MatrizPorEscalar(m1, 4));
        
        //Multiplicamos m1 x m2
        Metodos.Imprimir(Metodos.MatrizPorMatriz(m1, m2));
        
        //Hacemos la Transpuesta de m1
        Metodos.Imprimir(Metodos.Transpuesta(m1));
    }
    
    
}
