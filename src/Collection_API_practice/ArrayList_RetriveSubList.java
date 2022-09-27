 
package Collection_API_practice;
 
import java.util.*;

public class ArrayList_RetriveSubList {
 
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("java");
        arrayList.add("c");
        arrayList.add("c++");
        arrayList.add(".net");
        arrayList.add("perl");
        System.out.println("ArrayLIst " + arrayList);
        
        List<String> sublist= arrayList.subList(2,4);
        System.out.println("sub list: "+sublist);
    }
    
}
