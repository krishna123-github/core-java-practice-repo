
package Collection_API.List;

import java.util.ArrayList;
import java.util.List;

/**
 * List we are passing List of string to another method and there updating value of the some index...then see the behavior 
 * @author krishna
 */
public class CheckStringImmuatableInList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("krishna");
        updateList1(list);
        System.out.println("Main method ============");
        System.out.println(list);
    }

    private static void updateList1(List l) {
        System.out.println(l.get(0));
        l.set(0, "Patel");
        System.out.println("Update List method ============");
        System.out.println(l);
    }
}
