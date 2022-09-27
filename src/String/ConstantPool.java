
package String;

public class ConstantPool {

    void check() {
        String s1 = "krishna";
        String s2 = "krishna";
        String s3 = "pooja";
        
        System.out.println(s1 == s2);       //o/p = true
        System.out.println(s1.equals(s2));  //o/p = true
        System.out.println(s1.equals(s3));  //o/p = false
    }
    
}

class test{
    public static void main(String[] args) {
        ConstantPool cp = new ConstantPool();
        cp.check();
    }
}