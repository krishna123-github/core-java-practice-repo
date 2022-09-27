 package Networking;

import java.io.*;
import java.net.Socket;

 public class MyClient_ReadWrite {
 
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 3333);
        
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str="", str2="";
        while(!str.equals("stop")){
            // writing to the  server
            str = br.readLine();
            dos.writeUTF(str);
            dos.flush();
            
            str2 = dis.readUTF();
            System.out.println("Server says: "+str2);
            
        }
        
        dis.close();
        dos.close();
        socket.close();
        br.close();
                
    }
    
}
