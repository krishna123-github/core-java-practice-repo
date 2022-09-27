package String;

import java.util.Scanner;

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
}

class Test {
    public static void main(String[] args) {
        CheckTheString26Letter c = new CheckTheString26Letter();
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter any string = ");
        String str = kb.next();
        String result = c.testString(str);
        System.out.println(result);
    }
}
