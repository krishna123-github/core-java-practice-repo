package Thread;

class C implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }

}

class D implements Runnable {

    @Override
    public void run() {
        for (int i = 20; i < 30; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }

}

public class ThraedWithRunnableInterface {

    public static void main(String[] args) {
        C c = new C();
        D d = new D();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(d);
        t1.start();
        t2.start();
        
        for (int i = 40; i < 50; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }

}
