 
package Input_Output;
 
import java.io.*;

public class StringWriterExample {
 
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        char[] arr = new char[512];
        
        StringWriter sw = new StringWriter();
        
        FileInputStream  fis = new FileInputStream("test1.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
        
        int x ;
        
        while((x=br.read(arr)) != -1){
            sw.write(arr, 0, x);
            System.out.println(x);
        }
        
        System.out.println(sw.toString());
        
        br.close();
        fis.close();
        sw.close();
    }
    
}