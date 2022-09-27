 /**The InflaterInputStream class is used to decompress the file in the deflate compression format.
  * It provides facility to the other decompression filters, such as GZIPInputStream class. */
package Input_Output;
 
import java.io.*;
import java.util.zip.InflaterInputStream;

public class DeCompressFile {
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
         FileInputStream fis = new FileInputStream("compress.txt");
         InflaterInputStream inflaterInputStream =  new InflaterInputStream(fis);
         
         FileOutputStream fos = new FileOutputStream("D.java");
         
         int i ;
         while((i = inflaterInputStream.read()) != -1){
             fos.write((byte)i);
             fos.flush();
         }
         fis.close();
         fos.close();
         
    }
    
}
