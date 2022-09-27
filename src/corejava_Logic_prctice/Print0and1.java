

package corejava_Logic_prctice;
 
import java.util.Scanner;

public class Print0and1 {
 
    public static void main(String[] args) {
        int number ;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Your Choice 0 or 1 = ");
        number = kb.nextInt();
    
        System.out.println("print = "+  (1-number));
    }
    
}
