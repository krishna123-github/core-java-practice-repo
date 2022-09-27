
package String;


public class Find_indexOf {

    void check() {
        String s1 = "krrish212@gmail.com";
        int i = s1.indexOf('s');
        System.out.println("Index: "+i);
        int i2 = s1.indexOf("gmail");
        System.out.println("index: "+i2);

        System.out.println(s1.indexOf("gmail", 9));
    }
    
}
 class test2{
     public static void main(String[] args) {
         Find_indexOf fo = new Find_indexOf();
         fo.check();
     }
 }