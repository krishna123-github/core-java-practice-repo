 
package Networking;
 
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_Example {
 
    public static void main(String[] args) throws UnknownHostException {
        
        InetAddress address = InetAddress.getByName("http://www.javatpoint.com/java-tutorial");
        System.out.println("host name:  "+address.getHostName());
        System.out.println("host canonical host:  "+address.getCanonicalHostName());
        System.out.println("host Address :  "+address.getHostAddress());
    }
    
}
