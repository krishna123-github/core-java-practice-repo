package String;

import java.util.Scanner;

public class ReverseStringUsingAPI {

    String choose;

    void reverse() {
        do {
            
            String rev = "";
            Scanner kb = new Scanner(System.in);
            System.out.print("Eneter any String: ");
            String str = kb.next();
             
            //
            for (int i = str.length() - 1; i >= 0; i--) {
                rev += str.charAt(i);                     // concate the String to another String 
            }
            System.out.println("Reverse String:  " + rev);     //
            System.out.println("-----------------");


            
            StringBuilder sb = new StringBuilder(str);
            sb.reverse(); 
            System.out.println("StringBuilder Reverse: "+sb);

            System.out.print("Do you want to contineue: ");
            choose = kb.next();
            
        } while (choose.equals("y") || choose.equals("Y"));
    }

}

class TestReverse {

    public static void main(String[] args) {
        ReverseStringUsingAPI aPI = new ReverseStringUsingAPI();
        aPI.reverse();
    }
}
