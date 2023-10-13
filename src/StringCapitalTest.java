/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * [15:00] Chandan Kumar
    Write a function that will capitalize the first letter of each word in a text
 

 * @author krishna
 */
public class StringCapitalTest {
    public static void main(String[] args) {
        System.out.println(capitalizeWord("hello buddy welcome"));
    }
    
    private static String capitalizeWord(String str){
        if(str == null || str.isEmpty()){
            return null;
        }
        String[] strArr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s : strArr){
            String s1 = s.substring(0, 1);
            String s2 = s.substring(1);
//            char c = s.charAt(0);
//            if(c > 90){
//                int i = c -32;
//            }
//            s = s.replaceFirst("", Character.toString(char(i)));
            sb.append(s1.toUpperCase() +""+ s2);
            sb.append(" ") ;
        }
        
        
        return sb.toString();
    }
}
