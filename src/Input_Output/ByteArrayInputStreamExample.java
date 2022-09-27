 
package Input_Output;
 
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {
 
    public static void main(String[] args) throws IOException {
        byte[] b = {22,33,44,55,66};
        
        ByteArrayInputStream bais = new ByteArrayInputStream(b);
        
        int i=0;
        while((i=bais.read()) != -1){
            char ch = (char)i;
            System.out.println(i+"      "+ch);
        }
        bais.close();
    }
    
}
