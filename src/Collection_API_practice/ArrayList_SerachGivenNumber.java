 
package Collection_API_practice;
 
import java.util.ArrayList;

public class ArrayList_SerachGivenNumber {
 
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(213);
        arrayList.add(215);
        arrayList.add(26);
        arrayList.add(217);
        arrayList.add(219);
        
        System.out.println("print list:  "+arrayList);
        
        Boolean b = arrayList.contains(26);
        System.out.println(b);
    }
    
}
