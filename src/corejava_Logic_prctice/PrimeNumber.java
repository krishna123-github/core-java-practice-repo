package corejava_Logic_prctice;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int number, i;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter A number = ");
        number = kb.nextInt();
        
        //main logic of prime .. the number is divided by 1 or itself only...not divided by any other number..
        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Number is not prime");
                break;
            }
        }
        if (number == i) {
            System.out.println("Prime");
        }else if(number == 1){
            System.out.println(" prime = "+number);
        }
      
    }
}
