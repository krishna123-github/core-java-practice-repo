/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core_java;

/**
 *
 * @author krishna pal
 */
public class Lift_Control implements Lift{

    @Override
    public int liftUp(int person, int choice, int floor) {
        for(person = choice; choice >= floor ; ++floor){
            System.out.println(floor);
        }
        System.out.println(floor+"---->Lift has Arrived");
        return floor;
    }

    @Override
    public int liftDown(int person, int choice, int floor) {
        for(person = choice; choice <= floor; --floor){
            System.out.println(floor);
        }
        System.out.println(floor+"---->Lift has Arrived");
        return floor;
    }


    
}
