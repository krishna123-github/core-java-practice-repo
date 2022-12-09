/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritence;

/**
 *
 * @author krishna
 */
class A {

    public void display() {
        System.out.println("class A display() method called");
    }
}

class B extends A {

    @Override
    public void display() {
        System.out.println("class B display() method called");
    }
}

class C extends A {

    @Override
    public void display() {
        System.out.println("class C display() method called");
    }
}

//not supported in Java   - extends 2 classes - called multiple inheritence
//public class TestDiamondIssue extends B,C   {
public class MultipleClassTest extends B  {

    public static void main(String args[]) {
        MultipleClassTest d = new MultipleClassTest();
        //creates ambiguity which display() method to call  
        d.display();
    }
}
