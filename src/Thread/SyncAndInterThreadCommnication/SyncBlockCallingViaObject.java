/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thread.SyncAndInterThreadCommnication;

/**
 *
 * @author krishna
 */
public class SyncBlockCallingViaObject {

    public static void main(String[] args) {
        try {
            A o1 = new A();
            A o2 = new A();

            o1.m1(); //

            o2.m1(); //thread2 
        } catch (Exception e) {
        }
    }
}

class A {
    public synchronized void m1() throws InterruptedException {
        System.out.println(" "+this.hashCode());
        Thread.sleep(5000);
    }
}
