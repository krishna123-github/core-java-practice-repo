package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Check the input string contains all 26 alphabates
 *
 * @author krishna
 */
public class CheckTheString26Letter {

    public String testString(String str) {
        int count = 0;
        for (int i = 97; i <= 122; i++) {
            for (int j = 0; j < str.length(); j++) {
                if ((char) i == str.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        if (count == 26) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public void check26LatterByMap(String str) {
        Map m = new HashMap<>();
        for (int j = 0; j < str.length(); j++) {
            m.put(str.charAt(j), "DUMMY");
        }
        System.out.println(m.keySet().size());
        System.out.println(m.keySet().size() == 26);
    }
}

class Test {

    public static void main(String[] args) {
        CheckTheString26Letter c = new CheckTheString26Letter();
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter any string = ");
        String str = kb.next();
        String result = c.testString(str);
        System.out.println(result);
        
        c.check26LatterByMap(str);
    }
}
