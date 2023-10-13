/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author krishna
 */
public class Convert_stringToUppercase {
    public static void main(String[] args) {
        String str = "krishna";
        convertWithoutUsingStringFunction(str);
        
        convertUsingStringFunction(str);
    }
    
    private static void convertWithoutUsingStringFunction(String str){
        // asscci code A-Z  65-90
        // aascci code a-z  97-122
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            System.out.println(c);
            
            int upperCase = c - 32;
            System.out.println(upperCase +"   "+ (char)upperCase );
            
        }
    } 
    private static void convertUsingStringFunction(String str){
        String s = str.toUpperCase();
        System.out.println(s);
    }
}
