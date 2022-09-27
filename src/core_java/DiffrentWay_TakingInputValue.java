 
package core_java;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

 
public class DiffrentWay_TakingInputValue {
 
    public static void main(String[] args) throws IOException {
       
        System.out.println("enter String1 : ");
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        
        System.out.println("enter String2 : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str2 =  br.readLine();
        
       
        
        System.out.println("enter String4 : ");
        Console c = System.console();
        String str4 = c.readLine();
        
        
         System.out.println("enter String3 : ");
        DataInputStream dis = new DataInputStream(System.in);
        String str3 = dis.readLine();
     
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
    
}
