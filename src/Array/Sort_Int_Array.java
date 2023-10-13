/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * Sort intArr and IntegerArr in descending order
 *
 * @author krishna
 */
public class Sort_Int_Array {

    public static void main(String[] args) {
        sortIntArray();

        sortIntegerArray();
        
        sortIntArrayUsingCollection();
    }

    private static void sortIntArray() {
        System.out.println("Sorting int[] -- No Arrays or Collections class method will work here because of Premitive type array");
        int[] arr = {4, 6, 1, 7, 2, 3, 5};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " \t");
        }

        TreeSet ts = new TreeSet();
        ts.add(30);
    }

    private static void sortIntegerArray() {
        System.out.println("");
        System.out.println("Sorting Integer[] -- Arrays or Collections sort() works becaz Wrapper type array");

        // WRONG - becaz return actual
        Integer[] arr = {4, 6, 1, 7, 2, 3, 5};
        Comparator<Integer> c = (x1, x2) -> x1 > x2 ? x1 : x2;
        Arrays.sort(arr, c);
        for (int i : arr) {
            System.out.print(i + " \t");
        }

        // WRONG - becaz return actual
        System.out.println("");
        Arrays.sort(arr, (x1, x2) -> x1 < x2 ? x2 : x1);
        for (int i : arr) {
            System.out.print(i + " \t");
        }

        // Right - Need to return 0,1,-1
        System.out.println("");
        Comparator<Integer> cc = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
//                if (o1 < o2) {
//                    return 1;
//                } else if (o1 > o2) {
//                    return -1;
//                } else {
//                    return 0;
//                }
            }
        };
        Arrays.sort(arr, cc);
        for (int i : arr) {
            System.out.print(i + " \t");
        }

        System.out.println("");
        Arrays.sort(arr, (x1, x2) -> x1 < x2 ? 1 : -1);
        for (int i : arr) {
            System.out.print(i + " \t");
        }
    }

    private static void sortIntArrayUsingCollection() {
        System.out.println("");
        System.out.println("Sorting int[] -- Sort using TreeSet");
        int[] arr = {4, 6, 1, 7, 2, 3, 5};

        Comparator<Integer> cc  = (x1,x2) -> x1 > x2 ? -1 : 1;
        TreeSet<Integer> ts = new TreeSet<Integer>(cc);
        for (int i = 0; i < arr.length; i++) {
            ts.add(arr[i]);
        }
        for (Integer i : ts) {
            System.out.print(i + " \t");
        }
    }
}
