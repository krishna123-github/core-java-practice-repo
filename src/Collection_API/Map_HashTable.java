 
package Collection_API;
 
import java.util.*;

public class Map_HashTable {
 
    public static void main(String[] args) {
        // TODO code application logic here
        Hashtable hashtable =  new Hashtable();
        hashtable.put("1", "One");
        hashtable.put("2", "Two");
        hashtable.put("3", "Three");
        
        
        Enumeration e = hashtable.elements();
        
         while (e.hasMoreElements()) {
         System.out.println(e.nextElement());
      }
    }
    
}
