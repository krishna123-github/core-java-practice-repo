
package Thread;

public class TestPriority {

    public static void main(String[] args) {
        Thread t =  Thread.currentThread();
        System.out.println("name, priority, Thread group = "+t);
        System.out.println("Min: "+Thread.MIN_PRIORITY);
        System.out.println("Max: "+Thread.MAX_PRIORITY);
        System.out.println("Normal: "+Thread.NORM_PRIORITY);
    }
    
}
