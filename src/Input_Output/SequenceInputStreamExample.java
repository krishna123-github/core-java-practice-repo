 
package Input_Output;
import java.io.*;
import java.util.Enumeration;
import java.util.Vector;
 
public class SequenceInputStreamExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
         FileInputStream fis1 = new FileInputStream("test1.txt");
         FileInputStream fis2 = new FileInputStream("test2.txt");
         
         SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
         /** 1---reading the input from 2 files */
//         int i=0;
//         while((i=sis.read()) != -1){
//             System.out.print((char)i);
//         }
//         System.out.println("");
//         
         
         /** 2--- writing the inpute of 2 file to  3rd file */
//         FileOutputStream fos = new FileOutputStream("myFile.txt");
//         int j=0;
//         while((j=sis.read()) != -1){
//             fos.write(j);
//             System.out.print((char)j);
//         }
//         System.out.println("\n Success written ");
//         
         /** 3--- SequenceInputStream example that reads data using enumeration */
         Vector v = new Vector();
         v.add(fis1);
         v.add(fis2);
         Enumeration e =  v.elements();
         SequenceInputStream sis2 = new SequenceInputStream(e);
          FileOutputStream fos = new FileOutputStream("myFile.txt");
         int k=0;
         while((k=sis.read()) != -1){
             fos.write(k);
             System.out.print((char)k);
         }
         System.out.println("\n Success written ");
         
         fos.close();
         sis.close();
         fis1.close();
         fis2.close();
    }
    
}
