package Array;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Stream;

/**
 * Find pairs of two number whose sum is equal to output
 *
 * @author krishna
 */
public class Find_Pair_Of_Two_Numbers {

    public static void main(String[] args) {
        int[] input = {2, 3, 7, 8, 6, 2};
        int output = 9;
       // getPairsCount(input, output);
        findPair(input, output);
    }
    // Prints number of pairs in arr[0..n-1] with sum equal
    // to 'sum'

    public static void getPairsCount(int[] arr, int sum) {

        int count = 0; // Initialize result
        List<String> l = new ArrayList<>();

        // Consider all possible pairs and check their sums
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == sum) {
                    System.out.println(arr[i] + " " + arr[j]);
                    l.add(arr[i] + " " + arr[j]);
                    count++;
                }
            }
        }

        System.out.printf("Count of pairs is %d", count);
    }
//    Time Complexity: O(n2), traversing the array for each element
//    Auxiliary Space: O(1)

    public static void findPair(int[] nums, int target) {
        // create an empty HashMap
        Map<Integer, Integer> map = new HashMap<>();

        // do for each element
        for (int i = 0; i < nums.length; i++) {
            // check if pair (nums[i], target-nums[i]) exists

            // if the difference is seen before, print the pair
            if (map.containsKey(target - nums[i])) {
                System.out.printf("Pair found (%d, %d)",
                        nums[map.get(target - nums[i])], nums[i]);
                System.out.println("");
            }

            // store index of the current element in the map
            map.put(nums[i], i);
        }

        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }
}
