package Thread;

import static java.lang.Thread.sleep;

class TickitBooking implements Runnable {

    int available;

    public TickitBooking(int available) {     //alloacating value to the available 
        this.available = available;
    }

    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        String name = ct.getName();
        booking(name);
    }

//               private void booking(String name) {    // it Asynchronous - not have any prefix
    private void booking(String name) {    // it Synchronous  - hava synchronized prefix in mathod
        System.out.println("Available Chaeck for: " + name + ",   available: " + available);

        synchronized (this) {
            if (available >= 1) {
                System.out.println("Booking start for name: " + name);
                try {
                    sleep(2000);
                } catch (Exception e) {
                    System.out.println("Error in boOking");
                }
                available = available - 1;
                System.out.println("Booking Complete");
            } else {
                System.out.println("No tikit is Available     e for: " + name);
            }
        }
    }
}

public class TestThreadBooking {

    public static void main(String[] args) {
        TickitBooking booking = new TickitBooking(1);
        Thread t1 = new Thread(booking);
        Thread t2 = new Thread(booking);
        t1.setName("Krishna");
        t2.setName("Amit");
        t1.start();
        t2.start();
    }

}
