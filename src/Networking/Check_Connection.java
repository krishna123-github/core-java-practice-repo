 
package Networking;
 
import java.io.*;
import java.net.Socket;

public class Check_Connection {
 
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 6677);
        
        boolean con = socket.isConnected();
        System.out.println("Connection: "+con);
        
        boolean close = socket.isClosed();
        System.out.println("Closed: "+close);
        
        System.out.println(socket.getChannel());
        System.out.println(socket.getLocalPort());
        System.out.println(socket.getPort());
        System.out.println(socket.getSoTimeout());
        
    }
    
}
