package Input_Output;

import java.io.*;

public class ByteArrayOutputStreamExample {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos1 = new FileOutputStream("test1.txt");
        FileOutputStream fos2 = new FileOutputStream("test2.txt");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        /**1-- write a byte */
        baos.write(66);
        baos.writeTo(fos1);
        baos.writeTo(fos2);
        System.out.println("Success..");
        
        /**2-- write sequence of bytes */
        String str ="krishna is coming ";
        byte[] b = str.getBytes();
        baos.write(b);
        baos.writeTo(fos2);
        baos.writeTo(fos1);
        
        baos.close();
        fos1.close();
        fos2.close();
        
       
    }

}
