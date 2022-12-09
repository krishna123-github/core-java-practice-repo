/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object;

/**
 * Method overload - two method with different param -pass null while calling print method
 * @author krishna
 */
public class MethodCalling {
    public void print(Object s){
        System.out.println("Stiudent Object");
    }
    public void print(String s){
        System.out.println("String");
    }
    
    public void print(int s){    // If we uncommment this...Compilation error  - referent print is ambigeous
        System.out.println("int");
    }
}

class Test{
    public static void main(String[] args) {
        MethodCalling m = new MethodCalling();
        
        m.print(1);  // It will String because in Java Strinng is more specific then Object
    }
}
