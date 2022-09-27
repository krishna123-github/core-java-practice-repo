 
package File_Handling;
 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileBy_BufferReader {
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
         FileReader fileReader = new FileReader("myFile.txt");
         
         BufferedReader br = new BufferedReader(fileReader);
         
         String str = br.readLine();
         
         while(str != null){
             System.out.println(str);
             str = br.readLine();
         }
         
         br.close();
         fileReader.close();
                 
    }
    
}
