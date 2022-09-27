 
package Input_Output;
 
import java.io.*;

public class FileInputStreamExample {
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("myFile.txt");
        
        // use to read a byte from file
         int a = fis.read();   
         System.out.println((char)a);  
         System.out.println("");
         
         // use to read string from file 
         int i = 0;
         while((i=fis.read()) != -1){
             System.out.print((char)i);
         }
         
         fis.close();
    }
}
