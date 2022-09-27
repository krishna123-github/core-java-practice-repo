/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I18N;
 
import java.text.DateFormat;
import java.util.*;

public class InternationalizingTime {
    static void print(Locale locale){
         DateFormat dataFormat= DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
         Date currentDate = new Date();
         
         String time = dataFormat.format(currentDate);
         
         System.out.println(time+"     "+ locale);
    }
   
    public static void main(String[] args) {
        print(Locale.FRENCH);
        print(Locale.JAPAN);
        print(Locale.ROOT);
    }
    
}
