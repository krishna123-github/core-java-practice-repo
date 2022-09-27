 
package Networking;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer_ReadWrite {
 
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket  = new ServerSocket(3333);
        Socket  socket = serverSocket.accept();   //establish the connection
        
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str="", str2="";
        while(!str.equals("stop")){
            //read the data from client
            str = dis.readUTF();
            System.out.println("Client says: "+str);
            
            //sending the reply to the client
            str2 = br.readLine();
            dos.writeUTF(str2);
            
            dos.flush();
        }
        dis.close();
        socket.close();
        serverSocket.close();
    }
    
}
