package corejava_Logic_prctice;

import java.util.Scanner;

public class FibanacciSeries2 {

    int nterms = 8, i;

    void series() {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Enter any Number : ");
//        nterms = kb.nextInt();
        for (i = 0; i < nterms; i++) {
            System.out.println(fab(i));
        }
        System.out.println();
    }

    int fab(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return (fab(n - 1) + fab(n - 2));
    }
}

class Test {

    public static void main(String[] args) {
        FibanacciSeries2 fs = new FibanacciSeries2();
        fs.series();
    }
}
