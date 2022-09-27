
package File_Handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileBy_BufferReader {
 
    public static void main(String[] args) throws IOException {
       
        FileWriter writer = new FileWriter("myFile.txt");
        
        BufferedWriter bw = new  BufferedWriter(writer);
//        BufferedWriter bw = new  BufferedWriter(writer,10240);    //we can define the size of buffer
        
        bw.write("hello buddy \r\n");
        bw.write("how is going on ? \r\n");
        bw.write("evreything is fine or not \r\n");
        
        System.out.println("Successfully Write File ");
        
        bw.close();
        writer.close();
        
    }
    
}
