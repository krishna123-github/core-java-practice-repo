/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File_Handling;
 
import java.io.*;

public class ReaderExample {
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        Reader r = new FileReader("output.txt");
        
        int i= 0;
        while((i=r.read()) != -1){
            System.out.print((char)i);
        }
        
        r.close();
    }
    
}
