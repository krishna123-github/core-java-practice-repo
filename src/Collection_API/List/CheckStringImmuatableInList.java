package Collection_API.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * List we are passing List of string to another method and there updating value
 * of the some index...then see the behavior
 *
 * @author krishna
 */
public class CheckStringImmuatableInList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("krishna");
        updateList1(list);
        System.out.println("Main method ============");
        System.out.println(list);

        updateImmutableList1(list);
        System.out.println("Main immutable method ============");
        System.out.println(list);

    }

    private static void updateList1(List l) {
        System.out.println(l.get(0));
        l.set(0, "Patel");
        System.out.println("Update List method ============");
        System.out.println(l);
    }

    /**
     * After chnaging list to unmodifiableList . 
     * If you will try to modify list - it will trow RTE java.lang.UnsupportedOperationException
     * 
     * @param l 
     */
    private static void updateImmutableList1(List l) {
        System.out.println(l.get(0));
        l = Collections.unmodifiableList(l);
        // If yu will try to modify list - it will trow RTE java.lang.UnsupportedOperationException
        l.set(0, "Rahul");
        System.out.println("Update List method to Rahul ============");
        System.out.println(l);
    }
}
