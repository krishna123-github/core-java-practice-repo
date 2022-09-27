package sorting;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        int[] a = new int[5];
        int n = 5;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the Integer Array ");
        for (int i = 0; i < 5; i++) {
            a[i] = kb.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int k = i;   // store value of i in first loop to k var.
            int value = a[i]; // store value of i index in var..
            int count = 1;  // for count the loop

            System.out.println("==================================");
            System.out.println("Iteration = " + (i + 1));

            //logic condition k>0  and  a[k-1]  greater then value in  a[k]..  TRUE
            while (k > 0 && a[k - 1] > a[k]) {
                // main logic .. swqp the value if logic is correct..
                int temp;
                temp = a[k];
                a[k] = a[k - 1];
                a[k - 1] = temp;

                System.out.println("    k=" + k);
                // for compare the next previous element in sub array
                k = k - 1;  // decrese the index of sub array to compare the sub array element..

                // this logic only for display the array result
                System.out.println("   sub Iteration = " + (count++));
                for (int j = 0; j < n; j++) {
                    System.out.print("    " + a[j] + "  ");
                }
                System.out.println("");
            }

            // this logic only for display the array result
            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + "  ");
            }
            System.out.println("");
        }
    }

}
