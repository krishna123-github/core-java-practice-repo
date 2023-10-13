package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Find_Median_Of_SubArray {

    public static void main(String[] args) {
        //BufferedReader
        Integer N = 6;
        String A = "2 4 5 3 1 6";
        String Q = "3";

        String Q1 = "1 6";
        String Q2 = "2 4";
        String Q3 = "3 3";

        String[] aarr = A.split(" ");

        int[] rangeArr1 = getSubArray(aarr, Q1);
        System.out.println("Med = " + getMedian(rangeArr1));

        int[] rangeArr2 = getSubArray(aarr, Q2);
        System.out.println("Med = " + getMedian(rangeArr2));

        int[] rangeArr3 = getSubArray(aarr, Q3);
        System.out.println("Med = " + getMedian(rangeArr3));
    }

    private static int[] getSubArray(String[] aarr, String Q1) {
        int[] Q1Arr = Arrays.stream(Q1.split(" ")).mapToInt(Integer::parseInt).toArray();;

        int[] intArr = Arrays.stream(aarr).mapToInt(Integer::parseInt).toArray();

        int[] rangeArr1 = Arrays.copyOfRange(intArr, Q1Arr[0] - 1, Q1Arr[1]);
        System.out.println("SUbArray " + Q1);
        for (int i : rangeArr1) {
            System.out.print(" " + i);
        }
        return rangeArr1;
    }

    private static int getMedian(int[] intArr) {
        Arrays.sort(intArr);
        System.out.println("");
        for (int i : intArr) {
            System.out.print(" " + i);
        }
        System.out.println("");
        int median = intArr.length / 2;
        System.out.println("median = " + median);
        int rem = intArr.length % 2;
        int finalIndex = rem == 0 ? median -1 : median;
        System.out.println("finalIndex = " + finalIndex);
        System.out.println("=========================================");
        return intArr[finalIndex];
    }

}
