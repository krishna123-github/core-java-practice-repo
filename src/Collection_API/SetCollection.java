package Collection_API;

import java.util.*;

public class SetCollection {

    public static void main(String[] args) {
        String[] str = {"a", "b", "c", "d", "e", "f"};

        Set set = new HashSet();

        for (int i = 0; i < str.length; i++) {
            set.add(str[i]);
        }

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----------------------");
        
        int size = set.size();
        
        if(set.isEmpty()){
            System.out.println("Collection is Empty: ");
        } else{
            System.out.println("Collection size: "+size);
        }
        System.out.println("");
        
    }

}
