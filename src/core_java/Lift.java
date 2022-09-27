/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core_java;

 
public interface Lift {
    abstract int liftUp(int person , int choice, int floor);
    abstract int liftDown(int person , int choice, int floor);
}
