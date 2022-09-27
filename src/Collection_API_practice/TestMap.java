 
package Collection_API_practice;
 
import java.util.HashMap;

public class TestMap {
 
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String,Integer>();
        hashMap.put("raj", 45547);
        hashMap.put("Amit", 757);
        hashMap.put("ranu", 878677);
        hashMap.put("aunny", 45354);
        
        System.out.println(hashMap);
        System.out.println(hashMap.get("ranu"));
        
    }
    
}
