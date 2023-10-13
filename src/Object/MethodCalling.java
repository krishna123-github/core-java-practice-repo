/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object;

/**
 * Method overload - two method with different param -pass null while calling
 * print method
 *
 * @author krishna
 */
public class MethodCalling {

    public void print(Object s) {
        System.out.println("Stiudent Object");
    }

    public void print(String s) {
        System.out.println("String");
    }

    public void print(int i) {    // 
        System.out.println("int");
    }

    public void print(Integer i) {    // 
        System.out.println("Integer");
    }

    public void print(long l) {    //
        System.out.println("long");
    }

    // Compile time error - 
    public void print(int i, long l) {    //
        System.out.println("int , long");
    }
//
//    public void print(long l, int i) {    //
//        System.out.println("long, int");
//    }

    public void print(int i, int i2) {    //
        System.out.println("int , long");
    }

    public void print(int i, Long L) {    //
        System.out.println("int , Long");
    }

    public void print(Long L, int i) {    //
        System.out.println("Long, int");
    }
}

class Test {

    public static void main(String[] args) {
        MethodCalling m = new MethodCalling();
        // here may be CTE if one method (Integer) and Second is (String)
//        m.print(null);  // String
        m.print(1);  // int
        m.print(Integer.valueOf(1));  // Integer
        m.print(1l); // long add l

        // it gives preference to Long
        m.print(1, 1);  // CTE - confuse no suitable method found
        m.print(1, 1l); // Need to add suffix l  after value
    }
}
