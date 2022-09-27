 
package Input_Output;
 
import java.io.*;

public class FilterInputStreamExample {
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("test1.txt");
        FilterInputStream filter = new BufferedInputStream(fis);
        
        int k =0;
        
        while((k = filter.read()) != -1){
            System.out.print((char)k);
        }
        
        filter.close();
        fis.close();
    }
    
}
