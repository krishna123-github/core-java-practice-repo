
package String;

public class Find_subString {

    void check() {
        String s = "sbc123hello";
        
        String s1 = s.substring(3);   //only with begin string index 
        System.out.println(s1);
        
        String s2 = s.substring(3, 7);  // index of begin and index of end 
        System.out.println(s2);
    }
    
}

class Test5{
    public static void main(String[] args) {
        Find_subString  fs = new Find_subString();
        fs.check();
    }
}
