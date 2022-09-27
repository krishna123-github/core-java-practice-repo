 
package I18N;
 /**
    We can internationalize the date by using the getDateInstance() method of the DateFormat class. 
  * It receives the locale object as a parameter and returns the instance of the DateFormat class.
  */
import java.text.DateFormat;
import java.util.*;
public class InternationalizationDate {
 
    static void print(Locale locale){
        DateFormat formatter=DateFormat.getDateInstance(DateFormat.DEFAULT,locale); 
        Date currentDate =  new Date();
        String date =formatter.format(currentDate);
        
        System.out.println(date+"      "+locale);
        
    }
    
    
    public static void main(String[] args) {
        print(Locale.FRENCH);
        print(Locale.CHINA);
    }
    
}
