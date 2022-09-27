 
package Collection_API_practice;
 
import java.util.*;

public class ArrayList_joinTwoArrayList {

   
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("java");
        arrayList1.add("c");
        arrayList1.add("c++");
        arrayList1.add(".net");
        arrayList1.add("perl");
        System.out.println("ArrayLIst " + arrayList1);
        
         ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("A");
        arrayList2.add("B");
        arrayList2.add("C++");
        arrayList2.add("D");
        arrayList2.add("E");
        System.out.println("ArrayLIst " + arrayList2);
        
        //join two Array List..both are String ArrayList
        arrayList1.addAll(arrayList2);
        System.out.println("join: "+arrayList1);
        
        //Insert List1 to the perticular index of list2
        arrayList1.addAll(3, arrayList2);
        System.out.println(arrayList1);
        
        
//         ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        arrayList.add(2);
//        arrayList.add(4);
//        arrayList.add(6);
//        arrayList.add(7);
//        arrayList.add(9);
//        System.out.println("ArrayLIst " + arrayList);
        
        //join two Array List..one String and another Integer...Cmplile time error
//        arrayList1.addAll(arrayList);
//        System.out.println("join2: "+arrayList);
    }
    
}
