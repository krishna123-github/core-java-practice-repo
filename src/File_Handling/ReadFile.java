package File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("myFile.txt");
        int length = (int) file.length(); 
        char charStr[] = new char[length];    // it create empty charater
        
//        FileReader reader = new FileReader(file);
        FileReader reader = new FileReader("myFile.txt");
        
        // faltu ka code likha h
        int i  =0 ;
       while((i = reader.read()) != -1){
           System.out.println(reader.hashCode());
           System.out.println(reader);
           System.out.println(file.hashCode());
           System.out.println(reader.equals(file));
           System.out.println((char)i);
       }
        
        reader.read(charStr);
        
        String str = new String(charStr);
        
        System.out.println(str);
        
        reader.close();
       
    }

}
