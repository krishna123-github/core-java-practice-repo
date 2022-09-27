 
package Input_Output;
 
import java.io.*;

public class ConsoleExample {
 
    public static void main(String[] args) {
       Console con = System.console();
       
        System.out.println("Enter Your name :");
        
        String str = con.readLine();
        
        System.out.println("Wecome "+str);
        
    }
    
}
