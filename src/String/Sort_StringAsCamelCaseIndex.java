/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Input = "SortStringProgRaM"; Output= "MaggPinoorRrrtStS";
 *
 * @author krishna
 */
public class Sort_StringAsCamelCaseIndex {

    public static void main(String[] args) {
        String input = "SortStringProgRaM";
        sortString(input);
    }

    private static void sortString(String str) {
        Integer[] indexArr = new Integer[5];
        int j = 0;
        List<Character> upperCharList = new ArrayList();
        List<Character> lowerCharList = new ArrayList();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < 95) {
                // Upper letter
                upperCharList.add(c);
                indexArr[j++] = i;
            } else {
                // lower 
                lowerCharList.add(c);
            }
        }
        Collections.sort(upperCharList);
        Collections.sort(lowerCharList);
        System.out.println("fff");
        StringBuilder sb = new StringBuilder();
        j = 0;
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Arrays.binarySearch(indexArr, i) >= 0) {
                sb.append(upperCharList.get(j++));
            } else {
                sb.append(lowerCharList.get(k++));
            }
        }
        System.out.println(sb.toString());
    }
}
