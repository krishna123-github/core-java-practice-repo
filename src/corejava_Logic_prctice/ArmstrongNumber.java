package corejava_Logic_prctice;

import java.util.Scanner;

/**
 * An Armstrong number is a positive m-digit number that is equal to the sum of
 * the mth powers of their digits. 153: 13 + 53 + 33 = 1 + 125+ 27 = 153
 *
 * 125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
 *
 * 1634: 14 + 64 + 34 + 44 = 1 + 1296 + 81 + 256 = 1643
 * Math.pow(last, digits) is used to calculated power 
 * @author krishna
 */
public class ArmstrongNumber {

    public static void main(String[] args) {
        int number, remender, amst = 0, temp;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter any three digit Number = ");
        number = kb.nextInt();
        temp = number;
        
        int digits = (number +"").length();

        while (number > 0) {
            remender = number % 10;
//            amst = amst + (remender * remender * remender);
            amst = (int) (amst + Math.pow(remender, digits));
            number = number / 10;
        }

        if (amst == temp) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrng Number");
        }
    }

}
