package Thread;

class Q extends Thread {

    public void run() {
        System.out.println("Q Thread Priority: " + getPriority());
    }
}

public class SettingPriority {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();   // correct way to set priority
        t.setPriority(8);

        Q q = new Q();      
        q.start();
//        Thread t1 = new Thread(q);      // wrong way to set priority
//        t1.setPriority(2);

    }

}
