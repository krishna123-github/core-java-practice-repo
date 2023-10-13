package Inheritence;

/**
 *
 * @author krishna
 */
interface A {

    public default void run() {
        System.out.println("A default");
    }
}

interface B {

    public default void run() {
        System.out.println("B default");
    }
}

// If both interface have default method then implemented class will throw CTE  - Multiple inheritense
// Resolution - @override deafult method here
class TestImpl implements A, B {

    @Override
    public void run() {          // Removed deafult keyword - If class implememted
        A.super.run();
        B.super.run();
        System.out.println("B default");
    }
}

interface TestImpl2 extends A, B {

    @Override
    public default void run() {   // Add deafult keyword -- If interface implement
        A.super.run();
        B.super.run();
        System.out.println("B default");
    }
}

public class MultipleInterfaceWithDeafultMethodTest {

    public static void main(String[] args) {

    }
}
