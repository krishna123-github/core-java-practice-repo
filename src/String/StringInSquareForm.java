package String;

import java.util.Scanner;

public class StringInSquareForm {

    public void printSquare(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (i == 0) {
                    System.out.print(str.charAt(j));
                } else if (j == 0) {
                    System.out.print(str.charAt(i));
                } else if (j > 0 && j < (str.length() - 1)) {
                    if (i != str.length() - 1) {
                        System.out.print(" ");
                    } else {
                        int a = str.length() - 1;
                        System.out.print(str.charAt(a - j));
                    }
                } else if (j == (str.length() - 1)) {
                    int a = str.length() - 1;
                    System.out.print(str.charAt(a - i));
                }
            }
            System.out.println("");
        }
    }
}

class TestString {

    public static void main(String[] args) {
        StringInSquareForm s = new StringInSquareForm();
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String str = kb.next();
        s.printSquare(str);
    }
}
