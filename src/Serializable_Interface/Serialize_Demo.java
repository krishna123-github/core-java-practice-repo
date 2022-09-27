 
package Serializable_Interface;
 
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialize_Demo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        Emp e = new Emp();
        e.id = 1001;
        e.name = "krishna";
        e.dept = "IT";
        
        System.out.println(e instanceof Serializable);
        
        FileOutputStream fos = new FileOutputStream("emp.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e);
        
        fos.close();
        
        
    }
    
}
