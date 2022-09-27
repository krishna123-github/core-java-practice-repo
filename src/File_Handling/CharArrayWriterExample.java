 
package File_Handling;
 
import java.io.*;
import jdk.jfr.events.FileWriteEvent;

public class CharArrayWriterExample {
 
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        CharArrayWriter arrayWriter = new CharArrayWriter();
        arrayWriter.write("Krishna is best");
        
        FileWriter fw1 = new FileWriter("a.txt");
        FileWriter fw2 = new FileWriter("b.txt");
        FileWriter fw3 = new FileWriter("c.txt");
        FileWriter fw4 = new FileWriter("d.txt");
        
        arrayWriter.writeTo(fw1);
        arrayWriter.writeTo(fw2);
        arrayWriter.writeTo(fw3);
        arrayWriter.writeTo(fw4);
                
        System.out.println("Successs....");
        fw1.close();
        fw2.close();
        fw3.close();
        fw4.close();
    }
    
}
