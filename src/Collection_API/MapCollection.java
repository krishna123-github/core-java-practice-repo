 
package Collection_API;

import java.util.Map;
import java.util.TreeMap;

 
public class MapCollection {
 
    public static void main(String[] args) {
        // TODO code application logic here
        Map<Integer, String> map = new TreeMap();
        
        map.put(1, "krishna");
        map.put(2, "pooja");
        map.put(3, "patel");
        map.put(4, "betu");
        
        System.out.println("All keys: "+map.keySet());
        System.out.println("All values: "+map.values());
        System.out.println("key 5 value: "+map.get(3));
        
//        System.out.println("First Key: "+map.remove(map.get(map)));
    }
    
}
