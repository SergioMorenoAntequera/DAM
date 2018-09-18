package packageB;

import java.util.LinkedList;
import java.util.List;

public class ClassA {

    public void method() {
        int x = nuevo_campo;
        int y = nuevo_campo + 3;
        System.out.println(nuevo_campo);
    }
    private final int nuevo_campo = 3 + 3;

    public void method2() {
        int x = nuevo_campo;
    }

    String constExpr = "CONST";

    public static void method3() {
        String s = "Text";
    }
    
    String konst = "a";
}
