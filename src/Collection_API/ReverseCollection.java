 
package Collection_API;
 
import java.util.*;

public class ReverseCollection {
 
    public static void main(String[] args) {
        String[] str = {"a","b","c","d","e","f"};
        
        List list = new ArrayList();                
        for(int i=0; i<str.length; i++){
            list.add(str[i]);
        }
        
        ListIterator iterator = list.listIterator();   //use to print the List in loop.. it called as iterator Loop
        System.out.println("Before Reverse : ");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        System.out.println("After Reverse: ");
        Collections.reverse(list);
        iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
}
