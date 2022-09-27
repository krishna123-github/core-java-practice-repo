 
package Input_Output;
 
import java.io.*;

public class DataInputStreamExample {
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("test2.txt");
        
        DataInputStream dis = new DataInputStream(fis);
        
        int count = fis.available();
        byte[] b = new byte[count];
        
        dis.read(b);
        
        for(byte a : b){
            char k = (char)a;
            System.out.println(a+"     "+k);
        }
        
        dis.close();
        fis.close();
    }
    
}
