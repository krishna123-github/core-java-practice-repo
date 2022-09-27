

package corejava_Logic_prctice;
 
import java.util.Scanner;

public class ReverseString {
 
    public static void main(String[] args) {
        String str ;
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Any String = ");
        str = sb.next();
        StringBuilder strb = new StringBuilder(str);
        System.out.println(strb.reverse());
        
    }
    
}
