
package String;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringUsingAPI {
    String choose;
    void checkString() {
         do {
            String rev = "";
            Scanner kb = new Scanner(System.in);
            System.out.print("Enter any String: ");
            String str = kb.nextLine();
            
            char[] strChar = str.toCharArray();    // Sorting perform karne ke liye pahle char[] array me daalna padega.. 
            Arrays.sort(strChar);                  // then Arrays class ke sort() fuction ko call karege 
                    
            String s = new String(strChar);
            System.out.println("Sorted String:  " + s);
            System.out.println("-----------------");
            
             String[] str2 = str.split(" ");
             Arrays.sort(str2);
             for(String s1: str2){
                 System.out.println(s1);
             }            
            System.out.print("Do you want to contineue: ");
            choose = kb.next();
        }
         while (choose.equals("y") || choose.equals("Y"));
    }
    
}

class TestSort{
    public static void main(String[] args) {
        SortStringUsingAPI aPI = new  SortStringUsingAPI();
        aPI.checkString();
        
    }
}