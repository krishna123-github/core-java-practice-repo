 
package Networking;
 
import java.io.IOException;
import java.net.*;
import java.net.SocketException;

public class Recieving_DatagramP_by_DatagramS {
 
    public static void main(String[] args) throws SocketException, IOException {
        
        DatagramSocket socket = new DatagramSocket(3000);
        
        byte[] b = new byte[1024];
        
        DatagramPacket dp = new DatagramPacket(b, 1024);
        
        socket.receive(dp);   // here is will wait for dataGram 
        
        String  str = new String(dp.getData(), 0, dp.getLength());
        System.out.println(str+"  Krishna....");
        
        socket.close();
    }
    
}
