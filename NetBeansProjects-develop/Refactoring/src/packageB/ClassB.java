package packageB;

import java.util.LinkedList;
import java.util.List;

public class ClassB {
    List l = new LinkedList();
    
    String s = MI_TEXTO;
    private static final String MI_TEXTO = "text";
    
    public void method() {
        String local = MI_TEXTO;
    }
    
    public static int statMethod() {
        int c = 3;
        System.out.println(c);
        return 3;
        
    }
}
