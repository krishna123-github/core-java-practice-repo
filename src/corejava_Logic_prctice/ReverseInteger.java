

package corejava_Logic_prctice;
 
import java.util.Scanner;

public class ReverseInteger {
 
    public static void main(String[] args) {
        int number , reverse=0, r , a ;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number => ");
        number = kb.nextInt();
        System.out.println();
        
        while(number > 0){
            r = number % 10; 
            reverse = reverse * 10 + r;
            number = number / 10;
        }
        System.out.println("Reverse = "+reverse);
    }
    
}
