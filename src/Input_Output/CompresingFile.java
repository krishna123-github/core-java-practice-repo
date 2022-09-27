package Input_Output;

import java.io.*;
import java.util.zip.DeflaterOutputStream;

/**The DeflaterOutputStream class is used to compress the data in the deflate compression format. 
 * It provides facility to the other compression filters, such as GZIPOutputStream. */
public class CompresingFile {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        FileInputStream fis = new FileInputStream("src\\Input_Output\\BufferInputStreamExample.java");
        
        FileOutputStream fos = new FileOutputStream("compress.txt");
        DeflaterOutputStream dos = new DeflaterOutputStream(fos);
        
        int i ;
        while((i=fis.read()) != -1){
            dos.write((byte)i);
            dos.flush();
        }
        
        System.out.println("Compresses successfully...");
        fis.close();
        fos.close();
        
    }

}
