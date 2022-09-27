package Networking;

import java.io.*;
import java.net.*;

public class MyServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6677);
        Socket ss = server.accept();     //estblish the connection with client and server
        ss.setSoTimeout(20000);
        
        DataInputStream dis = new DataInputStream(ss.getInputStream());
        String str = dis.readUTF();
        
        server.close();
        System.out.println("complete..."+str);
    }

}
