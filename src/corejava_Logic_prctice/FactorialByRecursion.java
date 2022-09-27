package corejava_Logic_prctice;

public class FactorialByRecursion {

    int fact(int n) {
        int result = 1;
        if (n == 1) {
            return 1;
        }

        result = fact(n - 1) * n;
        return result;
    }
}

class TestFact {

    public static void main(String[] args) {
        FactorialByRecursion f = new FactorialByRecursion();

        System.out.println(f.fact(5));

    }
}
