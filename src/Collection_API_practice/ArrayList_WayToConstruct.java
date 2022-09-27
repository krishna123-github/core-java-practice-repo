package Collection_API_practice;

import java.util.*;

public class ArrayList_WayToConstruct {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>(20);
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>(arrayList);
        
        System.out.println(arrayList.size());
        System.out.println(arrayList1.size());
        System.out.println(arrayList2.size());
    }

}
