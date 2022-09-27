package corejava_Logic_prctice;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int number, remender, amst = 0, temp;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter any three digit Number = ");
        number = kb.nextInt();
        temp = number;

        while (number > 0) {
            remender = number % 10;
            amst = amst + (remender * remender * remender);
            number = number / 10;
        }

        if (amst == temp) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrng Number");
        }
    }

}
