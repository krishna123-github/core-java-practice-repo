package sorting;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = new int[5];
        int n = 5;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the Integer Array ");
        for (int i = 0; i < 5; i++) {
            a[i] = kb.nextInt();
        }

        for (int i = 0; i < n; i++) {
            
            System.out.println("=========================");
            System.out.println("Iteration = " + (i + 1));
            
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
                //print every iteration steps wise
                System.out.println("   sub Iteration = " + (j + 1));
                for (int k = 0; k < 5; k++) {
                    System.out.print("    "+a[k] + "  ");
                }
                System.out.println("");
            }
           
        }

        System.out.println("==========Sorted Array============= ");
        for (int j = 0; j < 5; j++) {
            System.out.print(a[j] + "  ");
        }
    }

}
