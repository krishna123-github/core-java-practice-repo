class A {

    public float method(float a, float b) {
        float sum = a + b;
        return sum;
    }
}

public class ClassCastException {
    
    public static void main(String[] args) {
        // TODO code application logic here
        A a = new A();
        float sum = a.method(7.3f, 2.2f);
        System.out.println(sum);
    }

}
