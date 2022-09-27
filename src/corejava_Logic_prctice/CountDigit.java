package corejava_Logic_prctice;

import java.util.Scanner;

public class CountDigit {

    public static void main(String[] args) {
        int no, a = 0;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Any Number = ");
        no = kb.nextInt();
        if (no < 0) {
            no = no * (-1);
        } else if (no == 0) {
            no = 1;
        }
        // this main logic
        while (no > 0) {
            no = no / 10;
            a++;
        }
        System.out.println("Number of Digit = " + a);
    }

}
