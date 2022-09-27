/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marker_Interface;

public class Tester implements Emp, Expert{

    @Override
    public void doTask() {
        System.out.println("Task perform by Expert Tester");
    }
    
}
