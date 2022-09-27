 
package File_Handling;
 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteContent {
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("MyPic.jpg");
        f.createNewFile();
        
        FileOutputStream out = new FileOutputStream(f);
        
        for(int i=0; i<250; i++){
            out.write(i);
        }
        out.close();
        System.out.println("Successfully created File");
        
    }
    
}
