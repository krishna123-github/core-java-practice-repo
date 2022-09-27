 
package corejava_Logic_prctice;

import java.util.Scanner;

public class DifferenceMaxMinNumberArray {
 
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i , max=0,min, difference;
        Scanner kb = new Scanner(System.in);
        for(i=0; i<10; i++){
            System.out.print("Enter number = ");
            arr[i] = kb.nextInt();
        }
        System.out.println();
        
        for(i=0 ; i<10; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("max number = "+max);
        
        min = max;
        for(i=0; i<10; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("min number = "+min);
        System.out.println("difference between them => "+(max-min));
    }
    
    
}
