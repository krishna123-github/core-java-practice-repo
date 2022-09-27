 
package Networking;
 
import java.net.*;
import java.net.URL;

public class URL_Demo {
 
    public static void main(String[] args) throws MalformedURLException {
        
        URL url = new URL("http://www.javatpoint.com/java-tutorial");
        
        System.out.println("Protocol: "+url.getProtocol());
        System.out.println("Host: "+url.getHost());
        System.out.println("Port: "+url.getPort());
        System.out.println("File: "+url.getFile());
    }
    
}
