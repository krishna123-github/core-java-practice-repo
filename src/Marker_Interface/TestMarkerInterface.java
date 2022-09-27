/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marker_Interface;
 
public class TestMarkerInterface {
 
    public static void main(String[] args) {
        
        Emp[] emp = {new Programmer(), new Tester(), new Programmer(), new Tester()};
        
        for(Emp e : emp){
            if(e instanceof Expert & e instanceof Intelligent){
                e.doTask();
            }
        }
    }
    
}
