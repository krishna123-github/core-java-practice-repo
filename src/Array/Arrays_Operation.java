package Array;

import java.util.Arrays;
import java.util.Collections;

public class Arrays_Operation {
 
    public static void main(String[] args) {
        String str = "krishna patel pal ";

        char[] arrChar = str.toCharArray();
        Arrays.sort(arrChar);               // it will sort out each 'Character' or String 

        for (char c : arrChar) {
            System.out.println(c);
        }

        String str1 = new String(arrChar);
        System.out.println(str1);

        String[] str2 = str.split(" ");
        Arrays.sort(str2);                 //  it will sort only The "String" of the String 
        System.out.println(str2+"     "+str2.toString());
        for (String s : str2) {
            System.out.println(s);
        }
    }
}
