package corejava_Logic_prctice;

import java.util.Scanner;

public class SortArrayDecendingOrder {

    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number  = ");
            a[i] = kb.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (a[i] < a[j]) {
                    int p;
                    p = a[i];
                    a[i] = a[j];
                    a[j] = p;
                }
            }
        }
        System.out.println();
        int k = 0;
        for (int b : a) {

            System.out.println("a[" + k + "] = " + b);
            k++;
        }

    }

}
