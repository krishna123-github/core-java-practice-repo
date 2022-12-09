package Inheritence;

/**
 *
 * @author krishna
 */
interface MyInterface1 {

    public default void display() {
        System.out.println("1 myInterface Display");
    }
}

interface MyInterface2 {

    public default void display() {
        System.out.println("2 myInterface Display");
    }
}

public class ResolveDiamondIssueTest implements MyInterface1, MyInterface2 {

    @Override
    public void display() {
        MyInterface1.super.display(); // Ese default method ko call karege
        MyInterface2.super.display(); // Ese default method ko call karege
        System.out.println("3 ResolveDiamondIssueTest Display");
    }

    public static void main(String[] args) {
        ResolveDiamondIssueTest obj = new ResolveDiamondIssueTest();
        obj.display();
    }
}

// PROBLEM 1 - We cant extends 2 classes in Java - Diamonds issue is created here.
//class A {
//    private void run() {
//
//    }
//}
//
//class B {
//    private void eat() {
//
//    }
//}
//class C extends A , B{
//    
//}
//
//
// PROBLEM 2 - Interface ccan extends twol interfaces
interface A {
    public void run();
}

interface B {
    public void run();
}

interface c extends A, B {

}
