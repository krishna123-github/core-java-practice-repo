package corejava_Logic_prctice;

public class FactorialByRecursion {

    int fact(int n) {
        if (n == 1) {
            return 1;
        }
        int result = 1;

        result = fact(n - 1) * n;
        return result;
    }
    int factWithRec(int n){
        int fact = 1;
        while(n > 0){
            fact = fact * n;
            n = n-1;
        }
        return fact;
    }
}

class TestFact {

    public static void main(String[] args) {
        FactorialByRecursion f = new FactorialByRecursion();

        System.out.println(f.fact(5)); // factorial = 5 * 4 * 3 * 2 * 1 = 120
        System.out.println(f.factWithRec(5)); // factorial = 5 * 4 * 3 * 2 * 1 = 120

    }
}
