/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author lenovo
 */
public class PalindromAllPattern {

    private static void getAllPattern(String str) {
        char[] charArr = str.toCharArray();
        
        
        Set<String> finalSet = new HashSet<>();
        for (int i = 0; i < charArr.length; i++) {
            finalSet.add(charArr[i] + "");
            String startCharStr = charArr[i] + "";

            for (int j = i + 1; j < charArr.length; j++) {
                startCharStr = startCharStr + "" + charArr[j];
                if (isPalindrom(startCharStr)) {
                    finalSet.add(startCharStr);
                }
            }
        }
        // Print 
        finalSet.forEach((dto) -> System.out.println(dto));
        System.out.println("Palindrom Count: "+finalSet.size());
    }

    private static boolean isPalindrom(String str) {
        int i = 0, j = str.length() - 1;
        Boolean isPalidrom = true;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalidrom = false;
            }
            i++;
            j--;
        }
        return isPalidrom;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an string : ");
        String str = sc.next();
        getAllPattern(str);
    }
}
