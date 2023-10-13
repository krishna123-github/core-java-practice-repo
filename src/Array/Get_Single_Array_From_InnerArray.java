package Array;

import java.util.*;

public class Get_Single_Array_From_InnerArray {

    public static void main(String[] args) throws Exception {
        Object[] array = {1, 2, new Object[]{3, 4, new Object[]{5}, 6, 7}, 8, 9, 10};

        Integer[] flattenedArray = flatten(array);

        System.out.println(Arrays.toString(flattenedArray));
    }

    public static Integer[] flatten(Object[] inputArray) throws Exception {
        List<Integer> l = new ArrayList();
        return getArrayElement(inputArray, l);
    }

    private static Integer[] getArrayElement(Object[] inputArray, List<Integer> l) {
        for (int i = 0; i < inputArray.length; i++) {
            try {
                Integer ii = (Integer) inputArray[i];
                l.add(ii);
            } catch (Exception e) {
                getArrayElement((Object[])inputArray[i], l);
            }
        }

        return l.toArray(new Integer[l.size()]);
    }
}
