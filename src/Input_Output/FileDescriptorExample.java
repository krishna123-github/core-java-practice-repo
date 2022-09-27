 
package Input_Output;
 
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDescriptorExample {
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        byte[] b = {45,65,25,12,32,87,99,98,55,52};
        FileDescriptor fd;
        FileOutputStream fileOutput= new FileOutputStream("test1.txt");
        
        fd = fileOutput.getFD();
        fileOutput.write(b);
        fileOutput.flush();
        
        fd.sync();  // Connfirm data is written in file
        
        FileInputStream   intputStream = new FileInputStream ("test1.txt");
        int i;
        while((i = intputStream.read()  ) != -1){
            System.out.println((char)i);
        }
        
        intputStream.close();
        fileOutput.close();
        
    }
    
}
