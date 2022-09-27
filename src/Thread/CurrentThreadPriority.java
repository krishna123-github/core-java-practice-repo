
package Thread;

public class CurrentThreadPriority {

    public static void main(String[] args) {
       Thread t = Thread.currentThread();
        System.out.println("Current Threade: "+t.getPriority());
       
    }
    
}
