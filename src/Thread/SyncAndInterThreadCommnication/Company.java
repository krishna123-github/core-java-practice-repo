/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thread.SyncAndInterThreadCommnication;

/**
 *
 * @author krishna
 */
public class Company {

    int n;
    boolean isProduce = false;

    public synchronized void produce_item(int n) {
        if (isProduce) {  // true
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.n = n;
        System.out.println("Produce ==> " + n);
        
        notify();
        isProduce = true;
    }

    public synchronized int consume_item() {
        if (!isProduce) {   // !false
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("Consume ====> " + this.n);
        
        notify();
        isProduce = false;
        
        return this.n;
    }
}
