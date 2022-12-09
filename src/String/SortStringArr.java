package String;

import java.util.Arrays;
import java.util.stream.Stream;

public class SortStringArr {

    public static void main(String[] args) {
        String[] globalArr = {"Krishna", "Amit", "Dharmendra", "Aman", "Bablus"};
        
        String[] myArray = globalArr;
        Arrays.sort(myArray);
        System.out.println(myArray);

        int length = myArray.length;
        for (int i = 0; i < length - 1; i++) {
            for (int k = i + 1; k < myArray.length; k++) {
                if(myArray[i].compareTo(myArray[k]) > 0){
                    String temp = myArray[i];
                    myArray[i] = myArray[k];
                    myArray[k] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
        
        System.out.println("Sorted by Stream of arrays");
        Stream.of(myArray).sorted().forEach(System.out :: println);
        
        System.out.println("Sorted by stream of list");
        String[] arr2 = globalArr;
        Arrays.asList(arr2)
                .stream()
                .sorted()
                .forEach(System.out :: println);
    }
}
