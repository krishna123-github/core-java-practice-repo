 
package Input_Output;
 
import java.io.*;

public class StringReaderExample {
 
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader fr =new BufferedReader(new FileReader("test1.txt"));
        String str = fr.readLine();
  
//        String str = "krishna  love pooja ";
        StringReader reader = new StringReader(str);
        
        int k;
        while((k = reader.read()) != -1){
            System.out.print((char)k);
        }
    }
    
}
