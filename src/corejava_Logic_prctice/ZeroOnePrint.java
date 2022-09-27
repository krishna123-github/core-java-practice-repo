package corejava_Logic_prctice;

public class ZeroOnePrint {

    static int i, j;

    public static void main(String[] args) {
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

}
