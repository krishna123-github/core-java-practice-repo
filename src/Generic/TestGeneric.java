package Generic;

/**
 * Adv - Type sefty
 * <T> this means generic type---class ke sath lagaya to class genetic ho jayegi
 * or method ke sath lagaya to method generic ho jayega
 *
 * @author krishna
 */
// Test Generic class
class Demo<T> {

    T obj;

    public Demo(T t) {
        this.obj = t;
    }

    public T displayValue() {
        return obj;
    }

    // Generic method
    public <T> void genericMethod(T t) {
        System.out.println("genericMethod = " + t);
    }

    public void nonGenericMethod(Object t) {
        System.out.println("nonGenericMethod = " + t);
    }
}

public class TestGeneric {

    public static void main(String[] args) {
        /**
         * 1. Generic Class - Object create of Generic class by passing Type
         */
        Demo<Integer> d = new Demo<Integer>(70);
        System.out.println(d.displayValue());

        Demo<String> d2 = new Demo<String>("Krishna");
        System.out.println(d2.displayValue());

        //  It will give CTE - Incompatible type
//        d = d2;
        /**
         * 2. Call Generic Method
         */
        d.genericMethod(60);
        d.genericMethod("Patel");
        d.nonGenericMethod("Patel");
        d.nonGenericMethod(55);
    }
}
/**
 * Programs that use Generics has got many benefits over non-generic code. * 1.
 * Code Reuse: We can write a method/class/interface once and use it for any
 * type we want.
 *
 * 2. Type Safety: Generics make errors to appear compile time than at run time
 * (It’s always better to know problems in your code at compile time rather than
 * making your code fail at run time). Suppose you want to create an ArrayList
 * that store name of students, and if by mistake the programmer adds an integer
 * object instead of a string, the compiler allows it. But, when we retrieve
 * this data from ArrayList, it causes problems at runtime.
 *
 *
 */
