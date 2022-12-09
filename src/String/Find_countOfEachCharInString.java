/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author krishna
 */
public class Find_countOfEachCharInString {
    public static void main(String[] args) {
        String str = "aadbbccbcccdd";
        
        
        Map<String, Long> collect = Arrays.stream(str.split(""))
                .collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting())
                );
        System.out.println(collect);
        
        
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        for(int i=0; i<str.length(); i++){
            m.put(str.charAt(i), m.get(str.charAt(i)) == null? 1 : m.get(str.charAt(i)) +1);
        }
        System.out.println("Character count bby algo");
        System.out.println(m);
        
        
        // getting error here
//        Map<String, Long>  m;
//        m = (Map<String, Long>) Stream.of(str.toCharArray())
//                .collect((Collector<? super char[], String, Long>) Collectors.groupingBy(Function.identity(),Collectors.counting()));
      
    }
}

