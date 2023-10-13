/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author krishna
 */
public class Find_Common_Char_Of_Two_String {

    public static void main(String[] args) {
        String first = "abcbcd";
        String second = "cdefef";
        String common = commonCharacters(first, second);
        System.out.println("common characters in '" + first + "' and '" + second + "' are '" + common + "'");

    }

    public static String commonCharacters(String a, String b) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (b.contains(Character.toString(a.charAt(i)))
                    && sb.indexOf(Character.toString(a.charAt(i))) < 0) {
                System.out.println("== " + sb.indexOf(Character.toString(a.charAt(i))));
                sb.append(a.charAt(i));
            }
        }
        return sb.toString();
    }

//    public static String commonCharactersUsingCollection(String a, String b) {
//        
//        Stream.of(a.toCharArray())
//                .map(x -> new String(Character.toString(x)))
//                .collect(Collectors.toList());
//        Set<Character> set = new HashSet<Character>();
//        Set<Character> uniqueSet = new HashSet<Character>();
//        for (int i = 0; i < a.length(); i++) {
//            if(set.add(Character.MIN_VALUE)){
//                
//            }
//        }
//        return sb.toString();
//    }
}
