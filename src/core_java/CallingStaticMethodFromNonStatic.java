package core_java;

import static core_java.CallingStaticMethodFromNonStatic.a;

public class CallingStaticMethodFromNonStatic {

    static int a = 10;      // define a static variable

    void nonStaticMethod() {
        a = 20;           // reflect the value of static veriable..reflect in call object
        System.out.println("nonStaticMethod_1: " + a);

        staticMethod();    // calling to static_method in current class
        System.out.println("nonStaticMethod_2: " + a);
    }

    static void staticMethod() {
        a = 50;             // reflect the value of static veriable..reflect in call object
    }
}

class test {

    public static void main(String[] args) {
        CallingStaticMethodFromNonStatic c = new CallingStaticMethodFromNonStatic();
        System.out.println("mainMethod_1: " + a);
        c.nonStaticMethod();                   //make a call to nonStaticMethod() 
        System.out.println("mainMethod_2: " + a);
    }
}
