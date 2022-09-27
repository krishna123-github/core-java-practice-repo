 
package Collection_API_practice;
 
import java.util.ArrayList;

public class ArrayList_InsertElements {
 
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        //inserting element at End of List
        arrayList.add("java");
        arrayList.add("c");
        arrayList.add("c++");
        arrayList.add(".net");
        arrayList.add("perl");
        System.out.println("ArrayLIst " + arrayList);
        
        //inserting element at middle
        arrayList.add(2, "Spring");
        System.out.println(arrayList);
        
        //Inserting element at first
        arrayList.add(0, "devope");
        System.out.println(arrayList);
    }
    
}
