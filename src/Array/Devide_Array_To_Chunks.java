/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.*;

/**
 *
 * @author krishna
 */
public class Devide_Array_To_Chunks {

    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 3;

        /* expected Output 
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]
         */
        splitArray(original, splitSize);
        splitArray_mySolution2(original, splitSize);
//        list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
    }

    public static void splitArray(int[] array, int splitSize) {
        int chunk = splitSize; // chunk size to divide
        for (int i = 0; i < array.length; i += chunk) {
            System.out.println(Arrays.toString(Arrays.copyOfRange(array, i, Math.min(array.length, i + chunk))));
        }
    }

    public static void splitArray_mySolution2(int[] array, int splitSize) {
        int rest = array.length % splitSize;
        
        System.out.println("array " + array.length);
        System.out.println("splitSize " + splitSize);
        System.out.println("rest " + rest);

        int n = rest > 0 ? array.length - 1 : array.length;

        int i = 0;
        for (i = 0; i < n; i += splitSize) {
            System.out.println(Arrays.toString(Arrays.copyOfRange(array, i, i + splitSize)));
        }
        if (rest != 0) {
            System.out.println(Arrays.toString(Arrays.copyOfRange(array, i, array.length)));
        }
    }
}
