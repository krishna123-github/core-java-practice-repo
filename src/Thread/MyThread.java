package Thread;

import java.util.concurrent.ExecutionException;

public class MyThread extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            } catch (Throwable e) {
//                System.out.println(e.getMessage());
//            }
        }
    }
}

class Test {

    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.start();

        for (int i = 20; i < 30; i++) {
            System.out.println(i);
//            
//            try{
//                Thread.sleep(1000);
//            }
//            catch(Exception e){
//                System.out.println(e.getMessage());
//            }
        }
    }
}
