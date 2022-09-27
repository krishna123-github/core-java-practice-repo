 
package Input_Output;
import java.io.*;
 
public class BufferInputStreamExample {
 
    public static void main(String[] args) throws FileNotFoundException, IOException {   
        FileInputStream fis = new FileInputStream("myFile.txt");
        
        BufferedInputStream bis = new BufferedInputStream(fis);
        
        int i=0;
        while((i=bis.read()) != -1){
            System.out.print((char)i);
        }
    }
    
}
