package contructorExample;
//(1) when there are default const in parent and there are no Default/param cont on child then-->
// parent class default cont. autometically call by its child class, autometically it add super();
//(2) another note-> if there a param const in parent class, then there should be default/param const in child 
// with super(x) keyword that make call to parenet class param cont.
// otherwise compiler generate the error here .

class A {

    A() {
        System.out.println("Default cons A");
    }

    A(int x) {
        System.out.println("cons A " + x);
    }

    public void test() {
        System.out.println("test A");
    }
}

class B extends A {


//     B() {
////        super(100);                // here make call to param contructor of parent class 
//        System.out.println("cons B");
//    }

    public void test() {
        super.test();             // here make ro test() of parent class 
        System.out.println("test B");
    }

}

public class Contructor_chaining {

    public static void main(String[] args) {
        // TODO code application logic here
        
        B b = new B();
        b.test();
    }

}
