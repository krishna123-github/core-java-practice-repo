package String;

import java.util.Arrays;

public class SortStringArr {

    public static void main(String[] args) {
        String[] myArray = {"Krishna", "Amit", "Dharmendra", "Aman", "Bablus"};
        
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
    }
}
