package Collection_API_practice;

import java.util.ArrayList;

public class ArrayList_RetriveElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("java");
        arrayList.add("c");
        arrayList.add("c++");
        arrayList.add(".net");
        arrayList.add("perl");
        System.out.println("ArrayLIst " + arrayList);

       String s = arrayList.get(2);
        System.out.println(s);
    }

}
