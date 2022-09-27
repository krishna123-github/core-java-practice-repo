package Collection_API;

import java.util.*;

public class UseCollection {

    public static void main(String[] args) {
        System.out.println("Array List");
        List arrlist = new ArrayList();
        arrlist.add("1");
        arrlist.add("4");
        arrlist.add("2");
        arrlist.add("3");
        displayAll(arrlist);

        System.out.println("Vector List");
        List vecList = new Vector();
        vecList.add("1");
        vecList.add("4");
        vecList.add("2");
        vecList.add("3");
        displayAll(vecList);

        System.out.println("Hash Set");
        Set hashSet = new HashSet();
        hashSet.add("1");
        hashSet.add("4");
        hashSet.add("2");
        hashSet.add("3");
        displayAll(hashSet);

        System.out.println("Tree Set");
        Set treeSet = new TreeSet();
        treeSet.add("1");
        treeSet.add("4");
        treeSet.add("2");
        treeSet.add("3");
        displayAll(treeSet);

        System.out.println("LinkedHashSet ");
        Set linHasSet = new LinkedHashSet();
        linHasSet.add("1");
        linHasSet.add("4");
        linHasSet.add("2");
        linHasSet.add("3");
        displayAll(linHasSet);

        System.out.println("HashMap");
        Map hashmap = new HashMap();
        hashmap.put("1", "1");
        hashmap.put("2", "4");
        hashmap.put("3", "2");
        hashmap.put("4", "3");
        displayAll(hashmap.values());

        System.out.println("TreeMap");
        Map treeMap = new TreeMap();
        treeMap.put("1", "1");
        treeMap.put("2", "4");
        treeMap.put("3", "2");
        treeMap.put("4", "3");
        displayAll(treeMap.values());

        System.out.println("LinkedHashMap");
        Map linhasMap = new LinkedHashMap();
        linhasMap.put("1", "1");
        linhasMap.put("2", "4");
        linhasMap.put("3", "2");
        linhasMap.put("4", "3");
        displayAll(linhasMap.values());
    }

    private static void displayAll(Collection col) {
        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-----------------------------------------------------------");
    }
    
//    
//    // it will not work here...CTE....only for hashTable
//      private static void displayAll(Collection col) {
//        Enumeration enumeration = (Enumeration) col.iterator();
//        while (enumeration.hasMoreElements()) {
//            System.out.println(enumeration.nextElement());
//        }
//        System.out.println("-----------------------------------------------------------");
//    }

}
