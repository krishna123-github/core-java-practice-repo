package corejava_Logic_prctice;

public class StarNumber {

    static int i, j, k, l;

    public static void main(String[] args) {
        for (i = 1; i <= 5; i++) {
            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (l = i; l > 0; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }

}
