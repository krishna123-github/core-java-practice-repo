 
package Collection_API;
 
import java.util.*;
import java.util.ArrayList;

public class CollectionToArray {
 
    public static void main(String[] args) {
       
        List<String> list = new ArrayList();
        
        list.add("krishna");
        list.add("patel");
        list.add("pooja");
        list.add("patel");
        
        String[] str =  list.toArray(new String[0]);
        
        for(String s : str){
            System.out.println(s);
        }
        
      // wrong way  
//         List<Integer> list2 = new ArrayList();
//        
//        list2.add(2);
//        list2.add(4);
//        list2.toArray(int[]);
    }
    
}
