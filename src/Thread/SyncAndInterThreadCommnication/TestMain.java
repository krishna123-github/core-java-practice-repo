/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thread.SyncAndInterThreadCommnication;

/**
 *
 * @author krishna
 */
public class TestMain {
    public static void main(String[] args) {
        
        Company c = new Company();
        Producer prod = new Producer(c);
        Consumer cons = new Consumer(c);
        
        prod.start();
        cons.start();
    }
}
