/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thread.SyncAndInterThreadCommnication;

/**
 *
 * @author krishna
 */
public class Consumer extends Thread {

    Company c;
    private int i = 0;

    public Consumer(Company c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (i++ < 10) {
            c.consume_item();
            try{
                Thread.sleep(1000);
            }catch(Exception e){
            }
        }
    }
}
