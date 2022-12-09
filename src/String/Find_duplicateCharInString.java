/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

import java.util.stream.Stream;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Find duplicate char in string
 *
 * @author krishna
 */
public class Find_duplicateCharInString {

    public void findDuplicate_1(String str) {
        char[] carray = str.toCharArray();

        System.out.print("Duplicate Characters in above string are: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] == carray[j]) {
                    System.out.print(carray[j] + " ");
                    break;
                }
            }
        }
    }
    /**
     * easiest way to find duplicate char via set
     * @param str 
     */
    public void findDuplicate_2(String str) {
        char[] carray = str.toCharArray();

        Set allCharSet = new HashSet();
        Set DupCharSet = new HashSet();
        
        for(char c : carray){
            if(allCharSet.add(c) == false){
                DupCharSet.add(c);
            }
        }
        
        DupCharSet.forEach(System.out :: println);
       
        
    }
    

    public void countDuplicate(String str) {
        char[] carray = str.toCharArray();

        Map<Character, Integer> m = new HashMap<>();
        System.out.print("Duplicate Characters in above string are: ");
        for (int i = 0; i < str.length(); i++) {
            char key = carray[i];
            if (m.containsKey(key)) {
                m.put(key, (m.get(key) + 1));
            } else {
                m.put(key, 1);
            }
        }

        for (Map.Entry<Character, Integer> map : m.entrySet()) {
            if (map.getValue() > 1) {
                System.out.println(map.getKey() + "  " + map.getValue());
            }
        }
    }
    
    /**
     * Find count of each occurance of each charactor in string
     * output will be like this { =4, a=1, d=1, e=1, g=1, H=1, i=1, n=1, o=3, r=1, u=1, w=2, y=1}
     * @param str 
     */
    public void countOfEachCharJava8(String str){
         Map<String, Long> collect = Arrays.stream(str.split(""))
                .collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting())
                );
        System.out.println(collect);
    }

}

class Test {

    public static void main(String[] args) {
        Find_duplicateCharInString obj = new Find_duplicateCharInString();
        String str ="How are you doing w";
        System.out.println("======= Method 1 ======");
        obj.findDuplicate_1(str);
        
        System.out.println("======= Method 2 ======");
        obj.findDuplicate_2(str);
        
        System.out.println("======= Method 3 ======");
        obj.countDuplicate(str);
        
        System.out.println("======= Method 3 ======");
        obj.countOfEachCharJava8(str);
        
    }
}
