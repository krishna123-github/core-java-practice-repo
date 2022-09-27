
package Serializable_Interface;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialize_Demo {
 
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        FileInputStream fis = new FileInputStream("emp.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Object o = ois.readObject();
        
        if(o instanceof Emp){
            Emp e = (Emp) o;
            
            System.out.println(e.id);
            System.out.println(e.name);
            System.out.println(e.dept);
        }
    }
    
}
