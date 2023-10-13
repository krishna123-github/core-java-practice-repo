package Array;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Delete_Array {

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        Integer[] b = new Integer[a.length - 1];
        int index = 3;
        int i = 0;
        while (i < a.length - 1) {
            if (i < index) {
                b[i] = a[i];
            } else {
                b[i] = a[i + 1];
            }
            i++;
        }
        for (int j : b) {
            System.out.println(j);
        }

        /**
         * Usiing Java-8
         */
        System.out.println("Using Java 8");
        int[] arr = IntStream.range(0, a.length)
                .filter((j) -> j != index)
                .map((j) -> a[j])
                .toArray();

        for (int n : arr) {
            System.out.println(n);
        }

//        System.out.println("Using Java 8 --2");
//        int[] arr2 = Arrays.stream(a).filter((j) -> j != index)
//                .map((j) -> a[j])
//                .toArray();
//        for (int n : arr2) {
//            System.out.println(n);
//        }

        System.out.println("Using ArrayList");
        List l = Arrays.asList(a);
        l.remove(index);

        Object[] bb = l.toArray();
        for (Object n : bb) {
            System.out.println(n);
        }
    }

}
