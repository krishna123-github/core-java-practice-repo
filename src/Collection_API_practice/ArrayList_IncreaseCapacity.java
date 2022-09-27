package Collection_API_practice;

import java.util.*;

public class ArrayList_IncreaseCapacity {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        // to increase the capacity to ArrayList
        arrayList.ensureCapacity(40);
        System.out.println(arrayList.size());
        
        arrayList.add(212);
        arrayList.add(213);
        arrayList.add(214);
        arrayList.add(215);
        
        // to decrease the capacity of ArrayList
        arrayList.trimToSize();
        System.out.println(arrayList.size());    // find the number of  element preasent in Arrayalist
    }

}
