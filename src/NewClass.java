
import java.util.Arrays;
import java.util.stream.Stream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author krishna
 */

interface SumOperation{
    public int sum(int a, int b);
}
public class NewClass {

    public static void main(String[] args) {
        SumOperation sb = (a,b) -> a+b;
        
        System.out.println(sb.sum(4, 5));
        
        printString();
        
    }
    
    private static void printString(){
       // I have an array of names : {"Assam","Delhi","Bhopal","Banglore","Bihar"}
       
        Stream.of("Assam","Delhi","Bhopal","Banglore","Bihar")
                .filter(x -> x.equals("Bhopal") || x.equals("Banglore"))
                .forEach(System.out :: println);
    }
    
//    public static void main(String[] args) {
//        int[] intArr = {5, 2, 6, 3};
//        for (int i = 0; i < intArr.length; i++) {
//
//            for (int j = i; j < intArr.length; j++) {
//
//                if (intArr[i] > intArr[j]) {
//                    int temp = intArr[i];
//                    intArr[i] = intArr[j];
//                    intArr[j] = temp;
//                }
//            }
//
//        }
//        for (int i : intArr) {
//
//            System.out.println(i);
//        }
//    }
}
