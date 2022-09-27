
package String;

public class Find_startWith {

    void check() {
        String s1= "abc123hello";
        System.out.println(s1.startsWith("abc"));
        System.out.println(s1.startsWith("ABC"));
        System.out.println(s1.startsWith("hello"));
        System.out.println(s1.startsWith("123"));
    }
    
}

class Test3{
     public static void main(String[] args) {
        Find_startWith fw = new Find_startWith();
        fw.check();
    }
}