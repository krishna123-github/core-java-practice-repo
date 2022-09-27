package sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {10, 34, 2, 56, 7, 67, 88, 42};
        System.out.println("BEFORE Sorting ");
        for (int b : a) {
            System.out.print("  " + b);
        }

        System.out.println("");
        System.out.println("==============================");
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println("Starting Index and Value a[" + i + "]  = " + a[i]);
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    System.out.println("swap ==> " + a[i] + "  > " + a[j]);
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }

            }
            for (int b : a) {
                System.out.print("  " + b);
            }
            System.out.println("");
            System.out.println("--------------------");
        }
        for (int b : a) {
            System.out.println("sorted aaray");
            System.out.print("  " + b);
        }

    }

}
