/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java8;

import java.util.Arrays;

/**
 *
 * @author krishna
 */
public class StreamString_Sorting {

    public static void main(String[] args) {
        StreamString_Sorting obj = new StreamString_Sorting();
//        obj.useSorting_Asc_String();
        obj.useSorting_Desc_String();
    }

    /**
     * by default sorting method sort in ASC order
     */
    private void useSorting_Asc_String() {
        System.out.println("Asc: if all starts with capial/small letter then only it will do proper shorting================");
        Arrays.asList("Rahul", "Prakash", "Krishna", "Pradeep", "Amit").stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("Asc: if all are not starts with capial/small letter then not do proper sorting===============");
        Arrays.asList("Rahul", "prakash", "krishna", "Pradeep", "Amit").stream()
                .sorted()
                .forEach(System.out::println);
    }

     /**
     * need to implement comparator in sorted method to  sort in DESC order
     */
    private void useSorting_Desc_String() {
        System.out.println("Desc: if all starts with capial/small letter then only it will do proper shorting================");
        Arrays.asList("Rahul", "Prakash", "Krishna", "Pradeep", "Amit").stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .forEach(System.out::println);
        
        System.out.println("Desc: if all are not starts with capial/small letter then not do proper sorting===============");
        Arrays.asList("Rahul", "prakash", "krishna", "Pradeep", "Amit").stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .forEach(System.out::println);
    }
}
