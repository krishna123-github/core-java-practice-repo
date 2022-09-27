 
package File_Handling;
 
import java.io.*;
import java.io.Writer;

public class WriterExample {
 
    public static void main(String[] args) throws IOException {
        Writer w = new FileWriter("output.txt");
        String str ="I lve my india";
        
        w.write(str);
        w.write(str.toCharArray());
        
        w.close();
    }
    
}
