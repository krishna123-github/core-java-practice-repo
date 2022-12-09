/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thread.SyncAndInterThreadCommnication;

/**
 *
 * @author krishna
 */
public class Producer extends Thread{
    Company c ;
    private int i = 0 ;

    public Producer(Company c) {
        this.c = c;
    }

    @Override
    public void run() {
        int n = 1;
        while (i++ < 10) {           
            c.produce_item(n);
            try{ 
                Thread.sleep(3000);
            }catch(Exception e){
                System.out.println("failed to sleep After produce item");
            }
            n++;
        }
    }
}
