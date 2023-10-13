
import java.util.HashMap;
import java.util.Map;
import javax.xml.stream.events.Characters;

/**
 *
 * @author krishna
 */
public class InterviewTest {

    /**
     * Write a program to find whether a String is palindrome Input String
     * 1:aabbcc Input String 2: aabbaa
     */
    public static void main(String[] args) {
        Boolean b = checkPalindrom2("aabbcc");
        if (b) {
            System.out.println("Palindrom");
        } else {
            System.out.println("NOT");
        }
        
        findChar("abcdefedgd");
    }

    private static boolean checkPalindrom(String str) {
        StringBuilder sb = new StringBuilder(str);

        String reverseStr = sb.reverse().toString();

        return str.equalsIgnoreCase(reverseStr);

    }

    private static boolean checkPalindrom2(String str) {

        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += Character.toString(str.charAt(i));
        }

        return str.equalsIgnoreCase(reverseStr);

    }

    /**
     * Write a program to find the max occurring character in a string Input
     * String: abcdefedgd
     */
    private static void findChar(String str) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] strArr = str.split("");
        for (String s : strArr) {
            map.put(s, (map.get(s) != null ? map.get(s) + 1 : 1));
        }

        Integer count = 0;
        String maxChar = "";
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            if (count < m.getValue()) {
                count = m.getValue();
                maxChar = m.getKey();
            }
        }

        System.out.println("Max Char = " + maxChar);
    }
}
