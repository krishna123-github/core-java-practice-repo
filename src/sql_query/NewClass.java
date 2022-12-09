/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql_query;

/**
 *
 * @author krishna
 */
public class NewClass {

    public int recursiveMeth(int n) {

        while (n != 0) {
            return 1;
        }
        return recursiveMeth(n--);
    }
}

class Testt {

    public static void main(String[] args) {
        NewClass obj = new NewClass();
        System.out.println(obj.recursiveMeth(5));;
    }
}
