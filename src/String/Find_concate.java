
package String;

public class Find_concate {

    void check() {
//        String s = "";         // both type will work here
        String s = new String();
         System.out.println("s: "+s.hashCode()+" --> "+s);  // 0
        String s1 = s.concat("krishna");
        s = s1.concat("pooja");
        
        System.out.println("s: "+s.hashCode()+"  "+s);  // krshnapooja
        System.out.println("s1: "+s.hashCode()+"  "+s1);
        System.out.println("s2: "+s);
        
    }
}

class Test7{
    public static void main(String[] args) {
        Find_concate f = new Find_concate();
        f.check();
    }
}