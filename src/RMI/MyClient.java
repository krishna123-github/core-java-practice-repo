 
package RMI;
 
import java.rmi.Naming;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyClient {
    public static void main(String[] args) {
        try {
            Adder stub = (Adder) Naming.lookup("rmi://localhost:5000/sonoo");
            
            System.out.println(stub.add(10, 20));
            
        } 
         catch (Exception ex) {
            Logger.getLogger(MyClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
