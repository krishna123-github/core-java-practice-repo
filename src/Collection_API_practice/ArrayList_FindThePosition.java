 
package Collection_API_practice;
 
import java.util.ArrayList;

public class ArrayList_FindThePosition {

    
    public static void main(String[] args) {
       
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("java");
        arrayList.add("c");
        arrayList.add("c++");
        arrayList.add(".net");
        arrayList.add("perl");
        
        System.out.println("Array list: "+arrayList);
        
        int index = arrayList.indexOf(".net");
        System.out.println("Index: "+index);
    }
    
}
