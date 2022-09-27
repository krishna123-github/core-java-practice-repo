

package File_Handling;
 
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import jdk.jfr.events.FileReadEvent;

public class WriteFile {
 
    public static void main(String[] args) throws IOException {
       
//        File file = new File("myFile.txt");
//        FileWriter writer = new FileWriter(file);
        
        //or we an do like this
        FileWriter writer = new FileWriter("myFile.txt");
        
        writer.write("Hey i am Krishna \r\n");
        writer.write("Now I am in bangalore \r\n");
        writer.write("Its my pleasure to talkling to u people \r\n");
        
        writer.close();
       
    }
    
}
