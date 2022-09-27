
package Thread;

class A extends Thread{
  public  void run(){
      for(int i=0; i<10; i++){
          System.out.println(i);
      }
  }
}
class B extends Thread{
    public void run(){
        for(int i=20; i<30; i++){
            System.out.println(i);
        }
    }
}

public class ThreadWithoutRunnableInterface extends Thread{
     public static void main(String[] args) {
        A a = new A();
        B b = new B();
        
        a.start();
        b.start();
        
        for(int i=40; i<50; i++){
            System.out.println(i);
        }
    }
}