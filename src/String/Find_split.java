
package String;

public class Find_split {

    void check() {
        String s1 = "abc;xyz;hello;test";
        System.out.println("s1: "+s1.hashCode());
        String[] s2 = s1.split(";");
        System.out.println("s2: "+s2.hashCode());
    
        for(String s : s2){
            System.out.println(s+"  "+s.hashCode());
        }
    }
    
}

class test4{
    public static void main(String[] args) {
        Find_split f = new Find_split();
        f.check();
    }
}