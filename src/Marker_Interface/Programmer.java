 
package Marker_Interface;

 
public class Programmer implements Emp, Expert, Intelligent{

    @Override
    public void doTask() {
        System.out.println("Task Perform by Expert Programmer");
    }
    
}
