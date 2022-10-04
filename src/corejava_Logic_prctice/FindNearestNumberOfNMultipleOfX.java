/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corejava_Logic_prctice;

/**
 * find the nearest number of n. nearest number should be multiple of 7
 *
 * @author krishna
 */
public class FindNearestNumberOfNMultipleOfX {

    public static void main(String[] args) {
        Integer n = 15;
        Integer x = 6;

        Integer result = n / x;
        System.out.println(result);

        Integer remder = n % x;
        System.out.println(remder);

        if (remder >= 4) {
            result += 1;
        }

        System.out.println(x * result);
        
        
        System.out.println(closestMultiple(n, x));

    }

    // Function to calculate the closest multiple
    static int closestMultiple(int n, int x) {
        if (x > n) {
            return x;
        }

        n = n + x / 2;    //Smaller value 14 + 3               greater value  17 + 3
        n = n - (n % x);  //              17 - (5)                            20 - (2)
        return n;         //              12                                  18 
    }
}
