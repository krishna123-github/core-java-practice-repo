 
package Input_Output;
 
import java.io.*;
 
public class DataOutputStreamExample {
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("myFile.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        
        dos.write(72);
        
        System.out.println("successs");
        dos.flush();
        dos.close();
        
    }
    
}
