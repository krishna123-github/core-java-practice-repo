package corejava_Logic_prctice;

public class PascalTraingleNumber {

    public static void main(String[] args) {
        int i, j, k, number = 1;
        for (i = 0; i < 5; i++) {
            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }
           
            for (k = 0; k <= i; k++) {
                System.out.print(number + " ");
                number = number + ((i - j) / (j + 1));
            }
            System.out.println();
        }
    }

}
