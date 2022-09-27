 
package Collection_API_practice;
 
import java.util.ArrayList;

public class ArrayList_ConvertToArray {

   
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("java");
        arrayList.add("c");
        arrayList.add("c++");
        arrayList.add(".net");
        arrayList.add("perl");
        System.out.println("ArrayLIst "+arrayList);
        
        Object[] o = arrayList.toArray();
        System.out.println("Array "+o.toString());
        for(Object s : o){
            System.out.println((String)s);
        }
    }
    
}
