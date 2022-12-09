 
package Collection_API;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

 
public class CompareElement {
 
    public static void main(String[] args) {
        // TODO code application logic here
        String[] str = {"keishna","duraj","ritesh","sanjay","raj", "Puraj"};
        
        Set set = new TreeSet();
        for(int i=0; i<str.length; i++){
            set.add(str[i]);
        }
        
        /**
         * Get MIN sting from SET of String
         */
        System.out.println(Collections.min(set));
        System.out.println(Collections.min(set, String.CASE_INSENSITIVE_ORDER));
        
        System.out.println("------------------");
        
        /**
         * Get MAX sting from SET of String
         */
        System.out.println(Collections.max(set));
        System.out.println(Collections.max(set,String.CASE_INSENSITIVE_ORDER));
    }
    
}
