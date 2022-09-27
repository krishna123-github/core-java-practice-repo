package corejava_Logic_prctice;

import java.util.Scanner;

public class SumOfDigit {

    public static void main(String[] args) {
        int number, remender, sum = 0;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter any Number = ");
        number = kb.nextInt();

        while (number > 0) {
            remender = number % 10;
            sum = sum + remender;
            number = number / 10;
        }
        System.out.println("Sum = " + sum);
    }

}
