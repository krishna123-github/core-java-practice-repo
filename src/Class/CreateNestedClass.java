/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author krishna
 */
public class CreateNestedClass {

    // static member
    static int outer_x = 10;

    // instance(non-static) member - not accessable in nested class
    int outer_y = 20;

    // private member
    private static int outer_private = 30;

    // Inner class with static keyword called nested class
    static class NestedClass {

        void display() {
            // can access STATIC member of outer class
            System.out.println("outer_x = " + outer_x);

            // can access display private static member of outer class
            System.out.println("outer_private = " + outer_private);

            // The following statement will give compilation error
            // as static nested class cannot directly access non-static members
            // System.out.println("outer_y = " + outer_y);
        }
    }

    class InnerClass {

        void display() {
            // can access STATIC member of outer class
            System.out.println("outer_x = " + outer_x);

            // can access display private static member of outer class
            System.out.println("outer_private = " + outer_private);

            // as static nested class cannot directly access non-static members
            System.out.println("outer_y = " + outer_y);
        }
    }
}

class Test {

    public static void main(String[] args) {
        // Create nested class object without created object of OuterClass
        CreateNestedClass.NestedClass obj = new CreateNestedClass.NestedClass();
        obj.display();

        // Must to create OuterClass objet to create Inner Class object
        CreateNestedClass.InnerClass obj2 = new CreateNestedClass().new InnerClass();
        obj2.display();
    }
}
