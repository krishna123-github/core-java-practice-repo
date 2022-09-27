 
package File_Handling;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadContent {
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
       byte[] buffer = new byte[500000];
       
        FileInputStream fis = new FileInputStream("MyPic.jpg");
        int total =0;
        int nread =0;
        
        while((nread=fis.read(buffer)) != -1){
            System.out.println(new String(buffer));
            total = total +  nread;
        }
        fis.close();
        System.out.println("Read: "+total);
    }
    
}
