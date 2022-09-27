 
package RMI;
 
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author krishna pal
 */
public class AdderRemote  extends UnicastRemoteObject implements Adder {

    AdderRemote()throws RemoteException{
        super();
    }
    
    @Override
    public int add(int x, int y) throws RemoteException {
        return x+y;
        
    }
    
}
