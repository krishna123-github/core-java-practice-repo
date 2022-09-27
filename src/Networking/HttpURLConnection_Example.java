 
package Networking;
 
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpURLConnection_Example {
 
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("www.javatpoint.com");
        
        HttpURLConnection  connection = (HttpURLConnection) url.openConnection();
        for(int i=1;i<20;i++){
            System.out.println(connection.getHeaderFieldKey(i)+"     "+connection.getHeaderField(i));
        }
        
       connection.disconnect();
    }
    
}
