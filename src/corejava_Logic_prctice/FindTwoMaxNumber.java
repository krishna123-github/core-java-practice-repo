package corejava_Logic_prctice;

import java.util.Scanner;

public class FindTwoMaxNumber {

    public static void main(String[] args) {
        int[] a = new int[10];
        int max1 = 0, max2 = 0, max3 = 0;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter number = ");
        for (int i = 0; i < 10; i++) {
            a[i] = kb.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (max1 < a[i]) {
                max2 = max1;
                max1 = a[i];
            } else if (max2 < a[i]) {
                max3 = max2;
                max2 = a[i];
            } else if (max3 < a[i]) {
                max3 = a[i];
            }
        }

        System.out.println("max1 = " + max1);
        System.out.println("max2 = " + max2);
        System.out.println("max3 = " + max3);
    }

}
