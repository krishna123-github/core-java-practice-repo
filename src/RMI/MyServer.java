 
package RMI;
 
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyServer {
    public static void main(String[] args) {
        try {
            Adder stub = new AdderRemote();
            Naming.rebind("rmi://localhost:5000/sonoo", stub);
            
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
