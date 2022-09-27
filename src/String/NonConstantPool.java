
package String;

public class NonConstantPool {

    void check() {
        String s1 = new String("krishna");
        String s2 = new String("krishna");
        
        System.out.println(s1 == s2);     // o/p false
        System.out.println(s1.equals(s2));// o/p true
    }
    
}

class Test1{
    public static void main(String[] args) {
        NonConstantPool  pool = new NonConstantPool();
        pool.check();
    }
}