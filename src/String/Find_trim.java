
package String;


public class Find_trim {

    void check() {
        String s = "     abc__123  he llo     ";
        System.out.println("before length: "+s.length());
        
        String s1 = s.trim();     // String ke aage ka or String ke Peeche ka jitna bhi white space h ... trim kr dega.. String ke middlle ka nhi karwega 
        System.out.println("after length: "+s1.length());
    }
    
}
class Test6{
    public static void main(String[] args) {
        Find_trim f = new Find_trim();
        f.check();
    }
}