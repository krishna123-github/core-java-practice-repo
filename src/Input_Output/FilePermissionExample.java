 
package Input_Output;
 
import java.io.*;
import java.security.PermissionCollection;

public class FilePermissionExample {
 
    public static void main(String[] args) {
        String str = "D:\\test1.txt";
        FilePermission filePermission = new FilePermission("D:\\-", "read");
        
        PermissionCollection permission = filePermission.newPermissionCollection();
        
        permission.add(filePermission);
        
        FilePermission filePermission2 = new FilePermission(str, "write");
        permission.add(filePermission2);
        
        if(permission.implies(new FilePermission(str, "read,write"))){
            System.out.println(" permission granted "+str); 
        }else
        System.out.println("No permission ");
    }
    
}
