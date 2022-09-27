 
package Input_Output;
import java.io.*;
public class PushbackReaderExample {
 
    public static void main(String[] args) throws IOException {
        char[] arr =  {'1','-','-','2','-','3','4','-','-','-','5','6'}; 
        
        CharArrayReader arrayReader = new CharArrayReader(arr);
        PushbackReader pr = new PushbackReader(arrayReader);
        
        int i;
        while((i =  pr.read()) != -1){
            if(i == '-'){
                int a ;
                if((a = pr.read()) == '-'){
                    System.out.print("##");
                }
                else{
                    pr.unread(a);
                    System.out.print((char)i);
                }
            }
            else{
                System.out.print((char)i);
            }
        }
                 
    }
    
}
