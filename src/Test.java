import java.util.*;

class Test {

    public static void ravi(String[] args) {
        int d1, d2, d3, min;
        
       
        Scanner scan = new Scanner(System.in);
        System.out.println("enter distace to shop1");
        d1 = scan.nextInt();
        System.out.println("enter distance to shop2");
        d2 = scan.nextInt();
        System.out.println("enter distance between two shops");
        d3 = scan.nextInt();
        

        int a = 2 * (d1 + d3);
        int b = 2 * (d1 + d2);
        int c = d1 + d2 + d3;
        int d = 2 * (d2 + d3);
        if (a <= b && a <= c && a <= d) {
            min = a;
            System.out.println("min distance is :" + min);
        } else if (b <= a && b <= c && b <= d) {
            min = b;
            System.out.println("min distance is :" + min);
        } else if (c <= a && c <= b && c <= d) {
            min = c;
            System.out.println("min distance is :" + min);
        } else {
            min = d;
            System.out.println("min distance is :" + min);
        }
    }
}
