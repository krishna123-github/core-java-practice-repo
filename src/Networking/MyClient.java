 
package Networking;
 
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MyClient {
 
    public static void main(String[] args) throws IOException {
         Socket socket = new Socket("localhost", 6677);
         DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
         
         dos.writeUTF("hello Server");
         dos.flush();
         dos.close();
         socket.close();
    }
    
}
