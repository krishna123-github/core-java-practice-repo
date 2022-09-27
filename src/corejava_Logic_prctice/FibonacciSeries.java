package corejava_Logic_prctice;

import java.util.Scanner;

public class FibonacciSeries {
        
    public static void main(String[] args) {
        int a = 1 , b = 1, c ;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter any number = ");
        int nTerms = kb.nextInt();
        System.out.println("a "+a);
        System.out.println("b "+b);
        for(c = 2 ; nTerms>=c; c=a+b){
//            c = a+b;
            a = b;
            b = c;
            System.out.println(c);
        }
//        System.out.println(c);
    }

}
