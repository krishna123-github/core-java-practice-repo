 
package Networking;
 
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.*;

public class Sending_DatagramP_by_DatagramS {
 
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        // TODO code application logic here
        DatagramSocket socket = new DatagramSocket();
        
         String str = "Welcome java";
        
        InetAddress ip = InetAddress.getByName("localhost");
                 
        DatagramPacket packet = new DatagramPacket(str.getBytes(), str.length(),ip, 3000);
        
        socket.send(packet);
        System.out.println("Successfully sent data ");
        
        socket.close();
    }
    
}
