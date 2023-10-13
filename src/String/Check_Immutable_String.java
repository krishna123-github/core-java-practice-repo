/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author krishna
 */
public class Check_Immutable_String {

    public static void main(String[] args) {
        String str = "Krishna";
        System.out.println("krishna hash " + str.hashCode());
        
        checkString(str);
        System.out.println("main() str = " + str +"   hash "+str.hashCode());

        int a = 10;
        checkInt(a);
        System.out.println("main() a = " + a);

    }

    public static void checkString(String str) {
        str = "Pooja";
        System.out.println("Pooja hash " + str.hashCode());
        System.out.println("checkString() str = " + str);
    }

    public static void checkInt(int a) {
        a = 50;
        System.out.println("checkInt() a = " + a);
    }

    
    
}
