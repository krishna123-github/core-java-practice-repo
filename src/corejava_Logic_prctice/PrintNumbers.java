package corejava_Logic_prctice;

public class PrintNumbers {

    static int i, j, k, l = 0;

    public static void main(String[] args) {
        for (i = 1; i <= 5; i++) {

//            for (j = 5; j > i; j--) {
//                System.out.print(" ");
//            }
            System.out.println("");
            for (k = i;  k > 0; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

}
