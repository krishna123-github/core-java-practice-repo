 
package File_Handling;
 
import java.io.*;

public class ReadingDataFromConsole {
 /** In this example, we are connecting the BufferedReader stream with the InputStreamReader stream
  * for reading the line by line data from the keyboard. */
    public static void main(String[] args) throws IOException {
        InputStreamReader isr  = new InputStreamReader(System.in);
        
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Enter Your name ");
        String str = br.readLine();
        System.out.println("Welcome "+str);
        
    }
    
}
