 
package Collection_API_practice;
 
import java.util.ArrayList;

public class ArrayList_ReplaceAnElement {
 
    public static void main(String[] args) {
        // TODO code application logic here
          ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("java");
        arrayList.add("c");
        arrayList.add("c++");
        arrayList.add(".net");
        arrayList.add("perl");
        System.out.println("ArrayLIst " + arrayList);
        
        arrayList.set(3, "python");
        System.out.println(arrayList);
    }
    
}
