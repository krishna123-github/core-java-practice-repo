 
package Input_Output;
 
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStreamExample {
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream  fos = new FileOutputStream("myFile.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        
        String str = "i am krishna, welcome to all";
        byte[] b =  str.getBytes();
        
        bos.write(b);
        
        bos.close();
        
        System.out.println("successs...");
    }
    
}
