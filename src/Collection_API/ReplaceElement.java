 
package Collection_API;

import java.util.*;
 
 
public class ReplaceElement {
 
    public static void main(String[] args) {
        
        String str = "one two three four five six seven";
        List list = Arrays.asList(str.split(" "));
        
        System.out.println("Before Replace: "+list);
        
        Collections.replaceAll(list, "six", "hundrad");
        
        System.out.println("After Replace : "+list);
        
//        String str2 =  str.replaceAll("s", "-------");   //str.replaceAll(Character.toString('s'), "-----");
//        System.out.println("str2 : "+str2);
    }
    
}
