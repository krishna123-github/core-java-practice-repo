 
package Collection_API_practice;
 
import java.util.ArrayList;

public class ArrayList_RemoveElement {
 
    public static void main(String[] args) {
         ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("java");
        arrayList.add("c");
        arrayList.add("c++");
        arrayList.add(".net");
        arrayList.add("perl");
        System.out.println("ArrayLIst " + arrayList);
        
        //remove by index
        arrayList.remove(2);
        System.out.println(arrayList);
        
        //remove by object
        arrayList.remove("c");
        System.out.println(arrayList);
        
        //remove all elemment of ArrayList
        arrayList.removeAll(arrayList);
        System.out.println(arrayList);
        //remove all element of List
        arrayList.clear();
        System.out.println(arrayList);
        
    }
    
}
