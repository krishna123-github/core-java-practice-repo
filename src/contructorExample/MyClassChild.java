 
package contructorExample;
 
public class MyClassChild extends MyClass{

    public MyClassChild() {
        super();
        System.out.println("MyClassChild default contructor");
    }

    
    public MyClassChild(int a) {
        super(a);
    }
    
    void run(int a){
//        super();
        
        System.out.println("run()");
    }
}
