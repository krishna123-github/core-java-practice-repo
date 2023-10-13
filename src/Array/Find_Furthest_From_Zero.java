/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.TreeSet;

/**
 *
 * @author krishna
 */
public class Find_Furthest_From_Zero {

    public static void main(String[] args) {
//        int[] arr = {-10, 7, 5, 10};
        int[] arr = {-10, -7, -5, -8};
        System.out.println("Furthest = " + futhestFromZero(arr));
    }

    private static int futhestFromZero(int[] arr) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i : arr) {
            set.add(i);
        }

        int min = set.first();
        int max = set.last();

        if(Math.abs(min) >= Math.abs(max)){
            return min;
        }
        return max;
    }
}
