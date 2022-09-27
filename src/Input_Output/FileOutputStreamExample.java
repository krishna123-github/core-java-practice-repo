 
package Input_Output;
import java.io.*;
 
public class FileOutputStreamExample {
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream  fileOutputStream = new FileOutputStream("myFile.txt");
        
        // write a byte in file
        fileOutputStream.write(65);   //it is taking the ASSICI value and convert it in character
        
        // write a string in  file
        String str = "krishna";
        byte[] b = str.getBytes();    // first convert string to byte[] array beacuse FileOutputStream used to write byte by byte in file 
        fileOutputStream.write(b);    // write(byte[] b)
        
        fileOutputStream.close();
        System.out.println("Success...");
    }
}
