 
package corejava_Logic_prctice;

import java.util.Scanner;

public class PerfactNumber {

    public static void main(String[] args) {
        System.out.println("Enter any Number = ");
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int temp= 0 ;
        for(int i = 1; i<= n/2; i++){
            if(n%i == 0){
                temp += i;
            }
        }
        if(temp == n){
            System.out.println("Number is a perfect number");
        }
        else{
            System.out.println("not a perfect  number ");
        }
        
    }
    
}
