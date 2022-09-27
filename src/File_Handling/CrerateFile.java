package File_Handling;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrerateFile {

    public static void main(String[] args) {
        try {
            File file = new File("myFile.txt");
            file.createNewFile();
            System.out.println("File Successfully created");
        } catch (IOException ex) {
            System.out.println("ERROR "+ex.getMessage());
        }
    }

}
