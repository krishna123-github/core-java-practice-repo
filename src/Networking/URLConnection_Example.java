 
package Networking;
 
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.net.URL;

public class URLConnection_Example {
 
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("http://www.javatpoint.com/java-tutorial");
        
        URLConnection uRLConnection = url.openConnection();
        InputStream inputStream = uRLConnection.getInputStream();
        
        int i;
        while((i=inputStream.read()) == -1){
            System.out.println((char)i);
        }
        
        inputStream.close();
        
    }
    
}
