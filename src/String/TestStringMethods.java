package String;

import java.io.IOException;

public class TestStringMethods {

    public static void main(String[] args) throws IOException {
        String str = "krishn123jhashd765765";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                System.out.println("numeric value = " + Character.getNumericValue(str.charAt(i)));
                sum = sum + Character.getNumericValue(str.charAt(i));
            }
            System.out.println("sum = " + sum);
        }
    }
}
