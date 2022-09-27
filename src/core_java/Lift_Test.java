package core_java;
import java.util.Scanner;

public class Lift_Test {

    static int floor = 0, choice, person = 0;

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Lift is now  on floor: " + floor);
        System.out.print("Which floor are you now(0-10) where 0 = basement: ");
        choice = kb.nextInt();

        if (floor == choice) {
            System.out.println("Enter the Lift: ");
        } else if (floor > choice) {
            floor = new Lift_Control().liftDown(person, choice, floor);
        } else if (floor < choice) {
            floor = new Lift_Control().liftUp(person, choice, floor);
        }

        System.out.println("Which floor do you want t go (0-10): ");
        choice = kb.nextInt();

        if (floor > choice) {
            floor = new Lift_Control().liftDown(person, choice, floor);
        } else if (floor < choice) {
            floor = new Lift_Control().liftUp(person, choice, floor);
        }
    }

}
