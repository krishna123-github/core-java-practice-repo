/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 *
 * Write program to find the maximum occurring character in a given String
 * ex- string is "Java" then the function should return 'a'.
 *
 * @author krishna
 */
public class DemoTest2 {

    public static void main(String[] args) {
        System.out.println(findMaxOccureChar("aabbb"));
    }

    private static Character findMaxOccureChar(String str) {

        Character maxChar = null;
        int actualCharMaxCount = 0;
        for (int i = 0; i < str.length(); i++) {
            Character c = null;
            int charMaxCount = 0;   // i=0   j
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    c = str.charAt(i);
                    charMaxCount += 1;
                }
            }
            if (actualCharMaxCount < charMaxCount) {
                actualCharMaxCount = charMaxCount;
                maxChar = c;
            }
        }

        return maxChar;
    }
}
