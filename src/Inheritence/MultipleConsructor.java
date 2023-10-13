/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritence;

/**
 *
 * @author krishna
 */
public class MultipleConsructor {

    public static void main(String[] args) {
        BB b = new BB();
        b.disp();
    }
}

class AA {

    private int i = 10;
//
//    AA() {
//        System.out.println("A");
//    }
//
//    AA(int i) {
//        System.out.println("A (i)");
//    }

}

class BB extends AA {

    BB() {
      //  super(4);
        System.out.println("B");
    }

    public void disp() {
        System.out.println("Display");
    }
}
