/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contructorExample;
 
public class TestMyClass1 {
 
    public static void main(String[] args) {
        MyClassChild md = new MyClassChild();
        MyClassChild m = new MyClassChild(2);
        m.run(2);
    }
    
}
