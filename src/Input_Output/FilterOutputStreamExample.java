 
package Input_Output;
 
import java.io.*;
 
public class FilterOutputStreamExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("test1.txt");
        FileOutputStream fos = new FileOutputStream(f);
        
        FilterOutputStream filterOutputStream = new FilterOutputStream(fos);
        
        String str = "krishna....welcome you fellow";
        byte[] b = str.getBytes();
        filterOutputStream.write(b);
        
        System.out.println("Sucesss....");
        
        filterOutputStream.flush();
        filterOutputStream.close();
        fos.close();
    }
    
}
